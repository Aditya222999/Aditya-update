package com.javaexpress.service;

import org.springframework.stereotype.Service;

import com.javaexpress.dto.UserDto;
import com.javaexpress.models.User;
@Service
public interface UserService {
	
	UserDto save (UserDto userDto);
	User findby(Integer userId);
	User update (Integer userId,User user);
	void deleteBy (Integer userId);

}
