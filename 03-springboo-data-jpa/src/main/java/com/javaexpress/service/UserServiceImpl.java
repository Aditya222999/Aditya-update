package com.javaexpress.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexpress.DTO.UserDto;
import com.javaexpress.models.User;
import com.javaexpress.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto save(UserDto userDto) {
		// TODO Auto-generated method stub
		log.info("UserController :: UserServiceImpl{}",userDto.getEmailAddress());
		User user = new User();
		user.setEmail(userDto.getEmailAddress());
		user.setFirstName(userDto.getFName());
		user.setLastName(userDto.getLName());
		user.setPhoneNumber(user.getPhoneNumber());
		
		User DbUser = userRepository.save(user);
		
		UserDto result = new UserDto();
		result.setEmailAddress(DbUser.getEmail());
		result.setFName(DbUser.getFirstName());
		result.setLName(DbUser.getLastName());
		result.setPhoneN(DbUser.getPhoneNumber());
		result.setUserId(DbUser.getUserId());
		
		return result;
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
