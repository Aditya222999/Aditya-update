package com.javaexpress.dto;

import com.javaexpress.models.RoleBaseAuthorty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CredentialDto { 
	
	private String userName;
	private String password;
	private RoleBaseAuthorty roleBaseAuthorty;

}
