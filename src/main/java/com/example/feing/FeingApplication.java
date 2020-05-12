package com.example.feing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeingApplication.class, args);
	}

}
