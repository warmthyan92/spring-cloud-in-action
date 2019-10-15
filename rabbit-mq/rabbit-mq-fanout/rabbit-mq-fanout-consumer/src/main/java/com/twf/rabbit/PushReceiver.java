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
		value=@Queue(value="${mq.config.queue.push}",autoDelete="true"),      // 队列
		exchange = @Exchange(value="${mq.config.exchange}",type=ExchangeTypes.FANOUT)  // 交换器
		))  // 路由键
public class PushReceiver {

	@RabbitHandler
	public void process(String msg) {
		System.out.println("push处理:" + msg);
	}
}
