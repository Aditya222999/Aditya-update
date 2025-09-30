package com.javaexpress.controllers;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.javaexpress.DTO.UserDto;
import com.javaexpress.models.User;
import com.javaexpress.service.UserService;



@RestController
@RequestMapping("/api/users")
public class UserController {

	Logger log =  LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)//201
	public UserDto createUser(@RequestBody UserDto userDto) {
		log.info("UserController::createUser",userDto.getEmailAddress());
		return userService.save(userDto);
	}

	@GetMapping("{userId}")
	public User fetchUser(@PathVariable Integer userId) {
		log.info("UserController::fetchUser",userId);
		return userService.findById(userId);

	}

	@PutMapping("{userId}")
	public User update(@PathVariable Integer userId,@RequestBody User inputUser) {
		log.info("UserController::update",userId);
		return userService.update(userId, inputUser);
	}
	@DeleteMapping("{userId}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer userId) {
		log.info("UserController::delete",userId);
		userService.deleteBy(userId);
	}

}
