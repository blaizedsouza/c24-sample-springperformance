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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.MessageHandlingException;
import org.springframework.integration.MessagingException;
import org.springframework.integration.support.MessageBuilder;

/*
 * Simple Splitter that takes a Message with payload of type File.
 * Each time a line matching the supplied regex is encountered, the file
 * is split with the matching line forming the first line of the new message.
 * Messages are sent to the specified destination channel as they are parsed
 * 
 * @author Andrew Elmore
 * 
 */
public class StructuredFileSplittingService {
	
	private Pattern msgStartPattern;
	private String lineTerminator = System.getProperty("line.separator");
	private MessageChannel destination;
	
	
	
	public StructuredFileSplittingService(String msgStartRegex, MessageChannel destination) {
		this.msgStartPattern = Pattern.compile(msgStartRegex);
		this.destination = destination;
	}


	public void split(Message<?> msg) throws MessagingException {
		File file = (File)msg.getPayload();
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			// Split the file into a collection of Strings - one per message
			Collection<String> msgs = new LinkedList<String>();
			StringBuffer currentMessage = null;
			
			// Read through the file
			while(reader.ready()) {
				String line = reader.readLine();
				Matcher m = msgStartPattern.matcher(line);
				if(m.matches()) {
					// We've encountered a line which matches our message start pattern
					// Dump out the current message
					if(currentMessage != null) {
						destination.send(MessageBuilder.withPayload(currentMessage.toString()).build());
					}
					// Reset the StringBuffer ready for the next message
					currentMessage = new StringBuffer();
				}
				if(currentMessage != null) {
					currentMessage.append(line);
					currentMessage.append(lineTerminator);
				}
			}
			
			// Ensure we write out the last message
			if(currentMessage != null && currentMessage.length() > 0) {
				destination.send(MessageBuilder.withPayload(currentMessage.toString()).build());
			}
			
			
		} catch (FileNotFoundException fnfEx) {
			throw new MessageHandlingException(msg, fnfEx);
		} catch(IOException iEx) {
			throw new MessageHandlingException(msg, iEx);			
		}
	}

	public MessageChannel getDestination() {
		return destination;
	}

	public void setDestination(MessageChannel destination) {
		this.destination = destination;
	}



}
