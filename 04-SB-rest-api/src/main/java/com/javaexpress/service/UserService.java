package com.javaexpress.service;

import org.springframework.stereotype.Service;

import com.javaexpress.models.User;
@Service
public interface UserService {
	
	User save (User user);
	User findby(Integer userId);
	User update (Integer userId,User user);
	void deleteBy (Integer userId);

}
