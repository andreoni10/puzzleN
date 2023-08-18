package br.com.poli.puzzle;

public class CalculaInsano implements CalculaScore {

	public int pontos(Puzzle partida) {
		return (int) (partida.getQuantidadedeMovimentos() * 2.5); //2.5 é o critério para a pontuação 
	}

}
