package com.sp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sp.model.User;

//import com.sp.model.Auth;

@Service
public class AuthentificationService {
	
	@Autowired
	UserService uService;
	
	public void login(User user) {
		//uService.getUser(user);
	}

}
