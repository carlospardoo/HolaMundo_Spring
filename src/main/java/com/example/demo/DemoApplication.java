package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Role;
import com.example.demo.service.impl.RoleServiceImpl;
import com.example.demo.service.impl.UserServiceImpl;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

@Bean //Se ejecuta siempre al inicio. Precarga
public CommandLineRunner initApp(UserServiceImpl userService, RoleServiceImpl roleService){
	return args -> {
		System.out.println("Hola Mundo en Spring");

		Role usuario = new Role();
		Role admin = new Role();


		usuario.setDescription("description");
		usuario.setName("Usuario");

		admin.setDescription("description 2");
		admin.setName("Admin");
		

		usuario = roleService.save(usuario);
		admin = roleService.save(usuario);
	};
}

}
