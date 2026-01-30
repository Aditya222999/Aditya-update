package com.javaexpress.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserDto {
	
	private Integer userId;
	@Size(min=3,max =20,message="Name must be between 3 and 20 characters")
	private String fName;
	
	private String lName;
	private String emailAddress;
	private String phone;

}
