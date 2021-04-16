package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

@Bean //Se ejecuta siempre al inicio. Precarga
public CommandLineRunner initApp(){
	return args -> {
		System.out.println("Hola Mundo en Spring");
	};
}

}
