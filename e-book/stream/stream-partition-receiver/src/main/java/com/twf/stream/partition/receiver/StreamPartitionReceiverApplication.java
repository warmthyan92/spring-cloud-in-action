package com.twf.stream.partition.receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding({IReceiverService.class}) //用来指定一个或多个定义了@Input 或者 @Output注解的接口，实现对消息通道的绑定。IReceiverService接口是默认输入消息通道绑定接口
public class StreamPartitionReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamPartitionReceiverApplication.class, args);
	}
}
