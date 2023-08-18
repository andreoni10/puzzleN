package br.com.poli.exceptions;

public class MovimentoInvalidoException extends Exception {
	private String msg;

	public MovimentoInvalidoException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}
