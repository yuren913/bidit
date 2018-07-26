package com.bidforyou.bidit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BiditApplication {

	public static void main(String[] args) {
		System.out.println("started");		
		SpringApplication.run(BiditApplication.class, args);
	}
}
