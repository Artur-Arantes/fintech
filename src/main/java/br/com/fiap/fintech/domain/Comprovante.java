package br.com.fiap.fintech.domain;

public class Comprovante {
	private int id;
	private String nomeArquivo;
	private boolean incluir;

	public Comprovante(String nomeArquivo, boolean incluirComprovanteNoRelatorio) {
		this.nomeArquivo = nomeArquivo;
		this.incluir = incluirComprovanteNoRelatorio;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public boolean isIncluirComprovanteNoRelatorio() {
		return incluir;
	}

	public void setIncluirComprovanteNoRelatorio(boolean incluirComprovanteNoRelatorio) {
		this.incluir = incluirComprovanteNoRelatorio;
	}
}
