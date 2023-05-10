package com.sp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.model.User;
import com.sp.service.UserService;

@RestController
public class UserRestControlleur {

    @Autowired
    UserService uService;
	
	@RequestMapping(method=RequestMethod.POST,value="/login")
	public void addUser(@RequestBody User user) {
		uService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/user")
	public void getUser(@RequestBody User user) {
		uService.getUserId(user);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/wallet")
	public void getWallet(@RequestBody User user) {
		uService.getWallet(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/wallet")
	public void changeWallet(@RequestBody User user, int amount) {
		uService.changeWallet(user, amount);
	}

}
