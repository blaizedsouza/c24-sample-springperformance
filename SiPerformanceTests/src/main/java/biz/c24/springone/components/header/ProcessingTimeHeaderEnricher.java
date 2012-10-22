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
package biz.c24.springone.components.header;


import java.util.HashMap;
import java.util.Map;

import org.springframework.integration.Message;
import org.springframework.integration.handler.AbstractReplyProducingMessageHandler;
import org.springframework.integration.support.MessageBuilder;

/**
 * Simple MessageHandler to add a processingTime header
 * 
 * @author Andrew Elmore
 *
 */
public class ProcessingTimeHeaderEnricher extends AbstractReplyProducingMessageHandler {

    @Override
    protected Object handleRequestMessage(Message<?> requestMessage) {
        Map<String, Object> map = new HashMap<String, Object>(requestMessage.getHeaders());
        map.put("processingTime", System.nanoTime() - (Long)map.get("startTime")); 
        return MessageBuilder.withPayload(requestMessage.getPayload()).copyHeaders(map).build();
    }

}