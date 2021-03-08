package com.leonardo.nutricao.service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.nutricao.model.Nutricionista;
import com.leonardo.nutricao.repository.NutricionistaRepository;


@Service
public class BuscarNutricionistaServiceImpl {
	@Autowired
	private NutricionistaRepository nutricionistaRepository;
	
		  public List<Nutricionista> buscarTodosOsNutricionistas() {
		    List<Nutricionista> listNutricionista = nutricionistaRepository.findAll();
		    return listNutricionista;
		  }

	
	
	
}
