package com.sp.service;

import java.util.ArrayList;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.repository.CardRepository;

import antlr.collections.List;

import com.sp.model.Card;


@Service
@Transactional
public class CardService {
	@Autowired
	CardRepository cardRepo;
	
	public void addCard(Card card) {cardRepo.save(card);}
	
	public void addCards(Iterable<Card> cards) {cardRepo.saveAll(cards);}
	
	public Card getCard(int id) {
		Optional<Card> cOpt = cardRepo.findById(id);
		if (cOpt.isPresent()) {
			return cOpt.get();
		} else {
			return null;
		}
	}
	
	public Card getCard(String name) {
		Optional<Card> cOpt = cardRepo.findByName(name);
		if (cOpt.isPresent()) {
			return cOpt.get();
		} else {
			return null;
		}
	}
	
	public Iterable<Card> getCards(Iterable<Integer> listId) {return cardRepo.findAllById(listId);}
	
	public Iterable<Card> getAllCards(){return cardRepo.findAll();}
	
	public void delCard(int id) {cardRepo.deleteById(id);}
	
	public void delCard(Card c) {cardRepo.delete(c);}
}
