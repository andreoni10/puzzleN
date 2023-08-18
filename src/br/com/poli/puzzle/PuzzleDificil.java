package br.com.poli.puzzle;

import java.util.Calendar;

import br.com.poli.exceptions.TempoExcedidoError;

public class PuzzleDificil extends Puzzle {

	private static final int DEZ_SEGUNDOS = 10000;

	public PuzzleDificil(Jogador jogador, Tabuleiro gridPuzzle, Dificuldade dificuldade) {
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
			gridPuzzle.grid[0][3].setValor(4);
			gridPuzzle.grid[0][4].setValor(5);
			gridPuzzle.grid[1][0].setValor(6);
			gridPuzzle.grid[1][1].setValor(7);
			gridPuzzle.grid[1][2].setValor(8);
			gridPuzzle.grid[1][3].setValor(9);
			gridPuzzle.grid[1][4].setValor(10);
			gridPuzzle.grid[2][0].setValor(11);
			gridPuzzle.grid[2][1].setValor(12);
			gridPuzzle.grid[2][2].setValor(13);
			gridPuzzle.grid[2][3].setValor(14);
			gridPuzzle.grid[2][4].setValor(15);
			gridPuzzle.grid[3][0].setValor(16);
			gridPuzzle.grid[3][1].setValor(17);
			gridPuzzle.grid[3][2].setValor(18);
			gridPuzzle.grid[3][3].setValor(19);
			gridPuzzle.grid[3][4].setValor(20);
			gridPuzzle.grid[4][0].setValor(21);
			gridPuzzle.grid[4][1].setValor(22);
			gridPuzzle.grid[4][2].setValor(23);
			gridPuzzle.grid[4][3].setValor(24);
			gridPuzzle.grid[4][4].setValor(0);
		}

	}

	public void geraTabuleiro() {
		super.getGridPuzzle().geraTabuleiro(Dificuldade.DIFICIL, 24);
	}

}
