package com.leonardo.nutricao.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "nutricionista")
@Table(name = "nutricionista")
public class Nutricionista implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2158393938278208608L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	
	private LocalDate idade;
	private String codigoRegistro;
	private Long paciente_id;
	
public Nutricionista() {
	}
}
