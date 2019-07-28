package com.npcgo.eureka.server.snoweurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SnowEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnowEurekaServerApplication.class, args);
	}

}
