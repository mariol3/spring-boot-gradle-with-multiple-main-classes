package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppA {

	public static void main(String[] args) {
		SpringApplication.run(AppA.class, args);

		System.out.println("AppA here!!");
	}

}
