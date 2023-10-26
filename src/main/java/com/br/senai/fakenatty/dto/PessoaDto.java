package com.br.senai.fakenatty.dto;

import com.br.senai.fakenatty.model.Pessoa;

public class PessoaDto {

	Integer id;
	String nome;
	Integer idade;
	Double taxaMetabolica;
	Double peso;
	char pretencaoFisica;
	char genero;
	char nivelAtividadeFisica;
	String email;
	Double altura;
	

	public PessoaDto(Pessoa pessoa) {
		this.id = pessoa.getId();
		this.nome = pessoa.getNome();
		this.idade = pessoa.getIdade();
		this.taxaMetabolica = pessoa.getTaxaMetabolica();
		this.peso = pessoa.getPeso();
		this.pretencaoFisica = pessoa.getPretencaoFisica();
		this.genero = pessoa.getGenero();
		this.nivelAtividadeFisica = pessoa.getNivelAtividadeFisica();
		this.email = pessoa.getEmail();
		this.altura = pessoa.getAltura();
	}

	public PessoaDto() {
		super();
	}

	public PessoaDto(Integer id, String nome, Integer idade, Double taxaMetabolica, Double peso, char pretencaoFisica,
			char genero, char nivelAtividadeFisica, String email, Double altura) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.taxaMetabolica = taxaMetabolica;
		this.peso = peso;
		this.pretencaoFisica = pretencaoFisica;
		this.genero = genero;
		this.nivelAtividadeFisica = nivelAtividadeFisica;
		this.email = email;
		this.altura = altura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getTaxaMetabolica() {
		return taxaMetabolica;
	}

	public void setTaxaMetabolica(Double taxaMetabolica) {
		this.taxaMetabolica = taxaMetabolica;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public char getPretencaoFisica() {
		return pretencaoFisica;
	}

	public void setPretencaoFisica(char pretencaoFisica) {
		this.pretencaoFisica = pretencaoFisica;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public char getNivelAtividadeFisica() {
		return nivelAtividadeFisica;
	}

	public void setNivelAtividadeFisica(char nivelAtividadeFisica) {
		this.nivelAtividadeFisica = nivelAtividadeFisica;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
