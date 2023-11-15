package br.com.fiap.fintech.domain;

public class Permissao {

	private String nomePermissao;

	public Permissao(String nomePermissao) {
		this.nomePermissao = nomePermissao;
	}

	public String getNomePermissao() {
		return nomePermissao;
	}

	public void setNomePermissao(String nomePermissao) {
		this.nomePermissao = nomePermissao;
	}
}
