package com.twf.e.book.consumer.hystrix.turbine.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;


@SpringBootApplication
@EnableTurbineStream
public class HystrixTurbineMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixTurbineMqApplication.class, args);
	}
}
