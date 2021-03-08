package com.leonardo.nutricao.service;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.leonardo.nutricao.exception.NutricionistaResourceException;
import com.leonardo.nutricao.model.Nutricionista;
import com.leonardo.nutricao.resourcemodel.NutricionistaResource;

@Component
public class NutricionistaConversor {

	  public Nutricionista conversor(NutricionistaResource nutricionistaResource)
	      throws NutricionistaResourceException {

	    try {
	      Nutricionista nutricionista = new Nutricionista();
	      Long idPaciente = checkIdPaciente(nutricionistaResource.getIdPaciente());

	      LocalDate idade = checkIdade(nutricionistaResource.getIdade());
	      nutricionista.setId_paciente(idPaciente);
	      nutricionista.setIdade(idade);
	      nutricionista.setCodigoRegistro(nutricionistaResource.getCodigoRegistro());
	      nutricionista.setNome(nutricionistaResource.getNome());
	      return nutricionista;

	    } catch (Exception e) {
	      throw new NutricionistaResourceException(
	          "Falha ao converter o resource para entidade, resouce: " + nutricionistaResource);
	    }

	  }

	  private Long checkIdPaciente(String idPaciente) {
	    return Long.parseLong(idPaciente);
	  }

	  private LocalDate checkIdade(String idade) {
	    return LocalDate.parse(idade);
	  }

	
}
