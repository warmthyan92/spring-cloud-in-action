package com.twf.sleuth.zipkin.mysql.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableZipkinStreamServer // 开启Zipkin通过消息中间件方式收集链路跟踪信息功能
public class ZipkinMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinMysqlApplication.class, args);
	}
} 
