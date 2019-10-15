package com.twf.stream.partition.sender;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface ISenderService {

	String OUTPUT="outputProduct";
	
	@Output(OUTPUT)
	SubscribableChannel send();
}
