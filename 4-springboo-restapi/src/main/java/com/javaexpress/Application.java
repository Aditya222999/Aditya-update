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
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User user = new User();
		//user.setUserId(2);
		user.setFirstName("pandu");
		user.setLastName("chandaka");
		user.setEmail("pandu@gmail.com");
		user.setPhoneNumber("8499998557");
		
		//userService.save(user);
		//userService.update(2, user);
		//User dbuser = userService.findById();
		//System.out.println(dbuser.getEmail());
		
		userService.deleteBy(1);
	}

}
