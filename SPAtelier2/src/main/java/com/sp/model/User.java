package com.sp.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	private String username;
	private String password;
	private int wallet;
	@ElementCollection
	private List<Integer> idList;


	public User() {}

	public User(int id,String username,String password) {
		this.id=id;
		this.username=username;
		this.password = password;
		this.wallet = 100;
	}

	// Getters and Setters //

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getWallet() {
		return wallet;
	}
	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Id:" + this.id + "Username ["+this.username+"]: Username:"+this.username+", Password:"+this.password+", Wallet:"+this.wallet;
	}


	public Iterable<Integer> getIdList() {
		return idList;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}


}
