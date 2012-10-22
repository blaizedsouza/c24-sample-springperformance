/*
 * Copyright 2012 C24 Technologies.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), 
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL C24 TECHNOLOGIES BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE 
 * SOFTWARE.
 * 
 */
package biz.c24.springone;

import java.text.DecimalFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.core.PollableChannel;
import org.springframework.integration.support.MessageBuilder;

/**
 * Time latency associated with initiating and consuming from an SI flow
 * 
 * @author Andrew Elmore
 *
 */
@MessageEndpoint
public class TestEntryCost {

    public static long execute(MessageChannel input, PollableChannel output) {
    	
        long startTime = System.nanoTime();
        
        input.send(MessageBuilder.withPayload("Test Message").build());
        
        Message<String> msg = (Message<String>)output.receive();
        
        return System.nanoTime() - startTime; 
    }
    
    
    
    private static long WARMUP_SECS = 5;
    private static long RUN_SECS = 5;
    
 
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        
        PollableChannel output = context.getBean("output", PollableChannel.class);
        
        // Run WarmUp
        long stopTime = System.currentTimeMillis() + (WARMUP_SECS * 1000);
        while(System.currentTimeMillis() < stopTime) {
            execute(output, output);
        }
        
        // Now run the actual test
        
        long cumulativeProcessingTime = 0;
        long numMessages = 0;
        long startTime = System.nanoTime();
        stopTime = System.currentTimeMillis() + (RUN_SECS * 1000);
        
        while(System.currentTimeMillis() < stopTime) {
            cumulativeProcessingTime += execute(output, output);
            numMessages++;
        }
        
    	DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println("Throughput (msg/sec): " + df.format(numMessages / ((System.nanoTime() - startTime)/(double)1000000000)));
        System.out.println("Mean Latency (us): " + df.format((cumulativeProcessingTime/1000) / (double)numMessages));
        
    }
    
}
