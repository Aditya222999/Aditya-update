package com.javaexpress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaexpress.models.User;
import com.javaexpress.service.UserService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private UserService userservice;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User user = new User();
		user.setUserId(2);
		user.setFirstName("yuva");
		user.setLastName("chandaka");
		user.setEmail("yuva@gmail.com");
		user.setPhone("8499992262");
		//userservice.save(user);
		//userservice.update(2, user);
		User dbUser = userservice.findby(11);
		System.out.println(dbUser.getEmail());
	}

}
