package br.com.poli.puzzle;

import java.util.Calendar;

public class Puzzle {

	private Jogador jogador;
	protected Tabuleiro gridPuzzle;
	private int quantidadeMovimentos;
	private CalculaScore score;
	private boolean venceu;
	private Calendar tempo;
	private Dificuldade dificuldade;

	public Puzzle(Jogador jogador, Tabuleiro gridPuzzle, Dificuldade dificuldade) {
		this.jogador = jogador;
		this.gridPuzzle = gridPuzzle;
		this.dificuldade = dificuldade;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Tabuleiro getGridPuzzle() {
		return gridPuzzle;
	}

	public void setGridPuzzle(Tabuleiro gridPuzzle) {
		this.gridPuzzle = gridPuzzle;
	}

	public int getQuantidadedeMovimentos() {
		return quantidadeMovimentos;
	}

	public void setQuantidadeMovimentos(int quantidadeMovimentos) {
		this.quantidadeMovimentos = quantidadeMovimentos;
	}

	public CalculaScore getScore() {
		return score;
	}

	public void setScore(CalculaScore score) {
		this.score = score;
	}

	public boolean isVenceu() {
		return venceu;
	}

	public void setVenceu(boolean venceu) {
		this.venceu = venceu;
	}

	public Calendar getTempo() {
		return tempo;
	}

	public void setTempo(Calendar tempo) {
		this.tempo = tempo;
	}

	public Dificuldade getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(Dificuldade dificuldade) {
		this.dificuldade = dificuldade;
	}

	private boolean isFimDeJogo() {
		if (gridPuzzle.isTabuleiroOrdenado()) {
			System.out.println("TABULEIRO ORDENADO! FIM DE JOGO!");
			return true;
		}
		return false;
	}

	public void iniciarPartida() {
		setQuantidadeMovimentos(0);
		tempo = Calendar.getInstance();
		venceu = false;
	}

}
