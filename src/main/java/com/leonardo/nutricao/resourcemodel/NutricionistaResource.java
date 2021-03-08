package com.leonardo.nutricao.resourcemodel;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.leonardo.nutricao.model.Nutricionista;

public class NutricionistaResource implements Serializable {

	  private static final long serialVersionUID = 6030862910379069667L;

	  @NotBlank(message = "{name.not.blank}")
	  @JsonProperty("nome_nutricionista")
	  private String nome;

	  @NotBlank(message = "{idade.not.blank}")
	  @JsonProperty("idade")
	  private String idade;

	  @NotBlank(message = "{name.not.blank}")
	  @JsonProperty("codigo_registro")
	  private String codigoRegistro;

	  @NotBlank(message = "id.not.blank")

	  @JsonProperty("id_paciente")
	  private String idPaciente;

	  public String getNome() {
	    return nome;
	  }

	  public void setNome(String nome) {
	    this.nome = nome;
	  }

	  public String getIdPaciente() {
	    return idPaciente;
	  }

	  public void setIdPaciente(String idPaciente) {
	    this.idPaciente = idPaciente;
	  }

	  public String getIdade() {
	    return idade;
	  }

	  public void setIdade(String idade) {
	    this.idade = idade;
	  }

	  public String getCodigoRegistro() {
	    return codigoRegistro;
	  }

	  public void setCodigoRegistro(String codigoRegistro) {
	    this.codigoRegistro = codigoRegistro;
	  }

	  @Override
	  public String toString() {
	    return "NutricionistaResource [nome=" + nome + ", idade=" + idade + ", codigoRegistro="
	        + codigoRegistro + ", idPaciente=" + idPaciente + "]";
	  }
	
}
