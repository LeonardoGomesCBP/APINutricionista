package com.leonardo.nutricao.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.nutricao.model.Nutricionista;
import com.leonardo.nutricao.repository.NutricionistaRepository;

@RestController
@RequestMapping(value = "/api")
public class NutricionistaController {
	
	@Autowired
	private NutricionistaRepository nutricionistaRepository;
	
	@GetMapping(path = "/nutricionista")
	public List<Nutricionista> buscarNutricionistaPorId() {
		return nutricionistaRepository.findAll();
	}
	
	@GetMapping(path = "/nutricionista/id/{id}")
	public Optional<Nutricionista> buscarNutricionistaPorId(@PathVariable (name ="id", required = true) Long id) {
		return nutricionistaRepository.findById(id);
	}

}
