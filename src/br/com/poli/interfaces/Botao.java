package br.com.poli.interfaces;


import javax.swing.JButton;
import javax.swing.JFrame;

public class Botao extends JFrame {
	
	//Botoes do Menu

	private JButton iniciar = new JButton("PUZZLE - N");
	private JButton facil = new JButton("FACIL");
	private JButton medio = new JButton("MEDIO");
	private JButton dificil = new JButton("DIFICIL");
	private JButton insano = new JButton("INSANO");
	private JButton rankingFacil = new JButton("RANKING - FACIL");
	private JButton rankingMedio = new JButton("RANKING - MEDIO");
	private JButton rankingDificil = new JButton("RANKING - DIFICIL");
	private ButtonHandler handler;

	public Botao() {

		super("Puzzle-N"); //Título do menu
		setLayout(null);
		
		//Localização, altura e largura dos botões
		iniciar.setBounds(0, 10, 500, 50);
		facil.setBounds(120, 100, 250, 50);
		medio.setBounds(120, 150, 250, 50);
		dificil.setBounds(120, 200, 250, 50);
		insano.setBounds(120, 250, 250, 50);
		rankingFacil.setBounds(120, 300, 250, 50);
		rankingMedio.setBounds(120, 350, 250, 50);
		rankingDificil.setBounds(120, 400, 250, 50);

		handler = new ButtonHandler(iniciar, facil, medio, dificil, insano, rankingFacil, rankingMedio, rankingDificil);

		iniciar.addActionListener(handler);
		facil.addActionListener(handler);
		medio.addActionListener(handler);
		dificil.addActionListener(handler);
		insano.addActionListener(handler);
		rankingFacil.addActionListener(handler);
		rankingMedio.addActionListener(handler);
		rankingDificil.addActionListener(handler);

		add(iniciar);
		add(facil);
		add(medio);
		add(dificil);
		add(insano);
		add(rankingFacil);
		add(rankingMedio);
		add(rankingDificil);

	}
	

}
