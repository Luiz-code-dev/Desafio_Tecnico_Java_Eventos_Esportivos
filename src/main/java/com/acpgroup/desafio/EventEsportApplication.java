package com.acpgroup.desafio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.acpgroup.desafio")
public class EventEsportApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EventEsportApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		}

}
