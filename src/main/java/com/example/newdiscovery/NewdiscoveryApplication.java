package com.example.newdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class NewdiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewdiscoveryApplication.class, args);
	}

}
