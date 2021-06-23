package com.everis.movementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovementserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovementserviceApplication.class, args);
	}

}
