package com.leonardo.nutricao.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "nutricionista")
public class Nutricionista implements Serializable {

  private static final long serialVersionUID = 3862024889868951158L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotBlank(message = "{name.not.blank}")
  private String nome;
  private LocalDate idade;

  @NotBlank(message = "{id.not.blank}")
  @Column(name = "codigo_registro")
  private String codigoRegistro;
  
  @NotNull(message = "{id.not.blank}")
  @Column(name = "id_paciente")
  private Long idPaciente;

  public Nutricionista() {}

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getIdade() {
    return idade;
  }

  public void setIdade(LocalDate idade) {
    this.idade = idade;
  }

  public String getCodigoRegistro() {
    return codigoRegistro;
  }

  public void setCodigoRegistro(String codigoRegistro) {
    this.codigoRegistro = codigoRegistro;
  }

  public Long getId_paciente() {
    return idPaciente;
  }

  public void setId_paciente(Long idPaciente) {
    this.idPaciente = idPaciente;
  }

@Override
public String toString() {
	return "Nutricionista [id=" + id + ", nome=" + nome + ", idade=" + idade + ", codigoRegistro=" + codigoRegistro
			+ ", idPaciente=" + idPaciente + "]";
}
  

}
