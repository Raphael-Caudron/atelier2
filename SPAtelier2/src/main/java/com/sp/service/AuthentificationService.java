package com.sp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sp.model.User;

import com.sp.service.UserService;

@Service
public class AuthentificationService {
	
	@Autowired
	UserService uService;
	
	public String login(User user) {
		uService.getUserId(user);
		return "bonjour";
	}

}
