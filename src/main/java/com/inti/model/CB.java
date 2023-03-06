package com.inti.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class CB extends Paiment {

	private int numeroCarte;
	private LocalDate dateExpiration;
	
	public CB() {
		super();
	}

	public CB(int idPaiment, Double montant, LocalDate date, int numeroCarte, LocalDate dateExpiration) {
		super(idPaiment, montant, date);
		this.numeroCarte = numeroCarte;
		this.dateExpiration = dateExpiration;
	}

	public int getNumeroCarte() {
		return numeroCarte;
	}

	public void setNumeroCarte(int numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	public LocalDate getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(LocalDate dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	@Override
	public String toString() {
		return "CB [numeroCarte=" + numeroCarte + ", dateExpiration=" + dateExpiration + "]";
	}
	
	
}
