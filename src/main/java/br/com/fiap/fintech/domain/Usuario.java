package br.com.fiap.fintech.domain;

public class Usuario {
	
	private int id;
	private String nome;
	private String email;
	private String senha;
	private boolean contaExpirada;
	private boolean contaBloqueada;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isContaExpirada() {
		return contaExpirada;
	}

	public void setContaExpirada(boolean contaExpirada) {
		this.contaExpirada = contaExpirada;
	}

	public boolean isContaBloqueada() {
		return contaBloqueada;
	}

	public void setContaBloqueada(boolean contaBloqueada) {
		this.contaBloqueada = contaBloqueada;
	}
}
