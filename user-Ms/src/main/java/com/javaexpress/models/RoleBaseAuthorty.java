package com.javaexpress.models;

public enum RoleBaseAuthorty {

	ROLE_USER("USER"),
	ROLE_ADMIN("ADMIN");

	private final String role;

	private RoleBaseAuthorty(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}
  
	


}
