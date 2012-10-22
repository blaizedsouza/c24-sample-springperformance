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
package biz.c24.retaildemo.si;

import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.handler.AbstractMessageHandler;

/**
 * Simple OutboundAdapter which calculates throughput and discards the message.
 * Throughput is logged to the System out stream after each 'threshold' messages.
 * 
 * @author Andrew Elmore
 *
 */
public class ThroughputMonitoringOutboundAdapter extends AbstractMessageHandler implements MessageChannel {

    private AtomicInteger count = new AtomicInteger(0);
    private long lastTime = System.currentTimeMillis();
    private int lastCount = 0;
    private long initTime = System.currentTimeMillis();
    private int threshold;
    
    public ThroughputMonitoringOutboundAdapter(int threshold) {
    	this.threshold = threshold;
    }

	
	@Override
	protected void handleMessageInternal(Message<?> message) {
        int curr = count.incrementAndGet();
        
        if(curr % threshold == 0) {
        	long elapsedTime = (System.currentTimeMillis() - initTime);
        	DecimalFormat df = new DecimalFormat("#0.00");
        	System.out.println("[" + curr + " @ " + elapsedTime + "ms] Throughput (msgs/s): " + df.format((curr - lastCount) / ((System.currentTimeMillis() - lastTime)/(double)1000)));
            lastTime = System.currentTimeMillis();
            lastCount = curr;
        }
	}


	public boolean send(Message<?> message) {
		handleMessageInternal(message);
		return true;
	}


	public boolean send(Message<?> message, long timeout) {
		handleMessageInternal(message);
		return true;
	}

}
