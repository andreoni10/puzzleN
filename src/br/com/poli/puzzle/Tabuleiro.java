package br.com.poli.puzzle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.poli.exceptions.MovimentoInvalidoException;

public class Tabuleiro {

	protected Bloco[][] grid;

	public Tabuleiro(Bloco[][] grid) {
		this.grid = grid;
	}

	public void executaMovimento(int linha, int coluna, String direcao) throws MovimentoInvalidoException {
		switch (direcao) {
		case "cima":
			try {
				if (isMovimentoValido(linha, coluna, direcao)) {
					int blocoCima = grid[linha][coluna].getValor();
					grid[linha][coluna].setValor(0);
					grid[linha - 1][coluna].setValor(blocoCima);
					isTabuleiroOrdenado();
				}
			} catch (MovimentoInvalidoException e) {
				e.printStackTrace();
			}
			break;
		case "baixo":
			try {
				if (isMovimentoValido(linha, coluna, direcao)) {
					int blocoBaixo = grid[linha][coluna].getValor();
					grid[linha][coluna].setValor(0);
					grid[linha + 1][coluna].setValor(blocoBaixo);
					isTabuleiroOrdenado();
				}
			} catch (MovimentoInvalidoException e) {
				e.printStackTrace();
			}
			break;
		case "direita":
			try {
				if (isMovimentoValido(linha, coluna, direcao)) {
					int blocoDireita = grid[linha][coluna].getValor();
					grid[linha][coluna].setValor(0);
					grid[linha][coluna + 1].setValor(blocoDireita);
					isTabuleiroOrdenado();
				}
			} catch (MovimentoInvalidoException e) {
				e.printStackTrace();
			}
			break;
		case "esquerda":
			try {
				if (isMovimentoValido(linha, coluna, direcao)) {
					int blocoEsquerda = grid[linha][coluna].getValor();
					grid[linha][coluna].setValor(0);
					grid[linha][coluna - 1].setValor(blocoEsquerda);
					isTabuleiroOrdenado();
				}
			} catch (MovimentoInvalidoException e) {
				e.printStackTrace();
			}
			break;
		default:
			System.out.println("Direção não Especificada!");

		}
	}

	public void showTabuleiro() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j].getValor() > 9) {
					System.out.print(grid[i][j].getValor() + " ");
				} else {
					System.out.print(grid[i][j].getValor() + "  ");
				}
				if (j == grid.length - 1) {
					System.out.print("\n");
				}
			}
		}
	}

	public boolean isTabuleiroOrdenado() {
		if (grid[0][0].getValor() == 1 && grid[0][1].getValor() == 2 && grid[0][2].getValor() == 3
				&& grid[1][0].getValor() == 4 && grid[1][1].getValor() == 5 && grid[1][2].getValor() == 6
				&& grid[2][0].getValor() == 7 && grid[2][1].getValor() == 8 && grid[2][2].getValor() == 0) {
			return true;
		} else {
			return false;
		}

	}
	
	//Faz com que os números apareçam de forma aleatória
	public static int getRandom(List<Integer> array) {
		int rnd = new Random().nextInt(array.size());
		return array.get(rnd);
	}

	public void geraTabuleiro(Dificuldade dificuldade, int tamanho) {
		if (dificuldade.equals(Dificuldade.FACIL)) {
			List<Integer> numeros = new ArrayList<Integer>();
			for (int n = 0; n < 9; n++) {
				numeros.add(n);
			}
			grid = new Bloco[3][3];
			for (int x = 0; x < 3; x++) {
				for (int y = 0; y < 3; y++) {
					int sorteado = getRandom(numeros);
					Integer sorteadoObj = sorteado;
					if (grid[x][y] == null) {
						grid[x][y] = new Bloco();
						grid[x][y].setValor(sorteado);
						numeros.remove(sorteadoObj);
					} else {
						grid[x][y].setValor(sorteado);
						numeros.remove(sorteadoObj);
					}
				}
			}

		}

		if (dificuldade.equals(Dificuldade.MEDIO)) {
			List<Integer> numeros = new ArrayList<Integer>();
			for (int n = 0; n < 16; n++) {
				numeros.add(n);
			}
			grid = new Bloco[4][4];
			for (int x = 0; x < 4; x++) {
				for (int y = 0; y < 4; y++) {
					int sorteado = getRandom(numeros);
					Integer sorteadoObj = sorteado;
					if (grid[x][y] == null) {
						grid[x][y] = new Bloco();
						grid[x][y].setValor(sorteado);
						numeros.remove(sorteadoObj);
					} else {
						grid[x][y].setValor(sorteado);
						numeros.remove(sorteadoObj);
					}
				}
			}

		}

		if (dificuldade.equals(Dificuldade.DIFICIL)) {
			List<Integer> numeros = new ArrayList<Integer>();
			for (int n = 0; n < 25; n++) {
				numeros.add(n);
			}
			grid = new Bloco[5][5];
			for (int x = 0; x < 5; x++) {
				for (int y = 0; y < 5; y++) {
					int sorteado = getRandom(numeros);
					Integer sorteadoObj = sorteado;
					if (grid[x][y] == null) {
						grid[x][y] = new Bloco();
						grid[x][y].setValor(sorteado);
						numeros.remove(sorteadoObj);
					} else {
						grid[x][y].setValor(sorteado);
						numeros.remove(sorteadoObj);
					}
				}
			}

		}

		if (dificuldade.equals(Dificuldade.INSANO)) {
			if (((Math.sqrt(tamanho) - Math.floor(Math.sqrt(tamanho))) == 0)) {
				List<Integer> numeros = new ArrayList<Integer>();
				for (int n = 0; n < tamanho + 1; n++) {
					numeros.add(n);
				}
				grid = new Bloco[(int) Math.sqrt(tamanho)][(int) Math.sqrt(tamanho)];
				for (int x = 0; x < (int) Math.sqrt(tamanho); x++) {
					for (int y = 0; y < (int) Math.sqrt(tamanho); y++) {
						int sorteado = getRandom(numeros);
						Integer sorteadoObj = sorteado;
						if (grid[x][y] == null) {
							grid[x][y] = new Bloco();
							grid[x][y].setValor(sorteado);
							numeros.remove(sorteadoObj);
						} else {
							grid[x][y].setValor(sorteado);
							numeros.remove(sorteadoObj);
						}
					}
				}

			} else {
				System.out.println("tamanho invalido");
			}

		}

	}

	public Bloco[][] getGrid() {
		return grid;
	}

	public void setGrid(Bloco[][] grid) {
		this.grid = grid;
	}
	
	//Verifica os botões em volta para ver se é possiver realizar o movimento do botão acionado
	public boolean isMovimentoValido(int linha, int coluna, String direcao) throws MovimentoInvalidoException {
		if (grid[linha][coluna].getValor() != 0 && linha < grid.length && coluna < grid.length) {
			grid[linha][coluna].setValido(true);
			switch (direcao) {
			case "cima":
				return grid[linha - 1][coluna].getValor() == 0;
			case "baixo":
				return grid[linha + 1][coluna].getValor() == 0;
			case "direita":
				return grid[linha][coluna + 1].getValor() == 0;
			case "esquerda":
				return grid[linha][coluna - 1].getValor() == 0;
			default:
				throw new MovimentoInvalidoException("Movimento Inválido!");
			}
		} else {
			throw new MovimentoInvalidoException("Movimento Inválido!");
		}

	}

	public void executaMovimentoAuto(int linha, int coluna, String direcao) {
		if (grid[linha][coluna].getValor() != 0 && linha < grid.length && coluna < grid.length) {
			grid[linha][coluna].setValido(true);
			
		}
		
	}
}
