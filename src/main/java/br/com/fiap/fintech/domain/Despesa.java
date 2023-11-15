package br.com.fiap.fintech.domain;

import java.math.BigDecimal;

import br.com.fiap.fintech.enums.EnumTipoCategoria;

public class Despesa {
	private BigDecimal valor;
	private EnumTipoCategoria categoria;

	public Despesa(BigDecimal valor, EnumTipoCategoria categoria) {
		this.valor = valor;
		this.categoria = categoria;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public EnumTipoCategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(EnumTipoCategoria categoria) {
		this.categoria = categoria;
	}
}
