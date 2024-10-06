package com.example.cicddemo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.cicddemo.*")   
public class CicddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicddemoApplication.class, args);
	}

}
