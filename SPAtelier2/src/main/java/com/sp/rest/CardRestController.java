package com.sp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.sp.model.Card;
import com.sp.service.CardService;

@RestController
public class CardRestController {
	
	@Autowired
	CardService cardServ;
	
	@RequestMapping(method=RequestMethod.GET,value="/card")
    public Iterable<Card> getCards() {
        Iterable<Card> list = cardServ.getAllCards();
        return list;
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/card/{id}")
    public Card getCard(@PathVariable String id) {
        Card c = cardServ.getCard(Integer.valueOf(id));
        return c;
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/card/search/{name}")
    public Card getCardByName(@PathVariable String name) {
        Card c = cardServ.getCard(name);
        return c;
    }
	/*
	@RequestMapping(method=RequestMethod.PUT,value="/card/{id}")
    public Card modifyCard(@PathVariable String id) { //TODO : Change card
        Card c = cardServ.getCard(Integer.valueOf(id));
        return c;
    }
	*/
	
	@RequestMapping(method=RequestMethod.DELETE,value="/card/{id}")
    public void deleteCard(@PathVariable String id) {
        cardServ.delCard(Integer.valueOf(id));
        return;
    }
	
	@RequestMapping(method=RequestMethod.POST,value="/card")
    public void addCard(@RequestBody Card c) {
        cardServ.addCard(c);
    }
}
