package com.br.senai.fakenatty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.senai.fakenatty.dto.PessoaDto;
import com.br.senai.fakenatty.model.Pessoa;
import com.br.senai.fakenatty.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa inserePessoa(PessoaDto pessoaDto) {
		Pessoa pessoa = new Pessoa(pessoaDto);
		return pessoaRepository.save(pessoa);

	}

	public List<Pessoa> listaPessoa() {
		return pessoaRepository.findAll();
	}

	public void excluirPessoa(Integer id) {
		pessoaRepository.deleteById(id);
	}
}
