package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NnUserApplication {

	int b1;
	
	int m1;
	int m2;
	public static void main(String[] args) {
		SpringApplication.run(NnUserApplication.class, args);
	}
}
