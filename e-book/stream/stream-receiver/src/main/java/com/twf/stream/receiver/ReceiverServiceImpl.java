package com.twf.stream.receiver;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@EnableBinding({IReceiverService.class})
public class ReceiverServiceImpl {

	@StreamListener("twf-exchange")
	public void onReceiver(byte[] msg){
		System.out.println("receive:" + new String(msg));
	}
}
