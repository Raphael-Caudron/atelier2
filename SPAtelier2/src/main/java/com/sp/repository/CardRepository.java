package com.sp.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.sp.model.Card;

public interface CardRepository extends CrudRepository<Card, Integer> {
	
	public List<Card> findByName(String name);
	
	public Card findById(int id);
	
	public Card save(Card c);
}
