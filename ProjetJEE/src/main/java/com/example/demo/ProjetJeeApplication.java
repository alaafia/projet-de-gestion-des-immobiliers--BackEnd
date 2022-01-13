package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@ComponentScan({"com.example.demo"})
public class ProjetJeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetJeeApplication.class, args);
	}

}
