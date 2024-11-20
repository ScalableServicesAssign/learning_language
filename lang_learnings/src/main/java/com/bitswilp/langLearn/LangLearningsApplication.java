package com.bitswilp.langLearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(
	    info = @Info(
	        title = "Language learn Microservice Swagger",
	        version = "v1",
	        description = "API documentation for My Microservice"
	    )
	)
public class LangLearningsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LangLearningsApplication.class, args);
	}

}
