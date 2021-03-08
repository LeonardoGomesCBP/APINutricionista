package com.leonardo.nutricao.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.nutricao.exception.NutricionistaResourceException;
import com.leonardo.nutricao.model.Nutricionista;
import com.leonardo.nutricao.repository.NutricionistaRepository;
import com.leonardo.nutricao.resourcemodel.NutricionistaResource;

@Service
public class CadastroNutricionista {
	@Autowired
	private NutricionistaRepository nutricionistaRepository;
	
	
	@Autowired
	private NutricionistaConversor service;
	
	private static final Logger LOG = Logger.getLogger(CadastroNutricionista.class);

	 public void cadastro(NutricionistaResource nutricionistaResource) {

		    try {
		      Nutricionista nutricionista = service.conversor(nutricionistaResource);
		      nutricionistaRepository.saveAndFlush(nutricionista);
		    } catch (NutricionistaResourceException e) {
		      LOG.error("Erro ao salvar o nutricionista: " + e.getMessage(), e);
		    }
		  }
	

}
