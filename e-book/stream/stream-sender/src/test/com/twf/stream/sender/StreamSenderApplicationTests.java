package com.twf.stream.sender;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=StreamSenderApplication.class)
public class StreamSenderApplicationTests {

	@Autowired
	private ISenderService sender;
	@Test
	public void send() {
		String msg = "twf..........";
		Message message = MessageBuilder.withPayload(msg.getBytes()).build();
		this.sender.send().send(message);
	}
}
