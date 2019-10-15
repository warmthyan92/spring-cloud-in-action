package com.twf.stream.group.receiver;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@EnableBinding({IReceiverService.class})
public class ReceiverServiceImpl {

	@StreamListener(IReceiverService.INPUT)
	public void onReceiver(Product obj){
		System.out.println("receive:" + obj.toString());
	}
}
