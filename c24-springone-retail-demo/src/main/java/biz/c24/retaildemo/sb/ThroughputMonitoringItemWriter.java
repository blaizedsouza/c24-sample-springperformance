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
package biz.c24.retaildemo.sb;

import java.text.DecimalFormat;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.batch.item.ItemWriter;

/**
 * Simple ItemWriter implementation to periodically calculate throughput and write the current figure to the System out stream
 * 
 * @author Andrew Elmore
 *
 */
public class ThroughputMonitoringItemWriter implements ItemWriter<Object>{

    private AtomicInteger count = new AtomicInteger(0);
    private long lastTime = System.currentTimeMillis();
    private int lastCount = 0;
    private long initTime = System.currentTimeMillis();
    private int threshold;
    
    public ThroughputMonitoringItemWriter(int threshold) {
    	this.threshold = threshold;
    }

	
	public void write(List<? extends Object> items) throws Exception {
 
        int num = items.size();
        int curr = count.getAndAdd(num);
        
        if((curr % threshold) + num >= threshold) {
        	long elapsedTime = (System.currentTimeMillis() - initTime);
        	DecimalFormat df = new DecimalFormat("#0.00");
        	System.out.println("[" + (curr+num) + " @ " + elapsedTime + "ms] Throughput (msgs/s): " + df.format((curr - lastCount) / ((System.currentTimeMillis() - lastTime)/(double)1000)));
            lastTime = System.currentTimeMillis();
            lastCount = curr;
        }
	}


}
