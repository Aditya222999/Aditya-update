package com.javaexpress.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.javaexpress.controller.UserController;

@RestControllerAdvice
public class GlobalExceptionHandelar  {
	Logger log = LoggerFactory.getLogger(UserController.class);
	
	@ExceptionHandler(UserNotFoundException.class)
	public void handelException(UserNotFoundException ex) {
		log.error("UserNot Found Exception {}",ex.getMessage());
		
		ErrorAPI errorAPI = new ErrorAPI();
		errorAPI.setLocalDateTime(null);
		errorAPI.setMessage(null);
		errorAPI.setStatus(null);
		
	}
	
	public void handelException(Exception ex) {
		
	}
	
	

}
