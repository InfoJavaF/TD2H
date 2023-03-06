package com.inti.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Paypal extends Paiment {

	private int numeroCompte;

	public Paypal() {
		super();
	}

	public Paypal(int idPaiment, Double montant, LocalDate date, int numeroCompte) {
		super(idPaiment, montant, date);
		this.numeroCompte = numeroCompte;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	@Override
	public String toString() {
		return "Paypal [numeroCompte=" + numeroCompte + "]";
	}
	
	
}
