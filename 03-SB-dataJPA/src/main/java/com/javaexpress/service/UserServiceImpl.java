package com.javaexpress.service;

import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexpress.models.User;
import com.javaexpress.repository.UserRepositroty;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepositroty userRepositroty;

	@Override
	public User save(User user) {
		
		return userRepositroty.save(user);
	}

	@Override
	public User findby(Integer userId) {
		Optional<User> optional = userRepositroty.findById(userId);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			throw new RuntimeException("User Not Found in DB");
		}
	}
	
	public User findbyJava8(Integer userId) {
		return userRepositroty.findById(userId)
				.orElseThrow(() -> new RuntimeException("User Not found in Db"));
	}

	@Override
	public User update(Integer userId, User user) {
		User dbUser = findby(userId);
		
		dbUser.setFirstName(user.getFirstName());
		dbUser.setLastName(user.getLastName());
		dbUser.setEmail(user.getEmail());
		
		userRepositroty.save(dbUser);
		return dbUser;
	}

	@Override
	public void deleteBy(Integer userId) {
		

	}

}
