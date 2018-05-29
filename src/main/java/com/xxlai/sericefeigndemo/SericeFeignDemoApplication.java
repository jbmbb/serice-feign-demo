package com.xxlai.sericefeigndemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// 开启Feign的功能
@EnableFeignClients
@SpringBootApplication
public class SericeFeignDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SericeFeignDemoApplication.class, args);
	}
}
