package com.javaexpress.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserDto {
	
	private Integer userId; 
	private String fName;
	private String lName;
	private String emailAddress;
	private String phone;

}
