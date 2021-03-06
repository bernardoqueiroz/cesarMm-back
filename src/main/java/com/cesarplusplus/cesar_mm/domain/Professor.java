package com.cesarplusplus.cesar_mm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Professor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;
	
	@Column(length = 20, nullable = false)
	private String nomeCompleto;

	@Column(length = 20, nullable = false)
	private String username;

	@Column(length = 100, nullable = false)
	private String email;

	@Column(length = 50, nullable = false)
	private String senha;

	//private Short turmaId; //Fazer Relação entre a tabela Professor e turma ManyToMany

}

