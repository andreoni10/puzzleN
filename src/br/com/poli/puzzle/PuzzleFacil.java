package br.com.poli.puzzle;

import java.util.Calendar;

import br.com.poli.exceptions.TempoExcedidoError;

public class PuzzleFacil extends Puzzle {

	private static final int DEZ_SEGUNDOS = 10000;//10000 milissegundos = 10 segundos 

	public PuzzleFacil(Jogador jogador, Tabuleiro gridPuzzle, Dificuldade dificuldade) {
		super(jogador, gridPuzzle, dificuldade);
	}

	public void resolveTabuleiro() throws TempoExcedidoError {
		long dezSegundos = System.currentTimeMillis() - DEZ_SEGUNDOS;
		if (super.getTempo().getTimeInMillis() > dezSegundos) {
			throw new TempoExcedidoError();
		}
		else {
			gridPuzzle.grid[0][0].setValor(1);
			gridPuzzle.grid[0][1].setValor(2);
			gridPuzzle.grid[0][2].setValor(3);
			gridPuzzle.grid[1][0].setValor(4);
			gridPuzzle.grid[1][1].setValor(5);
			gridPuzzle.grid[1][2].setValor(6);
			gridPuzzle.grid[2][0].setValor(7);
			gridPuzzle.grid[2][1].setValor(8);
			gridPuzzle.grid[2][2].setValor(0);
		}

	}

	public void geraTabuleiro() {
		super.getGridPuzzle().geraTabuleiro(Dificuldade.FACIL, 8);
	}

}
