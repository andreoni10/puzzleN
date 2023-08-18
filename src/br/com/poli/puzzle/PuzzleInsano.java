package br.com.poli.puzzle;

import java.util.Calendar;

import br.com.poli.exceptions.TempoExcedidoError;

public class PuzzleInsano extends Puzzle {

	private static final int DEZ_SEGUNDOS = 10000;

	private int tamanho;

	public PuzzleInsano(Jogador jogador, Tabuleiro gridPuzzle, Dificuldade dificuldade) {
		super(jogador, gridPuzzle, dificuldade);
	}

	public void resolveTabuleiro() throws TempoExcedidoError {
		long dezSegundos = System.currentTimeMillis() - DEZ_SEGUNDOS;
		if (super.getTempo().getTimeInMillis() > dezSegundos) {
			throw new TempoExcedidoError();
		}

	}

	public void geraTabuleiro() {
		super.getGridPuzzle().geraTabuleiro(Dificuldade.INSANO, tamanho);
	}

}
