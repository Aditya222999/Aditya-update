package com.javaexpress.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexpress.dto.UserDto;
import com.javaexpress.mappers.UserMapper;
import com.javaexpress.models.User;
import com.javaexpress.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserRepository userrepository;

	@Override
	public UserDto save(UserDto userDto) {
	
		//input data to entity
		User user = userMapper.toEntiUser(userDto);
		User dbUser = userrepository.save(user);
		
		//entity to Dto
		UserDto result = userMapper.toDto(dbUser);
		return result;
	}

	@Override
	public User findby(Integer userId) {
		// TODO Auto-generated method stub
		return userrepository.findById(userId)
				.orElseThrow(() -> new RuntimeException("User Not found in Db"));
	}

	@Override
	public User update(Integer userId, User user) {
		User dbUser = findby(userId);
		dbUser.setFirstName(user.getFirstName());
		dbUser.setLastName(user.getLastName());
		dbUser.setEmail(user.getEmail());
		dbUser.setPhone(user.getPhone());

		userrepository.save(dbUser);
		return dbUser;

	}

	@Override
	public void deleteBy(Integer userId) {
		User dbUser = findby(userId);
		userrepository.deleteById(userId);

	}

}
