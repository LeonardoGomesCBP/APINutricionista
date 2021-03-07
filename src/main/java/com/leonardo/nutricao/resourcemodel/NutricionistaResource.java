package com.leonardo.nutricao.resourcemodel;

import java.time.LocalDate;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.leonardo.nutricao.model.Nutricionista;

import lombok.Data;

@Data
public class NutricionistaResource {

	@JsonProperty("nome_nutricionista")
	private String nome;
	
	@JsonProperty("idade")
	private String idade;
	
	@JsonProperty("codigo_registro")
	private String codigoRegistro;
	
	@JsonProperty("codigo_registro")
	private String paciente_id;
	
	
}
