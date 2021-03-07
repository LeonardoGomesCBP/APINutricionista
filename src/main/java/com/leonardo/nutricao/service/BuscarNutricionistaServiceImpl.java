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
	
	
	private static final Logger LOG = Logger.getLogger(BuscarNutricionistaServiceImpl.class);
	public List<Nutricionista> buscarAllNutricionistas() {
		LOG.info("teste");
		List<Nutricionista> listNutricionista = nutricionistaRepository.findAll();
		return listNutricionista;
	}
	
}
