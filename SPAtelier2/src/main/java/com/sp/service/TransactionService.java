package com.sp.service;

import java.util.Optional;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sp.model.Transaction;
import com.sp.model.User;
import com.sp.model.Card;
import com.sp.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	TransactionRepository tRepository;
	@Autowired
	CardService cardService;
	@Autowired
	UserService userService;
	
	public void addTransaction(Transaction t) {
		Transaction createdTransaction=tRepository.save(t);
		System.out.println(createdTransaction);
	}
	
	public Transaction getTransaction(int id) {
		Optional<Transaction> hOpt =tRepository.findById(id);
		if (hOpt.isPresent()) {
			return hOpt.get();
		}else {
			return null;
		}
	}

	public Card testRecupCarte(int idCard) {
		Card card = cardService.getCard(idCard);
		return card;
	}
	
	
	public void demandeAchat(int idCard, int idBuyer) {
		// On récupère les objets Card et User correspondant aux ID.
		Card card = cardService.getCard(idCard);
		User buyer = userService.getUser(idBuyer);
		
		// On récupère le montant de la carte.
		int cardValue = card.getValue();
		
		// Cas où l'acheteur possède assez d'argent pour acheter la carte.
		if (cardValue <= buyer.getWallet()) {
			// On récupère l'objet User de l'acheteur.
			int idSeller = card.getOwnerId();
			User seller = userService.getUser(idSeller);
			
			// Transaction d'argent.
			buyer.setWallet(buyer.getWallet() - cardValue);
			seller.setWallet(seller.getWallet() + cardValue);
			// On change le propriétaire de la carte.
			card.setOwnerId(buyer.getId());
			
			// On récupère la date de la transaction.
			LocalDateTime currentDateTime = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	        String formattedDateTime = currentDateTime.format(formatter);
	        
			// On créer un objet Transaction pour enregistrer l'achat dans les logs.
			Transaction transaction = new Transaction(idBuyer, idSeller, cardValue, formattedDateTime);
			// On ajoute la transaction nouvellement crée dans le Repository.
			this.addTransaction(transaction);
		} 
		// Cas où l'acheteur ne possède pas assez d'argent pour acheter la carte.
		else {
			System.out.println("L'acheteur n'a pas assez d'argent.");
		}
	}
}
