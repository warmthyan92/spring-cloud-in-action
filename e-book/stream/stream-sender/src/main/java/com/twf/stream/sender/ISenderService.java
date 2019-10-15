package com.twf.stream.sender;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface ISenderService {

	@Output("twf-exchange")
	SubscribableChannel send();
}
