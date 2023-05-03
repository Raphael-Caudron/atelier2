package com.sp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {
	@Id
	@GeneratedValue
	private int id;
	private int idAcheteur;
	private int idVendeur;
	private int montant;
	private String date;
	
	public Transaction() {
	}

	public Transaction(int id, int idAcheteur, int idVendeur, int montant, String date) {
		this.id=id;
		this.idAcheteur = idAcheteur;
		this.idVendeur = idVendeur;
		this.montant = montant;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdAcheteur() {
		return idAcheteur;
	}

	public void setIdAcheteur(int idAcheteur) {
		this.idAcheteur = idAcheteur;
	}

	public int getIdVendeur() {
		return idVendeur;
	}

	public void setIdVendeur(int idVendeur) {
		this.idVendeur = idVendeur;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "TRANSACTION ["+this.id+"]: Acheteur:"+this.idAcheteur+", Vendeur:"+this.idVendeur+", Montant:"+this.montant+" Date:"+this.date;
	}
}
