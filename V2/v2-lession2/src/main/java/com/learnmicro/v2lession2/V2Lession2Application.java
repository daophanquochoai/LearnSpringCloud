package com.learnmicro.v2lession2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class V2Lession2Application {

	public static void main(String[] args) {
		SpringApplication.run(V2Lession2Application.class, args);
	}

}
