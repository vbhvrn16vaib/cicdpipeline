package com.example.cicdexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdexampleApplication.class, args);
	}

	@GetMapping("/")
	public String getHello(){
		return "Ci Cd deployment";
	}

}
