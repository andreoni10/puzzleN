package br.com.poli.puzzle;

public class CalculaInsano implements CalculaScore {

	public int pontos(Puzzle partida) {
		return (int) (partida.getQuantidadedeMovimentos() * 2.5); //2.5 � o crit�rio para a pontua��o 
	}

}
