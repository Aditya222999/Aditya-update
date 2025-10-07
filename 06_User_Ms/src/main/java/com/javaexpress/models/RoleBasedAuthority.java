package com.javaexpress.models;

public enum RoleBasedAuthority {
	
	ROLE_USER("USER");
	//ROLE_USER("ADMIN");
	
	private final String role;
	
	private String getRole() {
		return role;
	}
	private RoleBasedAuthority(String role) {
		this.role = role;
	}

}
