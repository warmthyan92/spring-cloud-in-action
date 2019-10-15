package com.twf.zuul.gateway.timeout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulTimeoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulTimeoutApplication.class, args);
	}
}
