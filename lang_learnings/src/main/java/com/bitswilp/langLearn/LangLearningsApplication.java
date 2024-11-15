package com.bitswilp.langLearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LangLearningsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LangLearningsApplication.class, args);
	}

}
