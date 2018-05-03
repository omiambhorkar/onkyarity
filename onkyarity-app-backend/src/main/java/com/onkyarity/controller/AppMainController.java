package com.onkyarity.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppMainController {

	public static void main(String[] args) {
		SpringApplication.run(AppMainController.class, args);
	}
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome Gradle";
	}

}
