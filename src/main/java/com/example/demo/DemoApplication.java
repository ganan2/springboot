package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example.demo")
public class DemoApplication {

	public static void main(String[] args) {
//		System.setProperty("spring.devtools.restart.enabled", "true");
//		System.setProperty(spring.devtools.restart.exclude, static/**,public/**)
		SpringApplication.run(DemoApplication.class, args);
	}
}
