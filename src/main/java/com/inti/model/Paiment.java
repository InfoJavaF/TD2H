package com.inti.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="discriminator",discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("0")
public class Paiment {

	protected int idPaiment;
	protected Double montant;
	protected LocalDate date;
	
	
	
	public Paiment() {
		super();
	}



	public Paiment(int idPaiment, Double montant, LocalDate date) {
		super();
		this.idPaiment = idPaiment;
		this.montant = montant;
		this.date = date;
	}



	public int getIdPaiment() {
		return idPaiment;
	}



	public void setIdPaiment(int idPaiment) {
		this.idPaiment = idPaiment;
	}



	public Double getMontant() {
		return montant;
	}



	public void setMontant(Double montant) {
		this.montant = montant;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "Paiment [idPaiment=" + idPaiment + ", montant=" + montant + ", date=" + date + "]";
	}
	
	
}
