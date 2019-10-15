package com.twf.rabbit;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(bindings=@QueueBinding(
		value=@Queue(value="${mq.config.queue.info}",autoDelete="true"),      // 队列
		exchange = @Exchange(value="${mq.config.exchange}",type=ExchangeTypes.DIRECT),  // 交换器
		key="${mq.config.queue.info.routing.key}"))  // 路由键
public class InfoReceiver {

	@RabbitHandler
	public void process(String msg) {
		System.out.println("接收到info日志:" + msg);
	}
}
