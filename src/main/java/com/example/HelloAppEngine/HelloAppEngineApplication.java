package com.example.HelloAppEngine;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloAppEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloAppEngineApplication.class, args);
	}
	
	@GetMapping("/")
    public String hello() {
        return "Hello World!";
    }
	
	@GetMapping("/time")
    public String time() {
        return Calendar.getInstance().getTime().toString();
    }

}
