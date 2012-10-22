package biz.c24.retaildemo.perftest;

import java.text.DecimalFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.core.PollableChannel;
import org.springframework.integration.support.MessageBuilder;

@Configuration
public class XmlReceiptTest {
    
    @Bean(name="persistReceipts")
    public PollableChannel getPersistReceiptsChannel() {
        return new QueueChannel(1);
    }
    
    
    private static String xmlReceipt = "<receipt receiptId=\"2dac5d06-a02a-499e-aabd-82684bfb0093\" customerId=\"9389\" timestamp=\"2012-03-01T00:14:41\">" +
            "<item productId=\"286\" quantity=\"13\" price=\"51.87\"/>" + 
            "<item productId=\"287\" quantity=\"1\" price=\"3.99\"/>" + 
            "<item productId=\"353\" quantity=\"13\" price=\"51.87\"/>" + 
            "<item productId=\"348\" quantity=\"8\" price=\"32\"/>" + 
            "<item productId=\"414\" quantity=\"8\" price=\"207.04\"/>" + 
            "<item productId=\"203\" quantity=\"2\" price=\"13.0\"/>" + 
        "</receipt>";
    
    public static long execute(MessageChannel input, PollableChannel output) {
        long startTime = System.nanoTime();
        
        input.send(MessageBuilder.withPayload(xmlReceipt).build());
        
        Message<String> msg = (Message<String>)output.receive();
        
        return System.nanoTime() - startTime; 
    }    
    
    private static long WARMUP_SECS = 5;
    private static long RUN_SECS = 5;
 
    public static void main(String[] args) {
        ApplicationContext parentContext = new AnnotationConfigApplicationContext(XmlReceiptTest.class);
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.setParent(parentContext);
        context.load("classpath:receipts/receipt-format-xml.xml");
        context.refresh();
                
        MessageChannel input = context.getBean("inbound.receipt.xml", MessageChannel.class);
        PollableChannel output = context.getBean("persistReceipts", PollableChannel.class);
        
        // Run WarmUp
        long stopTime = System.currentTimeMillis() + (WARMUP_SECS * 1000);
        while(System.currentTimeMillis() < stopTime) {
            execute(input, output);
        }
        
        // Now run the actual test
        
        long cumulativeProcessingTime = 0;
        long numMessages = 0;
        long startTime = System.nanoTime();
        stopTime = System.currentTimeMillis() + (RUN_SECS * 1000);
        
        while(System.currentTimeMillis() < stopTime) {
            cumulativeProcessingTime += execute(input, output);
            numMessages++;
        }
        
    	DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println("Throughput (msg/sec): " + df.format(numMessages / ((System.nanoTime() - startTime)/(double)1000000000)));
        System.out.println("Mean Latency (us): " + df.format((cumulativeProcessingTime/1000) / (double)numMessages));
        
    }
    
}