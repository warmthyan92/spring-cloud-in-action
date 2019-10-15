package com.twf.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sender {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${mq.config.exchange}")
	private String exchange;
	
	public void send(int i) {
		String msg="hello:" + i;
		// 如果消息拥有的路由键跟队列和交换器的路由键匹配，那么消息就会被路由到该绑定的队列当中去
		this.amqpTemplate.convertAndSend(this.exchange,"log.error.routing.key", msg);
		System.out.println(msg);
	}
}
