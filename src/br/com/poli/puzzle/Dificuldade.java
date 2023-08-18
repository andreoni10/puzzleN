package br.com.poli.puzzle;

public enum Dificuldade {

	FACIL(8), MEDIO(15), DIFICIL(24), INSANO(0);

	private int valor;

	private Dificuldade(int valor) {
		this.valor = valor;
	}

	private int getValor() {
		return valor;
	}

}
