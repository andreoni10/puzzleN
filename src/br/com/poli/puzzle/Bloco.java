package br.com.poli.puzzle;

public class Bloco {

	private Integer valor;
	private boolean valido;

	public Bloco() {
		this.valor = 0;
		this.valido = false;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

}
