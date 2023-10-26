package com.br.senai.fakenatty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.senai.fakenatty.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
