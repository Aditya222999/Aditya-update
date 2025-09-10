package com.javaexpress.service;

import com.javaexpress.models.User;

public interface UserService {
	
	User save(User user);
	User findById(Integer userId);
	User update(Integer userId,User user);
	User deleteBy(Integer userId);

}
