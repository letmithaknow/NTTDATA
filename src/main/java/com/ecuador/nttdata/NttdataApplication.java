package com.ecuador.nttdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NttdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttdataApplication.class, args);
		
		System.out.println("Server Started Successfully...");
	}

}
