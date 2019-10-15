package com.twf.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductSender {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${mq.config.exchange}")
	private String exchange;
	
	public void send() {
		this.amqpTemplate.convertAndSend(this.exchange,"product.log.debug", "product.log.debug...");
		this.amqpTemplate.convertAndSend(this.exchange,"product.log.info", "product.log.info...");
		this.amqpTemplate.convertAndSend(this.exchange,"product.log.warn", "product.log.warn...");
		this.amqpTemplate.convertAndSend(this.exchange,"product.log.error", "product.log.error...");

	}
}
