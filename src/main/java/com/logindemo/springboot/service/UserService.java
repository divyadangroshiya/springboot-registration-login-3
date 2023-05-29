package com.logindemo.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.logindemo.springboot.model.User;
import com.logindemo.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	
	User save(UserRegistrationDto registrationDto);

}
