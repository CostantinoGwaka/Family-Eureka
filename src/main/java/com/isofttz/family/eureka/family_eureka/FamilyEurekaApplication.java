package com.isofttz.family.eureka.family_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FamilyEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyEurekaApplication.class, args);
	}

}
