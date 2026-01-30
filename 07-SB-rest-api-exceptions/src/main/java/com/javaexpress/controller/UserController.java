package com.javaexpress.controller;

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

import com.javaexpress.dto.UserDto;
import com.javaexpress.models.User;
import com.javaexpress.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.models.annotations.OpenAPI30;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)//201
	@Operation(description = "create a new user in db")
	public UserDto createUser(@Valid @RequestBody UserDto userDto) {
		log.info("UserController::CreateUser{}",userDto.getEmailAddress());
		return userService.save(userDto);
	}
	
	@GetMapping("/{userId}")
	public User fetchUser(@PathVariable Integer userId) {
		log.info("UserController::fetchUser{}",userId);
		return userService.findby(userId);
	}
	
	@PutMapping("{userId}")
	public User update(@PathVariable Integer userId,@RequestBody User user) {
		log.info("UserController::update{}{}",userId,user.getEmail());
		return userService.update(userId, user);
	}
	
	@DeleteMapping("{userId}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)//204
	public void delete(@PathVariable Integer userId) {
		log.info("UserController::delete{}",userId);
		userService.deleteBy(userId);
	}

}
