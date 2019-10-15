package com.twf.sleuth.zipkin.mq.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableZipkinStreamServer // 开启Zipkin通过消息中间件方式收集链路跟踪信息功能
public class ZipkinMQApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinMQApplication.class, args);
	}
}
