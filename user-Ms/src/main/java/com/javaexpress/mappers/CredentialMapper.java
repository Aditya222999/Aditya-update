package com.javaexpress.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.javaexpress.dto.CredentialDto;
import com.javaexpress.models.Credential;

@Mapper(componentModel = "spring")
public interface CredentialMapper {
	
	
	
	CredentialDto toDto(Credential credential);
	
	
	

}
