package com.javaexpress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexpress.dto.UserDto;
import com.javaexpress.mappers.UserMapper;
import com.javaexpress.models.Credential;
import com.javaexpress.models.User;
import com.javaexpress.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserDto save(UserDto userDto) {
		User user = userMapper.toEntity(userDto);
		Credential credential = user.getCredential();
		//BiDirectional 
		credential.setUser(user);
		//ToDo :we are proveding original password in db but we need to store encoded password
		User dbUser = userRepository.save(user);
		return userMapper.toDto(dbUser);
		
	}

	@Override
	public UserDto findById(Integer userId) {
		return userRepository.findById(userId).map(userMapper::toDto)
				   .orElseThrow(() -> new RuntimeException("User Not found in Db"));
	}

	@Override
	public UserDto update(Integer userId, UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

}

