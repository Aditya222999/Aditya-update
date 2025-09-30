package com.javaexpress.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Data
public class UserDto {
	
	private Integer userId;
	private String fName;
	private String lName;
	private String emailAddress;
	private String phoneN;
	
}
