package com.twf.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@RabbitListener(queues="hello-twf-queue")
	public void process(String msg) {
		System.out.println("receiver:" + msg);
	}
}
