package com.sp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.model.User;
import com.sp.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository uRepository;
	
	
	public void addUser(User u) {
		User createdUser=uRepository.save(u);
		// Liste de 5 entiers = CardService.gene5cartes()
		// Set l'attribut idList de User (vide de base)
		System.out.println(createdUser);
	}
	
	public int getUserId(User u) {
		String username = u.getUsername();
		User myuser = uRepository.findByUsername(username);
		if (myuser != null) {
			return myuser.getId();
		}
		else {
			return -1;
		}
	}

	public int getWallet(User u) {
		String username = u.getUsername();
		User myuser = uRepository.findByUsername(username);
		return myuser.getWallet();
	}
	
	public void changeWallet(User u, int amount) {
		String username = u.getUsername();
		User myuser = uRepository.findByUsername(username);
		myuser.setWallet(amount);
	}
	
}