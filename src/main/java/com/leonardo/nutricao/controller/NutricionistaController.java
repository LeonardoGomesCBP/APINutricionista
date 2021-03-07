package com.leonardo.nutricao.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.nutricao.model.Nutricionista;
import com.leonardo.nutricao.repository.NutricionistaRepository;
import com.leonardo.nutricao.service.BuscarNutricionistaServiceImpl;

@RestController
@RequestMapping(value = "/api")
public class NutricionistaController {
	
@Autowired
private BuscarNutricionistaServiceImpl serviceBuscar;

@Autowired
private NutricionistaRepository nutricionistaRepository;

	
	@GetMapping(path = "/nutricionista")
	public List<Nutricionista> buscarNutricionistaPorId() {
		return serviceBuscar.buscarAllNutricionistas();
	}
	
	@GetMapping(path = "/nutricionista/id/{id}")
	public Optional<Nutricionista> buscarNutricionistaPorId(@PathVariable (name ="id", required = true) Long id) {
		return nutricionistaRepository.findById(id);
	}
	
	@PostMapping(path = "nutricionista/criar")
	public void salvarNutricionista(@RequestBody Nutricionista nutricionista) {
		nutricionistaRepository.save(nutricionista);
	}
	
	@DeleteMapping(path ="nutricionista/delete/{id}")
	public void deleteNutricionista(@PathVariable(name = "id", required = true)Long id) {
		nutricionistaRepository.deleteById(id);;;
	}
	

}
