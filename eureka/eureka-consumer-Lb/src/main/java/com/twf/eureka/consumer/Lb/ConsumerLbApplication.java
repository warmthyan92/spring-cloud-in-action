package com.twf.eureka.consumer.Lb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConsumerLbApplication {

//	@Bean
//	public IRule ribbonRule() {  // 配置负载均衡策略
//		return new RandomRule(); // 这里配置的是随机策略
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerLbApplication.class, args);
	}
}
