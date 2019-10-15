package com.twf.stream.group.sender;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=StreamGroupSenderApplication.class)
public class StreamSenderApplicationTests {

	@Autowired
	private ISenderService sender;
	@Test
	public void send()  throws InterruptedException {
		Product obj=new Product();
		obj.setId(100);
		obj.setName("spring cloud");
		Message message=MessageBuilder.withPayload(obj).build();
		this.sender.send().send(message);
	}
}
