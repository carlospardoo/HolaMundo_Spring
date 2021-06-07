package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Nota;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.service.impl.NotaServiceImpl;
import com.example.demo.service.impl.RoleServiceImpl;
import com.example.demo.service.impl.UserServiceImpl;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

@Bean //Se ejecuta siempre al inicio. Precarga
public CommandLineRunner initApp(UserServiceImpl userService, RoleServiceImpl roleService, NotaServiceImpl notaService){
	return args -> {
		System.out.println("Hola Mundo en Spring");

		Role usuario = new Role();
		Role admin = new Role();


		usuario.setDescription("description");
		usuario.setName("Usuario");

		admin.setDescription("description 2");
		admin.setName("Admin");

		usuario = roleService.save(usuario);
		admin = roleService.save(admin);

		/* */

		User usuario1 = new User();
		usuario1.setName("Carlos");
		usuario1.setColor("Negro");
		usuario1.setPassword("123");
		usuario1.setUsername("username");

		User savedUser = userService.alterSave(usuario1);

		Nota nota = new Nota();
		nota.setContenido("Habia una vez un barco chiquito");
		nota.setTitulo("Historia");
		nota.setUser(savedUser);
		notaService.save(nota);
	};
}

}
