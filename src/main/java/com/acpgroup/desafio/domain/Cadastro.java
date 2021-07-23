package com.acpgroup.desafio.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cadastro implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nomeCompleto;
	private String apelido;
	private String email;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String nomeDescricao;
	private String localEndereco;

	public Cadastro() {

	}

	public Cadastro(String nomeCompleto, String apelido, String email, Integer id, String nomeDescricao,
			String localEndereco) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.apelido = apelido;
		this.email = email;
		this.id = id;
		this.nomeDescricao = nomeDescricao;
		this.localEndereco = localEndereco;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeDescricao() {
		return nomeDescricao;
	}

	public void setNomeDescricao(String nomeDescricao) {
		this.nomeDescricao = nomeDescricao;
	}

	public String getLocalEndereco() {
		return localEndereco;
	}

	public void setLocalEndereco(String localEndereco) {
		this.localEndereco = localEndereco;
	}

}
