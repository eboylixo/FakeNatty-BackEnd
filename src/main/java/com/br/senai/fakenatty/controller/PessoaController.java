package com.br.senai.fakenatty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.br.senai.fakenatty.dto.DadosDto;
import com.br.senai.fakenatty.dto.DietaDto;
import com.br.senai.fakenatty.model.Dieta;
import com.br.senai.fakenatty.model.Pessoa;
import com.br.senai.fakenatty.service.DietaService;
import com.br.senai.fakenatty.service.PessoaService;

@RestController

@RequestMapping("/fakenatty")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;
	
	@Autowired
	private DietaService dietaService;

	@PostMapping
	public ResponseEntity<DadosDto> criaPessoa(@RequestBody DadosDto dadosDto) {
		Pessoa pessoa = pessoaService.inserePessoa(dadosDto.getPessoaDto());
		DietaDto dietaDto = dadosDto.getDietaDto();
		dietaDto.setNumeroCalorias(pessoa.getTaxaMetabolica());
		Dieta dieta = dietaService.buscaDieta(dietaDto, pessoa.getPretencaoFisica());
		
		DietaDto dietaDto1 = new DietaDto(dieta);
		
		return ResponseEntity.ok(new DadosDto( dietaDto1, dadosDto.getPessoaDto()));

	}
	/*
	 * @GetMapping public ResponseEntity<List<PessoaDto>> listaPessoa() {
	 * List<Pessoa> pessoas = pessoaService.listaPessoa(); List<PessoaDto>
	 * pessoasDtos = pessoas.stream().map(PessoaDto::new).toList(); return
	 * ResponseEntity.ok(pessoasDtos); }
	 */

	@DeleteMapping("/id")
	public ResponseEntity<Void> excluirPessoa(@PathVariable Integer id) {
		pessoaService.excluirPessoa(id);
		return ResponseEntity.status(HttpStatus.OK).build();

	}

}
