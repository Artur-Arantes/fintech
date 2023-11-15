package br.com.fiap.fintech.domain;

import java.util.Date;

public class Periodo {

	private Date dataInicio;
	private Date dataFim;

	public Periodo(Date dataInicio, Date dataFim) {
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

}
