package com.br.senai.fakenatty.dto;

public class DadosDto {

	DietaDto dietaDto;
	PessoaDto pessoaDto;

	public  DadosDto() {
		super();
	}

	public DadosDto(DietaDto dietaDto, PessoaDto pessoadDto) {
		super();
		this.dietaDto = dietaDto;
		this.pessoaDto = pessoadDto;
	}

	public DietaDto getDietaDto() {
		return dietaDto;
	}

	public void setDietaDto(DietaDto dietaDto) {
		this.dietaDto = dietaDto;
	}

	public PessoaDto getPessoaDto() {
		return pessoaDto;
	}

	public void setPessoaDto(PessoaDto pessoadDto) {
		this.pessoaDto = pessoadDto;
	}

}
