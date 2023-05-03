package com.sp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Card {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String superPowerName;
	private int superPowerValue;
	private int hp;
	private String description;
	private String imgUrl;
	
	public Card() {
		
	}
	
	public Card(int id, String name, String superPowerName, int superPowerValue, int hp, String description, String imgUrl) {
		this.id = id;
		this.name = name;
		this.superPowerName = superPowerName;
		this.superPowerValue = superPowerValue;
		this.hp = hp;
		this.description = description;
		this.imgUrl = imgUrl;
	}

}
