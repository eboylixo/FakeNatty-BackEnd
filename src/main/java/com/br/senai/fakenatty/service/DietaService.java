package com.br.senai.fakenatty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.senai.fakenatty.dto.DietaDto;
import com.br.senai.fakenatty.model.Dieta;
import com.br.senai.fakenatty.repository.DietaRepository;

/*Classe essa que vai definir qual o PDF sera direcionado para a pessoa*/

@Service
public class DietaService {

	@Autowired
	private DietaRepository dietaRepository;

	public Dieta salvaDieta(DietaDto dietaDto) {
		Dieta dieta = new Dieta(dietaDto);
		return dietaRepository.save(dieta);
	}

	public Dieta buscaDieta(DietaDto dietaDto, char pretencaoFisica) {
		Dieta dieta = new Dieta(dietaDto);
		// INFLUENCIA DA PRETENCAO FISICA INFLUENCIA NA DIETA
		if (pretencaoFisica == 'G') {
			return dietaRepository.findFirstByNumeroCaloriasGreaterThanAndVeganoAndVegetarianoAndLactoseAndGlutem(
					dieta.getNumeroCalorias(), dieta.getVegano(), dieta.getVegetariano(), dieta.getLactose(),
					dieta.getGlutem()).orElse(null);
		} else if (pretencaoFisica == 'P') {
			return dietaRepository
					.findFirstByNumeroCaloriasLessThanAndVeganoAndVegetarianoAndLactoseAndGlutem(dieta.getNumeroCalorias(),
							dieta.getVegano(), dieta.getVegetariano(), dieta.getLactose(), dieta.getGlutem())
					.orElse(null);

		} else {
		
			List<Dieta> listaDieta = dietaRepository.findByNumeroCaloriasGreaterThanAndVeganoAndVegetarianoAndLactoseAndGlutemOrderByNumeroCaloriasAsc(dieta.getNumeroCalorias(),
					dieta.getVegano(), dieta.getVegetariano(), dieta.getLactose(), dieta.getGlutem());
			
			return listaDieta.get(0);
		
		
		}
	}
}
