package com.javaexpress.service;

import com.javaexpress.dto.UserDto;
import com.javaexpress.models.User;

public interface UserService {
	
	UserDto save (UserDto userDto);
	User findById(Integer userId);
	User update (Integer userId,User user);
	void deleteBy(Integer userId);

}
