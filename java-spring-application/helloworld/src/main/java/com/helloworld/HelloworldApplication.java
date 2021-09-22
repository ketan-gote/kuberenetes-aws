package com.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
	
	private static final String greetings = "<b>Welcome to HelloWorld v1</b>";
	
	@GetMapping("/")
	public ResponseEntity<String> greetings(){
		return new ResponseEntity<String>(greetings, HttpStatus.OK);
	}

}
