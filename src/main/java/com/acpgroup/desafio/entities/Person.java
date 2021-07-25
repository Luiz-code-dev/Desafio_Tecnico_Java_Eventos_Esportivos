package com.acpgroup.desafio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_person")
public class Person {

	// MODEL ID FIELD
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer id;

	// Model Specific Properties
	@Column(name= "nome_completo")
	public String nomeCompleto;
	public String apelido;
	
	
	public String email;
	private double senha;

	// constructor
	public Person() {

	}

	public Person(String nomeCompleto, String apelido, String email, double senha) {
		this.nomeCompleto = nomeCompleto;
		this.apelido = apelido;
		this.email = email;
		this.setSenha(senha);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public double getSenha() {
		return senha;
	}

	public void setSenha(double senha) {
		this.senha = senha;
	}

	
}