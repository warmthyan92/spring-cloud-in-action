package com.twf.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrderSender {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${mq.config.exchange}")
	private String exchange;
	
	public void send() {
		this.amqpTemplate.convertAndSend(this.exchange,"order.log.debug", "order.log.debug...");
		this.amqpTemplate.convertAndSend(this.exchange,"order.log.info", "order.log.info...");
		this.amqpTemplate.convertAndSend(this.exchange,"order.log.warn", "order.log.warn...");
		this.amqpTemplate.convertAndSend(this.exchange,"order.log.error", "order.log.error...");
	}
}
