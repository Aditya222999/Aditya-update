package com.javaexpress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaexpress.models.User;
import com.javaexpress.service.UserService;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User user =new User();
		//user.setUserId(2);
		user.setFirstName("ganesh");
		user.setLastName("ch");
		user.setPhone("8499992262");
		user.setEmail("ganesh@gmail.com");
		
		//userService.save(user);
		//userService.update(2, user);
		User dbuser = userService.findById(1);
		System.out.println(dbuser.getEmail());
		
		
	}

}
