package com.javaexpress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaexpress.models.User;
import com.javaexpress.service.UserService;

@SpringBootApplication
public class Application  {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
