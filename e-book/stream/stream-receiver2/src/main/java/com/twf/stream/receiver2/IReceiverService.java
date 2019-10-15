package com.twf.stream.receiver2;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface IReceiverService {

	@Input("twf-exchange")
	SubscribableChannel receiver();
}
