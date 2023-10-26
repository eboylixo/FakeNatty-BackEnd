package com.br.senai.fakenatty.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.senai.fakenatty.model.Dieta;

public interface DietaRepository extends JpaRepository<Dieta, Integer> {

//	Optional<Dieta> findByNumeroCaloriasAndVeganoAndVegetarianoAndLactoseAndGlutem(Double numeroCalorias,
//			Boolean vegano, Boolean vegetariano, Boolean lactose, Boolean glutem);
	
	List<Dieta> findByNumeroCaloriasGreaterThanAndVeganoAndVegetarianoAndLactoseAndGlutemOrderByNumeroCaloriasAsc(Double numeroCalorias,
			Boolean vegano, Boolean vegetariano, Boolean lactose, Boolean glutem);
	
	Optional<Dieta> findFirstByNumeroCaloriasGreaterThanAndVeganoAndVegetarianoAndLactoseAndGlutem(Double numeroCalorias,
			Boolean vegano, Boolean vegetariano, Boolean lactose, Boolean glutem);
	
	Optional<Dieta> findFirstByNumeroCaloriasLessThanAndVeganoAndVegetarianoAndLactoseAndGlutem(Double numeroCalorias,
			Boolean vegano, Boolean vegetariano, Boolean lactose, Boolean glutem);

}
