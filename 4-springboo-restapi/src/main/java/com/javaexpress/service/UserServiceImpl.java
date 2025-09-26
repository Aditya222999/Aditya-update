package com.javaexpress.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexpress.models.User;
import com.javaexpress.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User findById(Integer userId) {
		// TODO Auto-generated method stub
		Optional<User> optional = userRepository.findById(userId);
		if(optional.isPresent()) {
		return optional.get();
		}else {
			throw new RuntimeException("User Not Found In DB");
		}
	}
	
	public User findByIdUserJava8(Integer userId) {
		return userRepository.findById(userId)
				.orElseThrow(() -> new RuntimeException("User Not found Exception"));
	}

	@Override
	public User update(Integer userId, User user) {
		User dbuser = findById(userId);
		dbuser.setFirstName(user.getFirstName());
		dbuser.setLastName(user.getLastName());
		dbuser.setEmail(user.getEmail());
		
		userRepository.save(dbuser);
		return dbuser;
	}

	@Override
	public void deleteBy(Integer userId) {
		userRepository.deleteById(userId);
		
	}

}
