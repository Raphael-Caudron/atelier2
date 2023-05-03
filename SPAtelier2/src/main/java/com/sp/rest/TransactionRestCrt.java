package com.sp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sp.model.Transaction;
import com.sp.service.TransactionService;

@RestController
public class TransactionRestCrt {
	
	@RequestMapping(method=RequestMethod.POST,value="/buy")
	public void addTransaction(@RequestBody int idAcheteur, @RequestBody int idCard) {
	}

	
}
