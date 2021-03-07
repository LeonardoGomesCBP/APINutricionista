package com.leonardo.nutricao.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.leonardo.nutricao.model.Nutricionista;
import com.leonardo.nutricao.repository.NutricionistaRepository;

public class CadastroNutricionista {
	@Autowired
	private NutricionistaRepository nutricionistaRepository;
	
	public void Cadastro(Nutricionista nutricionista) {
	nutricionistaRepository.save(nutricionista);
	}
	

}
