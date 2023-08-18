package br.com.poli.interfaces;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;


import br.com.poli.exceptions.MovimentoInvalidoException;
import br.com.poli.puzzle.CalculaDificil;
import br.com.poli.puzzle.Dificuldade;
import br.com.poli.puzzle.Jogador;
import br.com.poli.puzzle.Puzzle;
import br.com.poli.puzzle.Tabuleiro;

public class ButtonHandler implements ActionListener {

	private JButton iniciar;
	private JButton facil;
	private JButton medio;
	private JButton dificil;
	private JButton insano;
	private JButton rankingFacil;
	private JButton rankingMedio;
	private JButton rankingDificil;
	static String jogadorFacil[] = new String[4];
	static float pontuacaoFacil[] = new float[4];
	static long tempoFacil[] = new long[4];
	static String jogadorMedio[] = new String[4];
	static float pontuacaoMedio[] = new float[4];
	static long tempoMedio[] = new long[4];
	static String jogadorDificil[] = new String[4];
	static float pontuacaoDificil[] = new float[4];
	static long tempoDificil[] = new long[4];
	static int f = 0;
	static int m = 0;
	static int d = 0;

	public ButtonHandler(JButton iniciar, JButton facil, JButton medio, JButton dificil, JButton insano,
			JButton rankingFacil, JButton rankingMedio, JButton rankingDificil) {
		this.iniciar = iniciar;
		this.facil = facil;
		this.medio = medio;
		this.dificil = dificil;
		this.insano = insano;
		this.rankingFacil = rankingFacil;
		this.rankingMedio = rankingMedio;
		this.rankingDificil = rankingDificil;
	}
	
	public ButtonHandler() {
		
	}
	
	//Faz com que os números apareçam de forma aleatória
	public static Integer getRandom(List<Integer> array) {
		Integer rnd = new Random().nextInt(array.size());
		return array.get(rnd);
	}

	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == iniciar) {
			//Usado somente como título do jogo
		}
		
		//Joga o nível fácil
		if (evento.getSource() == facil) {
			jogadorFacil[f] = JOptionPane.showInputDialog("Nome:");
			
			new InterfaceFacil();
			
		}
		
		//Joga o nível médio
		if (evento.getSource() == medio) {
			jogadorMedio[m] = JOptionPane.showInputDialog("Nome:");
			new InterfaceMedio();
			
		}
		
		//Joga o nível dificil
		if (evento.getSource() == dificil) {
			jogadorDificil[d] = JOptionPane.showInputDialog("Nome:");
			new InterfaceDificil();
			
		}

		// Jogado somente no console
		if (evento.getSource() == insano) {

			Scanner scanInsano = new Scanner(System.in);
			System.out.print("Digite seu nome: ");
			String nomeInsano = scanInsano.next();
			Jogador playerInsano = new Jogador(nomeInsano);
			Tabuleiro tabuleiroInsano = new Tabuleiro(null);
			Puzzle puzzle = new Puzzle(playerInsano, tabuleiroInsano, Dificuldade.INSANO);

			System.out.println("Escolha o tamanho do grid (numero com raiz quadrada exata): ");//Possuir raiz exata para formar um grid quadrado Ex: 3x3, 4x4.
			int opcao = scanInsano.nextInt();
			tabuleiroInsano.geraTabuleiro(Dificuldade.INSANO, opcao);
			CalculaDificil scoreDificil = new CalculaDificil();
			
			puzzle.iniciarPartida();

			while (!tabuleiroInsano.isTabuleiroOrdenado()) {
				tabuleiroInsano.showTabuleiro();
				System.out.println("Escolha uma linha: ");
				int linha = scanInsano.nextInt();
				System.out.println("Escolha uma coluna: ");
				int coluna = scanInsano.nextInt();
				System.out.println("Escolha uma direcao: ");
				String direcao = scanInsano.next();
				try {
					tabuleiroInsano.executaMovimento(linha, coluna, direcao);
				} catch (MovimentoInvalidoException e) {
					e.printStackTrace();
				}
				puzzle.setQuantidadeMovimentos(puzzle.getQuantidadedeMovimentos() + 1);
			}
			if (tabuleiroInsano.isTabuleiroOrdenado()) {
				scoreDificil.pontos(puzzle);
			}
		}
		
		//Vê o ranking do nível fácil
		if (evento.getSource() == rankingFacil) {
			JTable rankingTabela = new JTable(6, 3);
			JFrame frame = new JFrame("Puzzle-N/RANKING/FACIL");

			frame.add(rankingTabela);
			frame.setBounds(880, 50, 500, 136);
			rankingTabela.setValueAt("                 Nome: ", 0, 0);
			rankingTabela.setValueAt("                 Pontuação: ", 0, 1); // Os espaços são para centralizar na interface
			rankingTabela.setValueAt("                 Tempo (min): ", 0, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorFacil[0], 1, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoFacil[0], 1, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoFacil[0], 1, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorFacil[1], 2, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoFacil[1], 2, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoFacil[1], 2, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorFacil[2], 3, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoFacil[2], 3, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoFacil[2], 3, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorFacil[3], 4, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoFacil[3], 4, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoFacil[3], 4, 2);

		
			frame.dispose();
			frame.setVisible(true);
		}
		
		//Vê o ranking do nível médio
		if (evento.getSource() == rankingMedio) {
			JTable rankingTabela = new JTable(6, 3);
			JFrame frame = new JFrame("Puzzle-N/RANKING/MEDIO");

			frame.add(rankingTabela);
			frame.setBounds(880, 50, 500, 136);
			rankingTabela.setValueAt("                 Nome: ", 0, 0);
			rankingTabela.setValueAt("                 Pontuação: ", 0, 1); // Os espaços são para centralizar na interface
			rankingTabela.setValueAt("                 Tempo (min): ", 0, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorMedio[0], 1, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoMedio[0], 1, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoMedio[0], 1, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorMedio[1], 2, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoMedio[1], 2, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoMedio[1], 2, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorMedio[2], 3, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoMedio[2], 3, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoMedio[2], 3, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorMedio[3], 4, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoMedio[3], 4, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoMedio[3], 4, 2);

			frame.dispose();
			frame.setVisible(true);
		}
		
		//Vê o ranking do nível dificil
		if (evento.getSource() == rankingDificil) {
			JTable rankingTabela = new JTable(6, 3);
			JFrame frame = new JFrame("Puzzle-N/RANKING/DIFICIL");

			frame.add(rankingTabela);
			frame.setBounds(880, 50, 500, 136);
			rankingTabela.setValueAt("                 Nome: ", 0, 0);
			rankingTabela.setValueAt("                 Pontuação: ", 0, 1); // Os espaços são para centralizar na interface	
			rankingTabela.setValueAt("                 Tempo (min): ", 0, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorDificil[0], 1, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoDificil[0], 1, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoDificil[0], 1, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorDificil[1], 2, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoDificil[1], 2, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoDificil[1], 2, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorDificil[2], 3, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoDificil[2], 3, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoDificil[2], 3, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorDificil[3], 4, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoDificil[3], 4, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoDificil[3], 4, 2);

			frame.dispose();
			frame.setVisible(true);
		}
	}
}