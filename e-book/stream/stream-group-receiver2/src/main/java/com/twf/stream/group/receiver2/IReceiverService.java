package com.twf.stream.group.receiver2;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface IReceiverService {

	String INPUT="inputProduct";
	
	@Input(INPUT)
	SubscribableChannel receiver();
}
