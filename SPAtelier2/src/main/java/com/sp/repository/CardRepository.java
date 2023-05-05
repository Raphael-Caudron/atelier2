package com.sp.repository;

import org.springframework.data.repository.CrudRepository;
import com.sp.model.Card;

public interface CardRepository extends CrudRepository<Card, Integer> {
	
	public Iterable<Card> findByName(String name);
	
	public Iterable<Card> findBySuperPowerName(String superPowerName);
}
