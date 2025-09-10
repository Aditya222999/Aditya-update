package com.javaexpress.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexpress.models.User;
import com.javaexpress.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findById(Integer userId) {
		// TODO Auto-generated method stub
		Optional<User> optional = userRepository.findById(userId);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			throw new RuntimeException("User Not found in DB");
		}
	}

	@Override
	public User update(Integer userId, User user) {
		User dbUser = findById(userId);
		dbUser.setFirstName(user.getFirstName());
		dbUser.setLastName(user.getLastName());
		dbUser.setEmail(user.getEmail());
		
		userRepository.save(dbUser);//updating db record 
		
		return dbUser;
	}

	@Override
	public User deleteBy(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}
}
