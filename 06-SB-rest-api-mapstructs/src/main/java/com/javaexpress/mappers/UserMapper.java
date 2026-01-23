package com.javaexpress.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.javaexpress.dto.UserDto;
import com.javaexpress.models.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

	@Mapping(source = "firstName",target = "fName")
	@Mapping(source = "lastName",target = "lName")
	@Mapping(source = "email",target = "emailAddress")
	
	UserDto toDto(User user);
	
	@Mapping(source = "fName",target = "firstName")
	@Mapping(source = "lName",target = "lastName")
	@Mapping(source = "emailAddress",target = "email")
	User toEntiUser(UserDto userDto);
}
