package com.learnmicro.neflixeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NeflixEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeflixEurekaNamingServerApplication.class, args);
	}

}
