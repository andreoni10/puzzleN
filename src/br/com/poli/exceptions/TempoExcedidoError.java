package br.com.poli.exceptions;

public class TempoExcedidoError extends Error {

	private String erro = "N alto demais! Muito processamento necess�rio para estas intera��es. ";

	public String getMessage() {
		return erro;
	}

}
