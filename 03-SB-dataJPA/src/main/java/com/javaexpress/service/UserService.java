package com.javaexpress.service;

import com.javaexpress.models.User;

public interface UserService {
	
	User save (User user);
	User findby(Integer userId);
	User update (Integer userId,User user);
	void deleteBy (Integer userId);
	

}
