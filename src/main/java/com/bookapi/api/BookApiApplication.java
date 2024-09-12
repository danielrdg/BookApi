package com.bookapi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.bookapi.api")
public class BookApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApiApplication.class, args);
	}

}