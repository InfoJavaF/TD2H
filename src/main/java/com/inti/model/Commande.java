package com.inti.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idCommande;
	private LocalDate date;
	@OneToOne
	@ManyToOne
	@JoinColumn(name = "idU")
	private Utilisateur utilisateur;
	
	
	public Commande() {
		super();
	}



	public Commande( LocalDate date) {
		super();
		this.date = date;
	}



	public int getIdCommande() {
		return idCommande;
	}



	public Utilisateur getUtilisateur() {
		return utilisateur;
	}



	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}



	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", date=" + date + "]";
	}
	
	
}
