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
	int m3;
	int m4;


	int a1;
	
	int a2;
	
	int c1;


	public static void main(String[] args) {
		System.setProperty("Log4jContextSelector", "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
		SpringApplication.run(NnUserApplication.class, args);
	}
	
	void a1() {
		
	}
	
	void a2() {
		
	}
}
