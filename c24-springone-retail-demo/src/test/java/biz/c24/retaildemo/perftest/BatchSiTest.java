package biz.c24.retaildemo.perftest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.integration.endpoint.SourcePollingChannelAdapter;

import biz.c24.retaildemo.si.ThroughputMonitoringOutboundAdapter;


public class BatchSiTest {

    @Bean(name="persistReceipts")
    public ThroughputMonitoringOutboundAdapter getOutboundAdapter() {
    	return new ThroughputMonitoringOutboundAdapter(100000);
    }
    
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext parentContext = new AnnotationConfigApplicationContext(IndividualFileXmlReceiptTest.class);
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.setParent(parentContext);
        context.load("classpath:receipts/receipt-batch-si-config.xml");
        context.refresh();
        
        
                
        SourcePollingChannelAdapter adapter = context.getBean("filePoller", SourcePollingChannelAdapter.class);
        adapter.start();

        
        Thread.sleep(15000);
        
        adapter.stop();
        context.stop();
        System.exit(0);
        
    }
}
