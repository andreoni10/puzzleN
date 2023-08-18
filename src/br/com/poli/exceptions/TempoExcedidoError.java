package br.com.poli.exceptions;

public class TempoExcedidoError extends Error {

	private String erro = "N alto demais! Muito processamento necessário para estas interações. ";

	public String getMessage() {
		return erro;
	}

}
