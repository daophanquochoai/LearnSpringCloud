package com.learnmicro.currenceconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrenceConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrenceConversionServiceApplication.class, args);
	}

}
