package com.br.senai.fakenatty.model;

import com.br.senai.fakenatty.dto.DietaDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dieta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	Double numeroCalorias;
	Boolean vegano;
	Boolean vegetariano;
	Boolean lactose;
	Boolean glutem;
	String caminhoArquivo;

	public Dieta(DietaDto dieta) {
		this.id = dieta.getId();
		this.numeroCalorias = dieta.getNumeroCalorias();
		this.vegano = dieta.getVegano();
		this.vegetariano = dieta.getVegetariano();
		this.lactose = dieta.getLactose();
		this.glutem = dieta.getGlutem();
		this.caminhoArquivo = dieta.getCaminhoArquivo();
	}

	public Dieta() {
		super();
	}

	public Dieta(Integer id, Double numeroCalorias, Boolean vegano, Boolean vegetariano, Boolean lactose,
			Boolean glutem, String caminhoArquivo) {
		super();
		this.id = id;
		this.numeroCalorias = numeroCalorias;
		this.vegano = vegano;
		this.vegetariano = vegetariano;
		this.lactose = lactose;
		this.glutem = glutem;
		this.caminhoArquivo = caminhoArquivo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getNumeroCalorias() {
		return numeroCalorias;
	}

	public void setNumeroCalorias(Double numeroCalorias) {
		this.numeroCalorias = numeroCalorias;
	}

	public Boolean getVegano() {
		return vegano;
	}

	public void setVegano(Boolean vegano) {
		this.vegano = vegano;
	}

	public Boolean getVegetariano() {
		return vegetariano;
	}

	public void setVegetariano(Boolean vegetariano) {
		this.vegetariano = vegetariano;
	}

	public Boolean getLactose() {
		return lactose;
	}

	public void setLactose(Boolean lactose) {
		this.lactose = lactose;
	}

	public Boolean getGlutem() {
		return glutem;
	}

	public void setGlutem(Boolean glutem) {
		this.glutem = glutem;
	}

	public String getCaminhoArquivo() {
		return caminhoArquivo;
	}

	public void setCaminhoArquivo(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
	}

}
