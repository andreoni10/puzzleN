package br.com.poli.interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class InterfaceDificil extends Frame implements ActionListener {
	private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23,
			b24, b25, desistir, resolveTabuleiro, ajuda;
	private static long tempoInicio = Calendar.getInstance().getTime().getTime();
	private static int i = 0;
	private int j = 0;
	private int jogada;
	
	//Faz com que os números apareçam de forma aleatória
	public static Integer getRandom(List<Integer> array) {
		Integer rnd = new Random().nextInt(array.size());
		return array.get(rnd);
	}

	public InterfaceDificil() {
		super("Puzzle-N/DIFICIL/ " + ButtonHandler.jogadorDificil[i]); //Título do menu + nome do jogador
		
		//Número de botões da dificuldade 
		List<Integer> numeros = new ArrayList<Integer>();
		for (int n = 1; n < 25; n++) {
			numeros.add(n);
		}

		JOptionPane.showMessageDialog(null, "Pressione OK para iniciar");//Botão para o início da partida, onde o tabuleiro só é gerado após o seu acionamento
		
		//Localiza os numeros na tela e impede que números iguais apareçam
		Integer escolhido1 = getRandom(numeros);
		b1 = new Button(escolhido1.toString());
		b1.setBounds(80, 60, 50, 50);
		numeros.remove(escolhido1);
		Integer escolhido2 = getRandom(numeros);
		b2 = new Button(escolhido2.toString());
		b2.setBounds(150, 60, 50, 50);
		numeros.remove(escolhido2);
		Integer escolhido3 = getRandom(numeros);
		b3 = new Button(escolhido3.toString());
		b3.setBounds(220, 60, 50, 50);
		numeros.remove(escolhido3);
		Integer escolhido4 = getRandom(numeros);
		b4 = new Button(escolhido4.toString());
		b4.setBounds(290, 60, 50, 50);
		numeros.remove(escolhido4);
		Integer escolhido5 = getRandom(numeros);
		b5 = new Button(escolhido5.toString());
		b5.setBounds(360, 60, 50, 50);
		numeros.remove(escolhido5);
		Integer escolhido6 = getRandom(numeros);
		b6 = new Button(escolhido6.toString());
		b6.setBounds(80, 120, 50, 50);
		numeros.remove(escolhido6);
		Integer escolhido7 = getRandom(numeros);
		b7 = new Button(escolhido7.toString());
		b7.setBounds(150, 120, 50, 50);
		numeros.remove(escolhido7);
		Integer escolhido8 = getRandom(numeros);
		b8 = new Button(escolhido8.toString());
		b8.setBounds(220, 120, 50, 50);
		numeros.remove(escolhido8);
		Integer escolhido9 = getRandom(numeros);
		b9 = new Button(escolhido9.toString());
		b9.setBounds(290, 120, 50, 50);
		numeros.remove(escolhido9);
		Integer escolhido10 = getRandom(numeros);
		b10 = new Button(escolhido10.toString());
		b10.setBounds(360, 120, 50, 50);
		numeros.remove(escolhido10);
		Integer escolhido11 = getRandom(numeros);
		b11 = new Button(escolhido11.toString());
		b11.setBounds(80, 180, 50, 50);
		numeros.remove(escolhido11);
		Integer escolhido12 = getRandom(numeros);
		b12 = new Button(escolhido12.toString());
		b12.setBounds(150, 180, 50, 50);
		numeros.remove(escolhido12);
		Integer escolhido13 = getRandom(numeros);
		b13 = new Button(escolhido13.toString());
		b13.setBounds(220, 180, 50, 50);
		numeros.remove(escolhido13);
		Integer escolhido14 = getRandom(numeros);
		b14 = new Button(escolhido14.toString());
		b14.setBounds(290, 180, 50, 50);
		numeros.remove(escolhido14);
		Integer escolhido15 = getRandom(numeros);
		b15 = new Button(escolhido15.toString());
		b15.setBounds(360, 180, 50, 50);
		numeros.remove(escolhido15);
		Integer escolhido16 = getRandom(numeros);
		b16 = new Button(escolhido16.toString());
		b16.setBounds(80, 240, 50, 50);
		numeros.remove(escolhido16);
		Integer escolhido17 = getRandom(numeros);
		b17 = new Button(escolhido17.toString());
		b17.setBounds(150, 240, 50, 50);
		numeros.remove(escolhido17);
		Integer escolhido18 = getRandom(numeros);
		b18 = new Button(escolhido18.toString());
		b18.setBounds(220, 240, 50, 50);
		numeros.remove(escolhido18);
		Integer escolhido19 = getRandom(numeros);
		b19 = new Button(escolhido19.toString());
		b19.setBounds(290, 240, 50, 50);
		numeros.remove(escolhido19);
		Integer escolhido20 = getRandom(numeros);
		b20 = new Button(escolhido20.toString());
		b20.setBounds(360, 240, 50, 50);
		numeros.remove(escolhido20);
		Integer escolhido21 = getRandom(numeros);
		b21 = new Button(escolhido21.toString());
		b21.setBounds(80, 300, 50, 50);
		numeros.remove(escolhido21);
		Integer escolhido22 = getRandom(numeros);
		b22 = new Button(escolhido22.toString());
		b22.setBounds(150, 300, 50, 50);
		numeros.remove(escolhido22);
		Integer escolhido23 = getRandom(numeros);
		b23 = new Button(escolhido23.toString());
		b23.setBounds(220, 300, 50, 50);
		numeros.remove(escolhido23);
		Integer escolhido24 = getRandom(numeros);
		b24 = new Button(escolhido24.toString());
		b24.setBounds(290, 300, 50, 50);
		numeros.remove(escolhido24);
		b25 = new Button("");
		b25.setBounds(360, 300, 50, 50);
		desistir = new Button("DESISTIR");
		desistir.setBounds(195, 420, 100, 40);
		resolveTabuleiro = new Button("RESOLVER TABULEIRO");
		resolveTabuleiro.setBounds(170, 470, 150, 50);
		ajuda = new Button("AJUDA");
		ajuda.setBounds(195, 370, 100, 40);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);
		b25.addActionListener(this);
		desistir.addActionListener(this);
		resolveTabuleiro.addActionListener(this);
		ajuda.addActionListener(this);

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		add(b18);
		add(b19);
		add(b20);
		add(b21);
		add(b22);
		add(b23);
		add(b24);
		add(b25);
		add(desistir);
		add(resolveTabuleiro);
		add(ajuda);
		setBackground(Color.red);
		setLocation(400, 100);
		setSize(500, 550);
		setLayout(null);
		setVisible(true);
	}
	
	//Verifica os botões em volta para ver se é possiver realizar o movimento do botão acionado
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String label = b1.getLabel();
			if (b2.getLabel() != ("") && b6.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido"); //Caso o movimento seja inválido
			}
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b1.setLabel("");
				jogada++;
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b1.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b2) {
			String label = b2.getLabel();
			if (b1.getLabel() != ("") && b7.getLabel() != ("") && b3.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b1.getLabel().equals("")) {
				b1.setLabel(label);
				b2.setLabel("");
				jogada++;
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b2.setLabel("");
				jogada++;
			}
			if (b3.getLabel().equals("")) {
				b3.setLabel(label);
				b2.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b3) {
			String label = b3.getLabel();
			if (b2.getLabel() != ("") && b8.getLabel() != ("") && b4.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b3.setLabel("");
				jogada++;
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b3.setLabel("");
				jogada++;
			}
			if (b4.getLabel().equals("")) {
				b4.setLabel(label);
				b3.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b4) {
			String label = b4.getLabel();
			if (b3.getLabel() != ("") && b9.getLabel() != ("") && b5.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b3.getLabel().equals("")) {
				b3.setLabel(label);
				b4.setLabel("");
				jogada++;
			}
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b4.setLabel("");
				jogada++;
			}
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b4.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b5) {
			String label = b5.getLabel();
			if (b4.getLabel() != ("") && b10.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b4.getLabel().equals("")) {
				b4.setLabel(label);
				b5.setLabel("");
				jogada++;
			}
			if (b10.getLabel().equals("")) {
				b10.setLabel(label);
				b5.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b6) {
			String label = b6.getLabel();
			if (b1.getLabel() != ("") && b7.getLabel() != ("") && b11.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b1.getLabel().equals("")) {
				b1.setLabel(label);
				b6.setLabel("");
				jogada++;
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b6.setLabel("");
				jogada++;
			}
			if (b11.getLabel().equals("")) {
				b11.setLabel(label);
				b6.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b7) {
			String label = b7.getLabel();
			if (b6.getLabel() != ("") && b2.getLabel() != ("") && b8.getLabel() != ("") && b12.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b7.setLabel("");
				jogada++;
			}
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b7.setLabel("");
				jogada++;
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b7.setLabel("");
				jogada++;
			}
			if (b12.getLabel().equals("")) {
				b12.setLabel(label);
				b7.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b8) {
			String label = b8.getLabel();
			if (b3.getLabel() != ("") && b7.getLabel() != ("") && b9.getLabel() != ("") && b13.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b3.getLabel().equals("")) {
				b3.setLabel(label);
				b8.setLabel("");
				jogada++;
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b8.setLabel("");
				jogada++;
			}
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b8.setLabel("");
				jogada++;
			}
			if (b13.getLabel().equals("")) {
				b13.setLabel(label);
				b8.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b9) {
			String label = b9.getLabel();
			if (b8.getLabel() != ("") && b4.getLabel() != ("") && b10.getLabel() != ("") && b14.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b9.setLabel("");
				jogada++;
			}
			if (b4.getLabel().equals("")) {
				b4.setLabel(label);
				b9.setLabel("");
				jogada++;
			}
			if (b10.getLabel().equals("")) {
				b10.setLabel(label);
				b9.setLabel("");
				jogada++;
			}
			if (b14.getLabel().equals("")) {
				b14.setLabel(label);
				b9.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b10) {
			String label = b10.getLabel();
			if (b5.getLabel() != ("") && b9.getLabel() != ("") && b15.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b10.setLabel("");
				jogada++;
			}
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b10.setLabel("");
				jogada++;
			}
			if (b15.getLabel().equals("")) {
				b15.setLabel(label);
				b10.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b11) {
			String label = b11.getLabel();
			if (b6.getLabel() != ("") && b12.getLabel() != ("") && b16.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b11.setLabel("");
				jogada++;
			}
			if (b12.getLabel().equals("")) {
				b12.setLabel(label);
				b11.setLabel("");
				jogada++;
			}
			if (b16.getLabel().equals("")) {
				b16.setLabel(label);
				b11.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b12) {
			String label = b12.getLabel();
			if (b11.getLabel() != ("") && b7.getLabel() != ("") && b13.getLabel() != ("") && b17.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b11.getLabel().equals("")) {
				b11.setLabel(label);
				b12.setLabel("");
				jogada++;
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b12.setLabel("");
				jogada++;
			}
			if (b13.getLabel().equals("")) {
				b13.setLabel(label);
				b12.setLabel("");
				jogada++;
			}
			if (b17.getLabel().equals("")) {
				b17.setLabel(label);
				b12.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b13) {
			String label = b13.getLabel();
			if (b12.getLabel() != ("") && b8.getLabel() != ("") && b14.getLabel() != ("") && b18.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b12.getLabel().equals("")) {
				b12.setLabel(label);
				b13.setLabel("");
				jogada++;
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b13.setLabel("");
				jogada++;
			}
			if (b14.getLabel().equals("")) {
				b14.setLabel(label);
				b13.setLabel("");
				jogada++;
			}
			if (b18.getLabel().equals("")) {
				b18.setLabel(label);
				b13.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b14) {
			String label = b14.getLabel();
			if (b13.getLabel() != ("") && b9.getLabel() != ("") && b15.getLabel() != ("") && b19.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b13.getLabel().equals("")) {
				b13.setLabel(label);
				b14.setLabel("");
				jogada++;
			}
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b14.setLabel("");
				jogada++;
			}
			if (b15.getLabel().equals("")) {
				b15.setLabel(label);
				b14.setLabel("");
				jogada++;
			}
			if (b19.getLabel().equals("")) {
				b19.setLabel(label);
				b14.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b15) {
			String label = b15.getLabel();
			if (b14.getLabel() != ("") && b10.getLabel() != ("") && b20.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b14.getLabel().equals("")) {
				b14.setLabel(label);
				b15.setLabel("");
				jogada++;
			}
			if (b10.getLabel().equals("")) {
				b10.setLabel(label);
				b15.setLabel("");
				jogada++;
			}
			if (b20.getLabel().equals("")) {
				b20.setLabel(label);
				b15.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b16) {
			String label = b16.getLabel();
			if (b11.getLabel() != ("") && b17.getLabel() != ("") && b21.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b11.getLabel().equals("")) {
				b11.setLabel(label);
				b16.setLabel("");
				jogada++;
			}
			if (b17.getLabel().equals("")) {
				b17.setLabel(label);
				b16.setLabel("");
				jogada++;
			}
			if (b21.getLabel().equals("")) {
				b21.setLabel(label);
				b16.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b17) {
			String label = b17.getLabel();
			if (b16.getLabel() != ("") && b12.getLabel() != ("") && b18.getLabel() != ("") && b22.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b16.getLabel().equals("")) {
				b16.setLabel(label);
				b17.setLabel("");
				jogada++;
			}
			if (b12.getLabel().equals("")) {
				b12.setLabel(label);
				b17.setLabel("");
				jogada++;
			}
			if (b18.getLabel().equals("")) {
				b18.setLabel(label);
				b17.setLabel("");
				jogada++;
			}
			if (b22.getLabel().equals("")) {
				b22.setLabel(label);
				b17.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b18) {
			String label = b18.getLabel();
			if (b17.getLabel() != ("") && b13.getLabel() != ("") && b19.getLabel() != ("") && b23.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b17.getLabel().equals("")) {
				b17.setLabel(label);
				b18.setLabel("");
				jogada++;
			}
			if (b13.getLabel().equals("")) {
				b13.setLabel(label);
				b18.setLabel("");
				jogada++;
			}
			if (b19.getLabel().equals("")) {
				b19.setLabel(label);
				b18.setLabel("");
				jogada++;
			}
			if (b23.getLabel().equals("")) {
				b23.setLabel(label);
				b18.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b19) {
			String label = b19.getLabel();
			if (b18.getLabel() != ("") && b14.getLabel() != ("") && b20.getLabel() != ("") && b24.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b18.getLabel().equals("")) {
				b18.setLabel(label);
				b19.setLabel("");
				jogada++;
			}
			if (b14.getLabel().equals("")) {
				b14.setLabel(label);
				b19.setLabel("");
				jogada++;
			}
			if (b20.getLabel().equals("")) {
				b20.setLabel(label);
				b19.setLabel("");
				jogada++;
			}
			if (b24.getLabel().equals("")) {
				b24.setLabel(label);
				b19.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b20) {
			String label = b20.getLabel();
			if (b15.getLabel() != ("") && b19.getLabel() != ("") && b25.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b15.getLabel().equals("")) {
				b15.setLabel(label);
				b20.setLabel("");
				jogada++;
			}
			if (b19.getLabel().equals("")) {
				b19.setLabel(label);
				b20.setLabel("");
				jogada++;
			}
			if (b25.getLabel().equals("")) {
				b25.setLabel(label);
				b20.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b21) {
			String label = b21.getLabel();
			if (b16.getLabel() != ("") && b22.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b16.getLabel().equals("")) {
				b16.setLabel(label);
				b21.setLabel("");
				jogada++;
			}
			if (b22.getLabel().equals("")) {
				b22.setLabel(label);
				b21.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b22) {
			String label = b22.getLabel();
			if (b21.getLabel() != ("") && b17.getLabel() != ("") && b23.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b21.getLabel().equals("")) {
				b21.setLabel(label);
				b22.setLabel("");
				jogada++;
			}
			if (b17.getLabel().equals("")) {
				b17.setLabel(label);
				b22.setLabel("");
				jogada++;
			}
			if (b23.getLabel().equals("")) {
				b23.setLabel(label);
				b22.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b23) {
			String label = b23.getLabel();
			if (b22.getLabel() != ("") && b18.getLabel() != ("") && b24.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b22.getLabel().equals("")) {
				b22.setLabel(label);
				b23.setLabel("");
				jogada++;
			}
			if (b18.getLabel().equals("")) {
				b18.setLabel(label);
				b23.setLabel("");
				jogada++;
			}
			if (b24.getLabel().equals("")) {
				b24.setLabel(label);
				b23.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b24) {
			String label = b24.getLabel();
			if (b23.getLabel() != ("") && b19.getLabel() != ("") && b25.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b23.getLabel().equals("")) {
				b23.setLabel(label);
				b24.setLabel("");
				jogada++;
			}
			if (b19.getLabel().equals("")) {
				b19.setLabel(label);
				b24.setLabel("");
				jogada++;
			}
			if (b25.getLabel().equals("")) {
				b25.setLabel(label);
				b24.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b25) {
			String label = b25.getLabel();
			if (b20.getLabel() != ("") && b24.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b20.getLabel().equals("")) {
				b20.setLabel(label);
				b25.setLabel("");
				jogada++;
			}
			if (b24.getLabel().equals("")) {
				b24.setLabel(label);
				b25.setLabel("");
				jogada++;
			}
		}
		
		//Tela de desistência com os dados da partida jogada
		if (e.getSource() == desistir) {

			JOptionPane.showMessageDialog(this, "Voce Perdeu");
			JTable rankingTabela = new JTable(2, 3);
			JFrame frame = new JFrame("FIM DE JOGO");
			long tempoFinal = (Calendar.getInstance().getTime().getTime() - tempoInicio) / 60000;
			ButtonHandler.tempoDificil[i] = tempoFinal;

			
			frame.add(rankingTabela);
			frame.setBounds(880, 50, 500, 136);
			rankingTabela.setValueAt("                 Nome: ", 0, 0);
			rankingTabela.setValueAt("                 Pontuação: ", 0, 1); // Os espaços são para centralizar na interface					
			rankingTabela.setValueAt("                 Tempo (min): ", 0, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorDificil[i], 1, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoDificil[i] = (float) (jogada * 2.5), 1, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoDificil[i], 1, 2);
			tempoInicio = Calendar.getInstance().getTime().getTime();
			i++;
			ButtonHandler.d++;
			
			
			frame.dispose();
			frame.setVisible(true);
			
			//Retorna ao menu
			Botao menu = new Botao();
			menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			menu.getContentPane().setBackground(Color.orange);
			menu.setBounds(400, 100, 500, 550);
			menu.setVisible(true);
		}
		
		//Resolve o tabuleiro
		if (e.getSource() == resolveTabuleiro) {
			
			b1.setLabel("1");
			b2.setLabel("2");
			b3.setLabel("3");
			b4.setLabel("4");
			b5.setLabel("5");
			b6.setLabel("6");
			b7.setLabel("7");
			b8.setLabel("8");
			b9.setLabel("9");
			b10.setLabel("10");
			b11.setLabel("11");
			b12.setLabel("12");
			b13.setLabel("13");
			b14.setLabel("14");
			b15.setLabel("15");
			b16.setLabel("16");
			b17.setLabel("17");
			b18.setLabel("18");
			b19.setLabel("19");
			b20.setLabel("20");
			b21.setLabel("21");
			b22.setLabel("22");
			b23.setLabel("23");
			b24.setLabel("24");
			b25.setLabel("");
			
		}
		
		//Troca os números de lugar, colocando-os em ordem a cada vez q o botão AJUDA é acionado
		if (e.getSource() == ajuda) {
			
			if (b1.getLabel() != ("1")) 
			{ j = 0;}
			
			if (b1.getLabel().equals("1") && b2.getLabel() != ("2")) 
			{ j = 1;} 
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel() != ("3")) 
			{ j = 2;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel() != ("4")) 
			{ j = 3;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel() != ("5")) 
			{ j = 4;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel() != ("6")) 
			{ j = 5;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel() != ("7")) 
			{ j = 6;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel() != ("8")) 
			{ j = 7;}
			
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel() != ("9")) 
			{ j = 8;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") &&
				b10.getLabel() != ("10")) 
			{ j = 9;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") &&
				b10.getLabel().equals("10") && b11.getLabel() != ("11")) 
			{ j = 10;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") &&
				b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel() != ("12")) 
			{ j = 11;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") &&
				b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12") &&
				b13.getLabel() != ("13")) 
			{ j = 12;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") &&
				b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12") &&
				b13.getLabel().equals("13") && b14.getLabel() != ("14")) 
			{ j = 13;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") &&
				b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12") &&
				b13.getLabel().equals("13") && b14.getLabel().equals("14") && b15.getLabel() != ("15")) 
			{ j = 14;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") &&
				b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12") &&
				b13.getLabel().equals("13") && b14.getLabel().equals("14") && b15.getLabel().equals("15") &&
				b16.getLabel() != ("16")) 
			{ j = 15;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") &&
				b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12") &&
				b13.getLabel().equals("13") && b14.getLabel().equals("14") && b15.getLabel().equals("15") &&
				b16.getLabel().equals("16") && b17.getLabel() != ("17")) 
			{ j = 16;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") &&
				b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12") &&
				b13.getLabel().equals("13") && b14.getLabel().equals("14") && b15.getLabel().equals("15") &&
				b16.getLabel().equals("16") && b17.getLabel().equals("17") && b18.getLabel() != ("18")) 
			{ j = 17;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") &&
				b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12") &&
				b13.getLabel().equals("13") && b14.getLabel().equals("14") && b15.getLabel().equals("15") &&
				b16.getLabel().equals("16") && b17.getLabel().equals("17") && b18.getLabel().equals("18") &&
				b19.getLabel() != ("19")) 
			{ j = 18;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") &&
				b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12") &&
				b13.getLabel().equals("13") && b14.getLabel().equals("14") && b15.getLabel().equals("15") &&
				b16.getLabel().equals("16") && b17.getLabel().equals("17") && b18.getLabel().equals("18") &&
				b19.getLabel().equals("19") && b20.getLabel() != ("20")) 
			{ j = 19;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") &&
				b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12") &&
				b13.getLabel().equals("13") && b14.getLabel().equals("14") && b15.getLabel().equals("15") &&
				b16.getLabel().equals("16") && b17.getLabel().equals("17") && b18.getLabel().equals("18") &&
				b19.getLabel().equals("19") && b20.getLabel().equals("20") && b21.getLabel() != ("21")) 
			{ j = 20;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") &&
				b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12") &&
				b13.getLabel().equals("13") && b14.getLabel().equals("14") && b15.getLabel().equals("15") &&
				b16.getLabel().equals("16") && b17.getLabel().equals("17") && b18.getLabel().equals("18") &&
				b19.getLabel().equals("19") && b20.getLabel().equals("20") && b21.getLabel().equals("21") &&
				b22.getLabel() != ("22")) 
			{ j = 21;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") &&
				b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12") &&
				b13.getLabel().equals("13") && b14.getLabel().equals("14") && b15.getLabel().equals("15") &&
				b16.getLabel().equals("16") && b17.getLabel().equals("17") && b18.getLabel().equals("18") &&
				b19.getLabel().equals("19") && b20.getLabel().equals("20") && b21.getLabel().equals("21") &&
				b22.getLabel().equals("22") && b23.getLabel() != ("23")) 
			{ j = 22;}
			
			if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") &&
				b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12") &&
				b13.getLabel().equals("13") && b14.getLabel().equals("14") && b15.getLabel().equals("15") &&
				b16.getLabel().equals("16") && b17.getLabel().equals("17") && b18.getLabel().equals("18") &&
				b19.getLabel().equals("19") && b20.getLabel().equals("20") && b21.getLabel().equals("21") &&
				b22.getLabel().equals("22") && b23.getLabel().equals("23") && b24.getLabel() != ("24")) 
			{ j = 23;}
			
			
			if(j == 0) {
				String ajuda = b1.getLabel();
				if (b1.getLabel() != ("1") && b2.getLabel().equals("1")) {
					b1.setLabel("1");
					b2.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b3.getLabel().equals("1")) {
					b1.setLabel("1");
					b3.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b4.getLabel().equals("1")) {
					b1.setLabel("1");
					b4.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b5.getLabel().equals("1")) {
					b1.setLabel("1");
					b5.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b6.getLabel().equals("1")) {
					b1.setLabel("1");
					b6.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b7.getLabel().equals("1")) {
					b1.setLabel("1");
					b7.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b8.getLabel().equals("1")) {
					b1.setLabel("1");
					b8.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b9.getLabel().equals("1")) {
					b1.setLabel("1");
					b9.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b10.getLabel().equals("1")) {
					b1.setLabel("1");
					b10.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b11.getLabel().equals("1")) {
					b1.setLabel("1");
					b11.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b12.getLabel().equals("1")) {
					b1.setLabel("1");
					b12.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b13.getLabel().equals("1")) {
					b1.setLabel("1");
					b13.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b14.getLabel().equals("1")) {
					b1.setLabel("1");
					b14.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b15.getLabel().equals("1")) {
					b1.setLabel("1");
					b15.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b16.getLabel().equals("1")) {
					b1.setLabel("1");
					b16.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b17.getLabel().equals("1")) {
					b1.setLabel("1");
					b17.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b18.getLabel().equals("1")) {
					b1.setLabel("1");
					b18.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b19.getLabel().equals("1")) {
					b1.setLabel("1");
					b19.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b20.getLabel().equals("1")) {
					b1.setLabel("1");
					b20.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b21.getLabel().equals("1")) {
					b1.setLabel("1");
					b21.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b22.getLabel().equals("1")) {
					b1.setLabel("1");
					b22.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b23.getLabel().equals("1")) {
					b1.setLabel("1");
					b23.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b24.getLabel().equals("1")) {
					b1.setLabel("1");
					b24.setLabel(ajuda);
					jogada++;
					}
				if (b1.getLabel() != ("1") && b25.getLabel().equals("1")) {
					b1.setLabel("1");
					b25.setLabel(ajuda);
					jogada++;
					}
				
				}
				
				if (j == 1) {
				String ajuda = b2.getLabel();
				if (b2.getLabel() != ("2") && b1.getLabel().equals("2")) {
					b2.setLabel("2");
					b1.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b3.getLabel().equals("2")) {
					b2.setLabel("2");
					b3.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b4.getLabel().equals("2")) {
					b2.setLabel("2");
					b4.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b5.getLabel().equals("2")) {
					b2.setLabel("2");
					b5.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b6.getLabel().equals("2")) {
					b2.setLabel("2");
					b6.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b7.getLabel().equals("2")) {
					b2.setLabel("2");
					b7.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b8.getLabel().equals("2")) {
					b2.setLabel("2");
					b8.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b9.getLabel().equals("2")) {
					b2.setLabel("2");
					b9.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b10.getLabel().equals("2")) {
					b2.setLabel("2");
					b10.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b11.getLabel().equals("2")) {
					b2.setLabel("2");
					b11.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b12.getLabel().equals("2")) {
					b2.setLabel("2");
					b12.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b13.getLabel().equals("2")) {
					b2.setLabel("2");
					b13.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b14.getLabel().equals("2")) {
					b2.setLabel("2");
					b14.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b15.getLabel().equals("2")) {
					b2.setLabel("2");
					b15.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b16.getLabel().equals("2")) {
					b2.setLabel("2");
					b16.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b17.getLabel().equals("2")) {
					b2.setLabel("2");
					b17.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b18.getLabel().equals("2")) {
					b2.setLabel("2");
					b18.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b19.getLabel().equals("2")) {
					b2.setLabel("2");
					b19.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b20.getLabel().equals("2")) {
					b2.setLabel("2");
					b20.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b21.getLabel().equals("2")) {
					b2.setLabel("2");
					b21.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b22.getLabel().equals("2")) {
					b2.setLabel("2");
					b22.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b23.getLabel().equals("2")) {
					b2.setLabel("2");
					b23.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b24.getLabel().equals("2")) {
					b2.setLabel("2");
					b24.setLabel(ajuda);
					jogada++;
					}
				if (b2.getLabel() != ("2") && b25.getLabel().equals("2")) {
					b2.setLabel("2");
					b25.setLabel(ajuda);
					jogada++;
					}
				}
				if(j == 2) {
					String ajuda = b3.getLabel();
					if (b3.getLabel() != ("3") && b1.getLabel().equals("3")) {
						b3.setLabel("3");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b2.getLabel().equals("3")) {
						b3.setLabel("3");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b4.getLabel().equals("3")) {
						b3.setLabel("3");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b5.getLabel().equals("3")) {
						b3.setLabel("3");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b6.getLabel().equals("3")) {
						b3.setLabel("3");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b7.getLabel().equals("3")) {
						b3.setLabel("3");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b8.getLabel().equals("3")) {
						b3.setLabel("3");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b9.getLabel().equals("3")) {
						b3.setLabel("3");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b10.getLabel().equals("3")) {
						b3.setLabel("3");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b11.getLabel().equals("3")) {
						b3.setLabel("3");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b12.getLabel().equals("3")) {
						b3.setLabel("3");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b13.getLabel().equals("3")) {
						b3.setLabel("3");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b14.getLabel().equals("3")) {
						b3.setLabel("3");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b15.getLabel().equals("3")) {
						b3.setLabel("3");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b16.getLabel().equals("3")) {
						b3.setLabel("3");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b17.getLabel().equals("3")) {
						b3.setLabel("3");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b18.getLabel().equals("3")) {
						b3.setLabel("3");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b19.getLabel().equals("3")) {
						b3.setLabel("3");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b20.getLabel().equals("3")) {
						b3.setLabel("3");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b20.getLabel().equals("3")) {
						b3.setLabel("3");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b21.getLabel().equals("3")) {
						b3.setLabel("3");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b22.getLabel().equals("3")) {
						b3.setLabel("3");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b23.getLabel().equals("3")) {
						b3.setLabel("3");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b24.getLabel().equals("3")) {
						b3.setLabel("3");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b3.getLabel() != ("3") && b25.getLabel().equals("3")) {
						b3.setLabel("3");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 3) {
					String ajuda = b4.getLabel();
					if (b4.getLabel() != ("4") && b1.getLabel().equals("4")) {
						b4.setLabel("4");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b2.getLabel().equals("4")) {
						b4.setLabel("4");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b3.getLabel().equals("4")) {
						b4.setLabel("4");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b5.getLabel().equals("4")) {
						b4.setLabel("4");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b6.getLabel().equals("4")) {
						b4.setLabel("4");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b7.getLabel().equals("4")) {
						b4.setLabel("4");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b8.getLabel().equals("4")) {
						b4.setLabel("4");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b9.getLabel().equals("4")) {
						b4.setLabel("4");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b10.getLabel().equals("4")) {
						b4.setLabel("4");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b11.getLabel().equals("4")) {
						b4.setLabel("4");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b12.getLabel().equals("4")) {
						b4.setLabel("4");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b13.getLabel().equals("4")) {
						b4.setLabel("4");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b14.getLabel().equals("4")) {
						b4.setLabel("4");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b15.getLabel().equals("4")) {
						b4.setLabel("4");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b16.getLabel().equals("4")) {
						b4.setLabel("4");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b17.getLabel().equals("4")) {
						b4.setLabel("4");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b18.getLabel().equals("4")) {
						b4.setLabel("4");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b19.getLabel().equals("4")) {
						b4.setLabel("4");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b20.getLabel().equals("4")) {
						b4.setLabel("4");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b21.getLabel().equals("4")) {
						b4.setLabel("4");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b22.getLabel().equals("4")) {
						b4.setLabel("4");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b23.getLabel().equals("4")) {
						b4.setLabel("4");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b24.getLabel().equals("4")) {
						b4.setLabel("4");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b4.getLabel() != ("4") && b25.getLabel().equals("4")) {
						b4.setLabel("4");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 4) {
					String ajuda = b5.getLabel();
					if (b5.getLabel() != ("5") && b1.getLabel().equals("5")) {
						b5.setLabel("5");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b2.getLabel().equals("5")) {
						b5.setLabel("5");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b3.getLabel().equals("5")) {
						b5.setLabel("5");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b4.getLabel().equals("5")) {
						b5.setLabel("5");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b6.getLabel().equals("5")) {
						b5.setLabel("5");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b7.getLabel().equals("5")) {
						b5.setLabel("5");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b8.getLabel().equals("5")) {
						b5.setLabel("5");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b9.getLabel().equals("5")) {
						b5.setLabel("5");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b10.getLabel().equals("5")) {
						b5.setLabel("5");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b11.getLabel().equals("5")) {
						b5.setLabel("5");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b12.getLabel().equals("5")) {
						b5.setLabel("5");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b13.getLabel().equals("5")) {
						b5.setLabel("5");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b14.getLabel().equals("5")) {
						b5.setLabel("5");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b15.getLabel().equals("5")) {
						b5.setLabel("5");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b16.getLabel().equals("5")) {
						b5.setLabel("5");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b17.getLabel().equals("5")) {
						b5.setLabel("5");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b18.getLabel().equals("5")) {
						b5.setLabel("5");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b19.getLabel().equals("5")) {
						b5.setLabel("5");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b20.getLabel().equals("5")) {
						b5.setLabel("5");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b21.getLabel().equals("5")) {
						b5.setLabel("5");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b22.getLabel().equals("5")) {
						b5.setLabel("5");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b23.getLabel().equals("5")) {
						b5.setLabel("5");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b24.getLabel().equals("5")) {
						b5.setLabel("5");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b5.getLabel() != ("5") && b25.getLabel().equals("5")) {
						b5.setLabel("5");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 5) {
					String ajuda = b6.getLabel();
					if (b6.getLabel() != ("6") && b1.getLabel().equals("6")) {
						b6.setLabel("6");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b2.getLabel().equals("6")) {
						b6.setLabel("6");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b3.getLabel().equals("6")) {
						b6.setLabel("6");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b4.getLabel().equals("6")) {
						b6.setLabel("6");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b5.getLabel().equals("6")) {
						b6.setLabel("6");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b7.getLabel().equals("6")) {
						b6.setLabel("6");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b8.getLabel().equals("6")) {
						b6.setLabel("6");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b9.getLabel().equals("6")) {
						b6.setLabel("6");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b10.getLabel().equals("6")) {
						b6.setLabel("6");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b11.getLabel().equals("6")) {
						b6.setLabel("6");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b12.getLabel().equals("6")) {
						b6.setLabel("6");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b13.getLabel().equals("6")) {
						b6.setLabel("6");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b14.getLabel().equals("6")) {
						b6.setLabel("6");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b15.getLabel().equals("6")) {
						b6.setLabel("6");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b16.getLabel().equals("6")) {
						b6.setLabel("6");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b17.getLabel().equals("6")) {
						b6.setLabel("6");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b18.getLabel().equals("6")) {
						b6.setLabel("6");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b19.getLabel().equals("6")) {
						b6.setLabel("6");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b20.getLabel().equals("6")) {
						b6.setLabel("6");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b21.getLabel().equals("6")) {
						b6.setLabel("6");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b22.getLabel().equals("6")) {
						b6.setLabel("6");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b23.getLabel().equals("6")) {
						b6.setLabel("6");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b24.getLabel().equals("6")) {
						b6.setLabel("6");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b6.getLabel() != ("6") && b25.getLabel().equals("6")) {
						b6.setLabel("6");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 6) {
					String ajuda = b7.getLabel();
					if (b7.getLabel() != ("7") && b1.getLabel().equals("7")) {
						b7.setLabel("7");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b2.getLabel().equals("7")) {
						b7.setLabel("7");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b3.getLabel().equals("7")) {
						b7.setLabel("7");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b4.getLabel().equals("7")) {
						b7.setLabel("7");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b5.getLabel().equals("7")) {
						b7.setLabel("7");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b6.getLabel().equals("7")) {
						b7.setLabel("7");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b8.getLabel().equals("7")) {
						b7.setLabel("7");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b9.getLabel().equals("7")) {
						b7.setLabel("7");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b10.getLabel().equals("7")) {
						b7.setLabel("7");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b11.getLabel().equals("7")) {
						b7.setLabel("7");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b12.getLabel().equals("7")) {
						b7.setLabel("7");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b13.getLabel().equals("7")) {
						b7.setLabel("7");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b14.getLabel().equals("7")) {
						b7.setLabel("7");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b15.getLabel().equals("7")) {
						b7.setLabel("7");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b16.getLabel().equals("7")) {
						b7.setLabel("7");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b17.getLabel().equals("7")) {
						b7.setLabel("7");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b19.getLabel().equals("7")) {
						b7.setLabel("7");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b20.getLabel().equals("7")) {
						b7.setLabel("7");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b21.getLabel().equals("7")) {
						b7.setLabel("7");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b22.getLabel().equals("7")) {
						b7.setLabel("7");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b23.getLabel().equals("7")) {
						b7.setLabel("7");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b24.getLabel().equals("7")) {
						b7.setLabel("7");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b7.getLabel() != ("7") && b25.getLabel().equals("7")) {
						b7.setLabel("7");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 7) {
					String ajuda = b8.getLabel();
					if (b8.getLabel() != ("8") && b1.getLabel().equals("8")) {
						b8.setLabel("8");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b2.getLabel().equals("8")) {
						b8.setLabel("8");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b3.getLabel().equals("8")) {
						b8.setLabel("8");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b4.getLabel().equals("8")) {
						b8.setLabel("8");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b5.getLabel().equals("8")) {
						b8.setLabel("8");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b6.getLabel().equals("8")) {
						b8.setLabel("8");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b7.getLabel().equals("8")) {
						b8.setLabel("8");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b9.getLabel().equals("8")) {
						b8.setLabel("8");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b10.getLabel().equals("8")) {
						b8.setLabel("8");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b11.getLabel().equals("8")) {
						b8.setLabel("8");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b12.getLabel().equals("8")) {
						b8.setLabel("8");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b13.getLabel().equals("8")) {
						b8.setLabel("8");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b14.getLabel().equals("8")) {
						b8.setLabel("8");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b15.getLabel().equals("8")) {
						b8.setLabel("8");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b16.getLabel().equals("8")) {
						b8.setLabel("8");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b17.getLabel().equals("8")) {
						b8.setLabel("8");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b18.getLabel().equals("8")) {
						b8.setLabel("8");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b19.getLabel().equals("8")) {
						b8.setLabel("8");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b20.getLabel().equals("8")) {
						b8.setLabel("8");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b21.getLabel().equals("8")) {
						b8.setLabel("8");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b22.getLabel().equals("8")) {
						b8.setLabel("8");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b23.getLabel().equals("8")) {
						b8.setLabel("8");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b24.getLabel().equals("8")) {
						b8.setLabel("8");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b8.getLabel() != ("8") && b25.getLabel().equals("8")) {
						b8.setLabel("8");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 8) {
					String ajuda = b9.getLabel();
					if (b9.getLabel() != ("9") && b1.getLabel().equals("9")) {
						b9.setLabel("9");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b2.getLabel().equals("9")) {
						b9.setLabel("9");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b3.getLabel().equals("9")) {
						b9.setLabel("9");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b4.getLabel().equals("9")) {
						b9.setLabel("9");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b5.getLabel().equals("9")) {
						b9.setLabel("9");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b6.getLabel().equals("9")) {
						b9.setLabel("9");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b7.getLabel().equals("9")) {
						b9.setLabel("9");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b8.getLabel().equals("9")) {
						b9.setLabel("9");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b10.getLabel().equals("9")) {
						b9.setLabel("9");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b11.getLabel().equals("9")) {
						b9.setLabel("9");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b12.getLabel().equals("9")) {
						b9.setLabel("9");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b13.getLabel().equals("9")) {
						b9.setLabel("9");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b14.getLabel().equals("9")) {
						b9.setLabel("9");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b15.getLabel().equals("9")) {
						b9.setLabel("9");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b16.getLabel().equals("9")) {
						b9.setLabel("9");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b17.getLabel().equals("9")) {
						b9.setLabel("9");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b18.getLabel().equals("9")) {
						b9.setLabel("9");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b19.getLabel().equals("9")) {
						b9.setLabel("9");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b20.getLabel().equals("9")) {
						b9.setLabel("9");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b21.getLabel().equals("9")) {
						b9.setLabel("9");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b22.getLabel().equals("9")) {
						b9.setLabel("9");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b23.getLabel().equals("9")) {
						b9.setLabel("9");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b24.getLabel().equals("9")) {
						b9.setLabel("9");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b9.getLabel() != ("9") && b25.getLabel().equals("9")) {
						b9.setLabel("9");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 9) {
					String ajuda = b10.getLabel();
					if (b10.getLabel() != ("10") && b1.getLabel().equals("10")) {
						b10.setLabel("10");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b2.getLabel().equals("10")) {
						b10.setLabel("10");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b3.getLabel().equals("10")) {
						b10.setLabel("10");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b4.getLabel().equals("10")) {
						b10.setLabel("10");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b5.getLabel().equals("10")) {
						b10.setLabel("10");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b6.getLabel().equals("10")) {
						b10.setLabel("10");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b7.getLabel().equals("10")) {
						b10.setLabel("10");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b8.getLabel().equals("10")) {
						b10.setLabel("10");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b9.getLabel().equals("10")) {
						b10.setLabel("10");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b11.getLabel().equals("10")) {
						b10.setLabel("10");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b12.getLabel().equals("10")) {
						b10.setLabel("10");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b13.getLabel().equals("10")) {
						b10.setLabel("10");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b14.getLabel().equals("10")) {
						b10.setLabel("10");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b15.getLabel().equals("10")) {
						b10.setLabel("10");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b16.getLabel().equals("10")) {
						b10.setLabel("10");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b17.getLabel().equals("10")) {
						b10.setLabel("10");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b18.getLabel().equals("10")) {
						b10.setLabel("10");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b19.getLabel().equals("10")) {
						b10.setLabel("10");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b20.getLabel().equals("10")) {
						b10.setLabel("10");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b21.getLabel().equals("10")) {
						b10.setLabel("10");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b22.getLabel().equals("10")) {
						b10.setLabel("10");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b23.getLabel().equals("10")) {
						b10.setLabel("10");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b24.getLabel().equals("10")) {
						b10.setLabel("10");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b10.getLabel() != ("10") && b25.getLabel().equals("10")) {
						b10.setLabel("10");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if (j == 10) {
					String ajuda = b11.getLabel();
					if (b11.getLabel() != ("11") && b1.getLabel().equals("11")) {
						b11.setLabel("11");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b2.getLabel().equals("11")) {
						b11.setLabel("11");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b3.getLabel().equals("11")) {
						b11.setLabel("11");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b4.getLabel().equals("11")) {
						b11.setLabel("11");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b5.getLabel().equals("11")) {
						b11.setLabel("11");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b6.getLabel().equals("11")) {
						b11.setLabel("11");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b7.getLabel().equals("11")) {
						b11.setLabel("11");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b8.getLabel().equals("11")) {
						b11.setLabel("11");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b9.getLabel().equals("11")) {
						b11.setLabel("11");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b10.getLabel().equals("11")) {
						b11.setLabel("11");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b12.getLabel().equals("11")) {
						b11.setLabel("11");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b13.getLabel().equals("11")) {
						b11.setLabel("11");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b14.getLabel().equals("11")) {
						b11.setLabel("11");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b15.getLabel().equals("11")) {
						b11.setLabel("11");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b16.getLabel().equals("11")) {
						b11.setLabel("11");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b17.getLabel().equals("11")) {
						b11.setLabel("11");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b18.getLabel().equals("11")) {
						b11.setLabel("11");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b19.getLabel().equals("11")) {
						b11.setLabel("11");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b20.getLabel().equals("11")) {
						b11.setLabel("11");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b21.getLabel().equals("11")) {
						b11.setLabel("11");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b22.getLabel().equals("11")) {
						b11.setLabel("11");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b23.getLabel().equals("11")) {
						b11.setLabel("11");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b24.getLabel().equals("11")) {
						b11.setLabel("11");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b11.getLabel() != ("11") && b25.getLabel().equals("11")) {
						b11.setLabel("11");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 11) {
						String ajuda = b12.getLabel();
						if (b12.getLabel() != ("12") && b1.getLabel().equals("12")) {
							b12.setLabel("12");
							b1.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b2.getLabel().equals("12")) {
							b12.setLabel("12");
							b2.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b3.getLabel().equals("12")) {
							b12.setLabel("12");
							b3.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b4.getLabel().equals("12")) {
							b12.setLabel("12");
							b4.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b5.getLabel().equals("12")) {
							b12.setLabel("12");
							b5.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b6.getLabel().equals("12")) {
							b12.setLabel("12");
							b6.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b7.getLabel().equals("12")) {
							b12.setLabel("12");
							b7.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b8.getLabel().equals("12")) {
							b12.setLabel("12");
							b8.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b10.getLabel().equals("12")) {
							b12.setLabel("12");
							b10.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b11.getLabel().equals("12")) {
							b12.setLabel("12");
							b11.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b13.getLabel().equals("12")) {
							b12.setLabel("12");
							b13.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b14.getLabel().equals("12")) {
							b12.setLabel("12");
							b14.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b15.getLabel().equals("12")) {
							b12.setLabel("12");
							b15.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b16.getLabel().equals("12")) {
							b12.setLabel("12");
							b16.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b17.getLabel().equals("12")) {
							b12.setLabel("12");
							b17.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b18.getLabel().equals("12")) {
							b12.setLabel("12");
							b18.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b19.getLabel().equals("12")) {
							b12.setLabel("12");
							b19.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b20.getLabel().equals("12")) {
							b12.setLabel("12");
							b20.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b21.getLabel().equals("12")) {
							b12.setLabel("12");
							b21.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b22.getLabel().equals("12")) {
							b12.setLabel("12");
							b22.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b23.getLabel().equals("12")) {
							b12.setLabel("12");
							b23.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b24.getLabel().equals("12")) {
							b12.setLabel("12");
							b24.setLabel(ajuda);
							jogada++;
							}
						if (b12.getLabel() != ("12") && b25.getLabel().equals("12")) {
							b12.setLabel("12");
							b25.setLabel(ajuda);
							jogada++;
							}
						}
				if(j == 12) {
					String ajuda = b13.getLabel();
					if (b13.getLabel() != ("13") && b1.getLabel().equals("13")) {
						b13.setLabel("13");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b2.getLabel().equals("13")) {
						b13.setLabel("13");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b3.getLabel().equals("13")) {
						b13.setLabel("13");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b4.getLabel().equals("13")) {
						b13.setLabel("13");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b5.getLabel().equals("13")) {
						b13.setLabel("13");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b6.getLabel().equals("13")) {
						b13.setLabel("13");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b7.getLabel().equals("13")) {
						b13.setLabel("13");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b8.getLabel().equals("13")) {
						b13.setLabel("13");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b9.getLabel().equals("13")) {
						b13.setLabel("13");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b10.getLabel().equals("13")) {
						b13.setLabel("13");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b11.getLabel().equals("13")) {
						b13.setLabel("13");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b12.getLabel().equals("13")) {
						b13.setLabel("13");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b14.getLabel().equals("13")) {
						b13.setLabel("13");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b15.getLabel().equals("13")) {
						b13.setLabel("13");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b16.getLabel().equals("13")) {
						b13.setLabel("13");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b17.getLabel().equals("13")) {
						b13.setLabel("13");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b18.getLabel().equals("13")) {
						b13.setLabel("13");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b19.getLabel().equals("13")) {
						b13.setLabel("13");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b20.getLabel().equals("13")) {
						b13.setLabel("13");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b21.getLabel().equals("13")) {
						b13.setLabel("13");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b22.getLabel().equals("13")) {
						b13.setLabel("13");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b23.getLabel().equals("13")) {
						b13.setLabel("13");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b24.getLabel().equals("13")) {
						b13.setLabel("13");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b13.getLabel() != ("13") && b25.getLabel().equals("13")) {
						b13.setLabel("13");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 13) {
					String ajuda = b14.getLabel();
					if (b14.getLabel() != ("14") && b1.getLabel().equals("14")) {
						b14.setLabel("14");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b2.getLabel().equals("14")) {
						b14.setLabel("14");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b3.getLabel().equals("14")) {
						b14.setLabel("14");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b4.getLabel().equals("14")) {
						b14.setLabel("14");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b5.getLabel().equals("14")) {
						b14.setLabel("14");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b6.getLabel().equals("14")) {
						b14.setLabel("14");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b7.getLabel().equals("14")) {
						b14.setLabel("14");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b8.getLabel().equals("14")) {
						b14.setLabel("14");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b9.getLabel().equals("14")) {
						b14.setLabel("14");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b10.getLabel().equals("14")) {
						b14.setLabel("14");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b11.getLabel().equals("14")) {
						b14.setLabel("14");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b12.getLabel().equals("14")) {
						b14.setLabel("14");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b13.getLabel().equals("14")) {
						b14.setLabel("14");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b15.getLabel().equals("14")) {
						b14.setLabel("14");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b16.getLabel().equals("14")) {
						b14.setLabel("14");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b17.getLabel().equals("14")) {
						b14.setLabel("14");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b18.getLabel().equals("14")) {
						b14.setLabel("14");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b19.getLabel().equals("14")) {
						b14.setLabel("14");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b20.getLabel().equals("14")) {
						b14.setLabel("14");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b21.getLabel().equals("14")) {
						b14.setLabel("14");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b22.getLabel().equals("14")) {
						b14.setLabel("14");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b23.getLabel().equals("14")) {
						b14.setLabel("14");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b24.getLabel().equals("14")) {
						b14.setLabel("14");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b14.getLabel() != ("14") && b25.getLabel().equals("14")) {
						b14.setLabel("14");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 14) {
					String ajuda = b15.getLabel();
					if (b15.getLabel() != ("15") && b1.getLabel().equals("15")) {
						b15.setLabel("15");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b2.getLabel().equals("15")) {
						b15.setLabel("15");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b3.getLabel().equals("15")) {
						b15.setLabel("15");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b4.getLabel().equals("15")) {
						b15.setLabel("15");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b5.getLabel().equals("15")) {
						b15.setLabel("15");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b6.getLabel().equals("15")) {
						b15.setLabel("15");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b7.getLabel().equals("15")) {
						b15.setLabel("15");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b8.getLabel().equals("15")) {
						b15.setLabel("15");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b9.getLabel().equals("15")) {
						b15.setLabel("15");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b10.getLabel().equals("15")) {
						b15.setLabel("15");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b11.getLabel().equals("15")) {
						b15.setLabel("15");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b12.getLabel().equals("15")) {
						b15.setLabel("15");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b13.getLabel().equals("15")) {
						b15.setLabel("15");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b14.getLabel().equals("15")) {
						b15.setLabel("15");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b16.getLabel().equals("15")) {
						b15.setLabel("15");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b17.getLabel().equals("15")) {
						b15.setLabel("15");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b18.getLabel().equals("15")) {
						b15.setLabel("15");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b19.getLabel().equals("15")) {
						b15.setLabel("15");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b20.getLabel().equals("15")) {
						b15.setLabel("15");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b21.getLabel().equals("15")) {
						b15.setLabel("15");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b22.getLabel().equals("15")) {
						b15.setLabel("15");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b23.getLabel().equals("15")) {
						b15.setLabel("15");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b24.getLabel().equals("15")) {
						b15.setLabel("15");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b15.getLabel() != ("15") && b25.getLabel().equals("15")) {
						b15.setLabel("15");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 15) {
					String ajuda = b16.getLabel();
					if (b16.getLabel() != ("16") && b1.getLabel().equals("16")) {
						b16.setLabel("16");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b2.getLabel().equals("16")) {
						b16.setLabel("16");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b3.getLabel().equals("16")) {
						b16.setLabel("16");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b4.getLabel().equals("16")) {
						b16.setLabel("16");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b5.getLabel().equals("16")) {
						b16.setLabel("16");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b6.getLabel().equals("16")) {
						b16.setLabel("16");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b7.getLabel().equals("16")) {
						b16.setLabel("16");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b8.getLabel().equals("16")) {
						b16.setLabel("16");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b9.getLabel().equals("16")) {
						b16.setLabel("16");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b10.getLabel().equals("16")) {
						b16.setLabel("16");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b11.getLabel().equals("16")) {
						b16.setLabel("16");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b12.getLabel().equals("16")) {
						b16.setLabel("16");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b13.getLabel().equals("16")) {
						b16.setLabel("16");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b14.getLabel().equals("16")) {
						b16.setLabel("16");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b15.getLabel().equals("16")) {
						b16.setLabel("16");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b17.getLabel().equals("16")) {
						b16.setLabel("16");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b18.getLabel().equals("16")) {
						b16.setLabel("16");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b19.getLabel().equals("16")) {
						b16.setLabel("16");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b20.getLabel().equals("16")) {
						b16.setLabel("16");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b21.getLabel().equals("16")) {
						b16.setLabel("16");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b22.getLabel().equals("16")) {
						b16.setLabel("16");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b23.getLabel().equals("16")) {
						b16.setLabel("16");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b24.getLabel().equals("16")) {
						b16.setLabel("16");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b16.getLabel() != ("16") && b25.getLabel().equals("16")) {
						b16.setLabel("16");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 16) {
					String ajuda = b17.getLabel();
					if (b17.getLabel() != ("17") && b1.getLabel().equals("17")) {
						b17.setLabel("17");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b2.getLabel().equals("17")) {
						b17.setLabel("17");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b3.getLabel().equals("17")) {
						b17.setLabel("17");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b4.getLabel().equals("17")) {
						b17.setLabel("17");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b5.getLabel().equals("17")) {
						b17.setLabel("17");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b6.getLabel().equals("17")) {
						b17.setLabel("17");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b7.getLabel().equals("17")) {
						b17.setLabel("17");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b8.getLabel().equals("17")) {
						b17.setLabel("17");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b9.getLabel().equals("17")) {
						b17.setLabel("17");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b10.getLabel().equals("17")) {
						b17.setLabel("17");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b11.getLabel().equals("17")) {
						b17.setLabel("17");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b12.getLabel().equals("17")) {
						b17.setLabel("17");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b13.getLabel().equals("17")) {
						b17.setLabel("17");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b14.getLabel().equals("17")) {
						b17.setLabel("17");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b15.getLabel().equals("17")) {
						b17.setLabel("17");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b16.getLabel().equals("17")) {
						b17.setLabel("17");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b18.getLabel().equals("17")) {
						b17.setLabel("17");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b19.getLabel().equals("17")) {
						b17.setLabel("17");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b20.getLabel().equals("17")) {
						b17.setLabel("17");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b21.getLabel().equals("17")) {
						b17.setLabel("17");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b22.getLabel().equals("17")) {
						b17.setLabel("17");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b23.getLabel().equals("17")) {
						b17.setLabel("17");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b24.getLabel().equals("17")) {
						b17.setLabel("17");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b17.getLabel() != ("17") && b25.getLabel().equals("17")) {
						b17.setLabel("17");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 17) {
					String ajuda = b18.getLabel();
					if (b18.getLabel() != ("18") && b1.getLabel().equals("18")) {
						b18.setLabel("18");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b2.getLabel().equals("18")) {
						b18.setLabel("18");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b3.getLabel().equals("18")) {
						b18.setLabel("18");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b4.getLabel().equals("18")) {
						b18.setLabel("18");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b5.getLabel().equals("18")) {
						b18.setLabel("18");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b6.getLabel().equals("18")) {
						b18.setLabel("18");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b7.getLabel().equals("18")) {
						b18.setLabel("18");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b8.getLabel().equals("18")) {
						b18.setLabel("18");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b9.getLabel().equals("18")) {
						b18.setLabel("18");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b10.getLabel().equals("18")) {
						b18.setLabel("18");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b11.getLabel().equals("18")) {
						b18.setLabel("18");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b12.getLabel().equals("18")) {
						b18.setLabel("18");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b13.getLabel().equals("18")) {
						b18.setLabel("18");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b14.getLabel().equals("18")) {
						b18.setLabel("18");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b15.getLabel().equals("18")) {
						b18.setLabel("18");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b16.getLabel().equals("18")) {
						b18.setLabel("18");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b17.getLabel().equals("18")) {
						b18.setLabel("18");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b19.getLabel().equals("18")) {
						b18.setLabel("18");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b20.getLabel().equals("18")) {
						b18.setLabel("18");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b21.getLabel().equals("18")) {
						b18.setLabel("18");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b22.getLabel().equals("18")) {
						b18.setLabel("18");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b23.getLabel().equals("18")) {
						b18.setLabel("18");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b24.getLabel().equals("18")) {
						b18.setLabel("18");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b18.getLabel() != ("18") && b25.getLabel().equals("18")) {
						b18.setLabel("18");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 18) {
					String ajuda = b19.getLabel();
					if (b19.getLabel() != ("19") && b1.getLabel().equals("19")) {
						b19.setLabel("19");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b2.getLabel().equals("19")) {
						b19.setLabel("19");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b3.getLabel().equals("19")) {
						b19.setLabel("19");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b4.getLabel().equals("19")) {
						b19.setLabel("19");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b5.getLabel().equals("19")) {
						b19.setLabel("19");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b6.getLabel().equals("19")) {
						b19.setLabel("19");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b7.getLabel().equals("19")) {
						b19.setLabel("19");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b8.getLabel().equals("19")) {
						b19.setLabel("19");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b9.getLabel().equals("19")) {
						b19.setLabel("19");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b10.getLabel().equals("19")) {
						b19.setLabel("19");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b11.getLabel().equals("19")) {
						b19.setLabel("19");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b12.getLabel().equals("19")) {
						b19.setLabel("19");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b13.getLabel().equals("19")) {
						b19.setLabel("19");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b14.getLabel().equals("19")) {
						b19.setLabel("19");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b15.getLabel().equals("19")) {
						b19.setLabel("19");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b16.getLabel().equals("19")) {
						b19.setLabel("19");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b17.getLabel().equals("19")) {
						b19.setLabel("19");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b18.getLabel().equals("19")) {
						b19.setLabel("19");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b20.getLabel().equals("19")) {
						b19.setLabel("19");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b21.getLabel().equals("19")) {
						b19.setLabel("19");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b22.getLabel().equals("19")) {
						b19.setLabel("19");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b23.getLabel().equals("19")) {
						b19.setLabel("19");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b24.getLabel().equals("19")) {
						b19.setLabel("19");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b19.getLabel() != ("19") && b25.getLabel().equals("19")) {
						b19.setLabel("19");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 19) {
					String ajuda = b20.getLabel();
					if (b20.getLabel() != ("20") && b1.getLabel().equals("20")) {
						b20.setLabel("20");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b2.getLabel().equals("20")) {
						b20.setLabel("20");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b3.getLabel().equals("20")) {
						b20.setLabel("20");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b4.getLabel().equals("20")) {
						b20.setLabel("20");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b5.getLabel().equals("20")) {
						b20.setLabel("20");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b6.getLabel().equals("20")) {
						b20.setLabel("20");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b7.getLabel().equals("20")) {
						b20.setLabel("20");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b8.getLabel().equals("20")) {
						b20.setLabel("20");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b9.getLabel().equals("20")) {
						b20.setLabel("20");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b10.getLabel().equals("20")) {
						b20.setLabel("20");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b11.getLabel().equals("20")) {
						b20.setLabel("20");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b12.getLabel().equals("20")) {
						b20.setLabel("20");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b13.getLabel().equals("20")) {
						b20.setLabel("20");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b14.getLabel().equals("20")) {
						b20.setLabel("20");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b15.getLabel().equals("20")) {
						b20.setLabel("20");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b16.getLabel().equals("20")) {
						b20.setLabel("20");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b17.getLabel().equals("20")) {
						b20.setLabel("20");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b18.getLabel().equals("20")) {
						b20.setLabel("20");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b19.getLabel().equals("20")) {
						b20.setLabel("20");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b21.getLabel().equals("20")) {
						b20.setLabel("20");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b22.getLabel().equals("20")) {
						b20.setLabel("20");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b23.getLabel().equals("20")) {
						b20.setLabel("20");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b24.getLabel().equals("20")) {
						b20.setLabel("20");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b20.getLabel() != ("20") && b25.getLabel().equals("20")) {
						b20.setLabel("20");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 20) {
					String ajuda = b21.getLabel();
					if (b21.getLabel() != ("21") && b1.getLabel().equals("21")) {
						b21.setLabel("21");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b2.getLabel().equals("21")) {
						b21.setLabel("21");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b3.getLabel().equals("21")) {
						b21.setLabel("21");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b4.getLabel().equals("21")) {
						b21.setLabel("21");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b5.getLabel().equals("21")) {
						b21.setLabel("21");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b6.getLabel().equals("21")) {
						b21.setLabel("21");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b7.getLabel().equals("21")) {
						b21.setLabel("21");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b8.getLabel().equals("21")) {
						b21.setLabel("21");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b9.getLabel().equals("21")) {
						b21.setLabel("21");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b10.getLabel().equals("21")) {
						b21.setLabel("21");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b11.getLabel().equals("21")) {
						b21.setLabel("21");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b12.getLabel().equals("21")) {
						b21.setLabel("21");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b13.getLabel().equals("21")) {
						b21.setLabel("21");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b14.getLabel().equals("21")) {
						b21.setLabel("21");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b15.getLabel().equals("21")) {
						b21.setLabel("21");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b16.getLabel().equals("21")) {
						b21.setLabel("21");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b17.getLabel().equals("21")) {
						b21.setLabel("21");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b18.getLabel().equals("21")) {
						b21.setLabel("21");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b19.getLabel().equals("21")) {
						b21.setLabel("21");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b20.getLabel().equals("21")) {
						b21.setLabel("21");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b22.getLabel().equals("21")) {
						b21.setLabel("21");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b23.getLabel().equals("21")) {
						b21.setLabel("21");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b24.getLabel().equals("21")) {
						b21.setLabel("21");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b21.getLabel() != ("21") && b25.getLabel().equals("21")) {
						b21.setLabel("21");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 21) {
					String ajuda = b22.getLabel();
					if (b22.getLabel() != ("22") && b1.getLabel().equals("22")) {
						b22.setLabel("22");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b2.getLabel().equals("22")) {
						b22.setLabel("22");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b3.getLabel().equals("22")) {
						b22.setLabel("22");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b4.getLabel().equals("22")) {
						b22.setLabel("22");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b5.getLabel().equals("22")) {
						b22.setLabel("22");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b6.getLabel().equals("22")) {
						b22.setLabel("22");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b7.getLabel().equals("22")) {
						b22.setLabel("22");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b8.getLabel().equals("22")) {
						b22.setLabel("22");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b9.getLabel().equals("22")) {
						b22.setLabel("22");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b10.getLabel().equals("22")) {
						b22.setLabel("22");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b11.getLabel().equals("22")) {
						b22.setLabel("22");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b12.getLabel().equals("22")) {
						b22.setLabel("22");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b13.getLabel().equals("22")) {
						b22.setLabel("22");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b14.getLabel().equals("22")) {
						b22.setLabel("22");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b15.getLabel().equals("22")) {
						b22.setLabel("22");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b16.getLabel().equals("22")) {
						b22.setLabel("22");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b17.getLabel().equals("22")) {
						b22.setLabel("22");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b18.getLabel().equals("22")) {
						b22.setLabel("22");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b19.getLabel().equals("22")) {
						b22.setLabel("22");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b20.getLabel().equals("22")) {
						b22.setLabel("22");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b21.getLabel().equals("22")) {
						b22.setLabel("22");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b23.getLabel().equals("22")) {
						b22.setLabel("22");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b24.getLabel().equals("22")) {
						b22.setLabel("22");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b22.getLabel() != ("22") && b25.getLabel().equals("22")) {
						b22.setLabel("22");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 22) {
					String ajuda = b23.getLabel();
					if (b23.getLabel() != ("23") && b1.getLabel().equals("23")) {
						b23.setLabel("23");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b2.getLabel().equals("23")) {
						b23.setLabel("23");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b3.getLabel().equals("23")) {
						b23.setLabel("23");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b4.getLabel().equals("23")) {
						b23.setLabel("23");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b5.getLabel().equals("23")) {
						b23.setLabel("23");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b6.getLabel().equals("23")) {
						b23.setLabel("23");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b7.getLabel().equals("23")) {
						b23.setLabel("23");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b8.getLabel().equals("23")) {
						b23.setLabel("23");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b9.getLabel().equals("23")) {
						b23.setLabel("23");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b10.getLabel().equals("23")) {
						b23.setLabel("23");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b11.getLabel().equals("23")) {
						b23.setLabel("23");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b12.getLabel().equals("23")) {
						b23.setLabel("23");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b13.getLabel().equals("23")) {
						b23.setLabel("23");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b14.getLabel().equals("23")) {
						b23.setLabel("23");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b15.getLabel().equals("23")) {
						b23.setLabel("23");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b16.getLabel().equals("23")) {
						b23.setLabel("23");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b17.getLabel().equals("23")) {
						b23.setLabel("23");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b18.getLabel().equals("23")) {
						b23.setLabel("23");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b19.getLabel().equals("23")) {
						b23.setLabel("23");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b20.getLabel().equals("23")) {
						b23.setLabel("23");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b21.getLabel().equals("23")) {
						b23.setLabel("23");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b22.getLabel().equals("23")) {
						b23.setLabel("23");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b24.getLabel().equals("23")) {
						b23.setLabel("23");
						b24.setLabel(ajuda);
						jogada++;
						}
					if (b23.getLabel() != ("23") && b25.getLabel().equals("23")) {
						b23.setLabel("23");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				if(j == 23) {
					String ajuda = b24.getLabel();
					if (b24.getLabel() != ("24") && b1.getLabel().equals("24")) {
						b24.setLabel("24");
						b1.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b2.getLabel().equals("24")) {
						b24.setLabel("24");
						b2.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b3.getLabel().equals("24")) {
						b24.setLabel("24");
						b3.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b4.getLabel().equals("24")) {
						b24.setLabel("24");
						b4.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b5.getLabel().equals("24")) {
						b24.setLabel("24");
						b5.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b6.getLabel().equals("24")) {
						b24.setLabel("24");
						b6.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b7.getLabel().equals("24")) {
						b24.setLabel("24");
						b7.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b8.getLabel().equals("24")) {
						b24.setLabel("24");
						b8.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b9.getLabel().equals("24")) {
						b24.setLabel("24");
						b9.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b10.getLabel().equals("24")) {
						b24.setLabel("24");
						b10.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b11.getLabel().equals("24")) {
						b24.setLabel("24");
						b11.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b12.getLabel().equals("24")) {
						b24.setLabel("24");
						b12.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b13.getLabel().equals("24")) {
						b24.setLabel("24");
						b13.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b14.getLabel().equals("24")) {
						b24.setLabel("24");
						b14.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b15.getLabel().equals("24")) {
						b24.setLabel("24");
						b15.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b16.getLabel().equals("24")) {
						b24.setLabel("24");
						b16.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b17.getLabel().equals("24")) {
						b24.setLabel("24");
						b17.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b18.getLabel().equals("24")) {
						b24.setLabel("24");
						b18.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b19.getLabel().equals("24")) {
						b24.setLabel("24");
						b19.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b20.getLabel().equals("24")) {
						b24.setLabel("24");
						b20.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b21.getLabel().equals("24")) {
						b24.setLabel("24");
						b21.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b22.getLabel().equals("24")) {
						b24.setLabel("24");
						b22.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b23.getLabel().equals("24")) {
						b24.setLabel("24");
						b23.setLabel(ajuda);
						jogada++;
						}
					if (b24.getLabel() != ("24") && b25.getLabel().equals("24")) {
						b24.setLabel("24");
						b25.setLabel(ajuda);
						jogada++;
						}
					}
				j++;
		}
		
		//Única combiação possível para a vitória + dados da partida jogada
		if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3")
				&& b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6")
				&& b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9")
				&& b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12")
				&& b13.getLabel().equals("13") && b14.getLabel().equals("14") && b15.getLabel().equals("15")
				&& b16.getLabel().equals("16") && b17.getLabel().equals("17") && b18.getLabel().equals("18")
				&& b19.getLabel().equals("19") && b20.getLabel().equals("20") && b21.getLabel().equals("21")
				&& b22.getLabel().equals("22") && b23.getLabel().equals("23") && b24.getLabel().equals("24")
				&& b25.getLabel().equals("")) {

			JOptionPane.showMessageDialog(this, "Voce Venceu!");

			JTable rankingTabela = new JTable(2, 3);
			JFrame frame = new JFrame("FIM DE JOGO");
			long tempoFinal = (Calendar.getInstance().getTime().getTime() - tempoInicio) / 60000;
			ButtonHandler.tempoDificil[i] = tempoFinal;

			frame.add(rankingTabela);
			frame.setBounds(880, 50, 500, 136);
			rankingTabela.setValueAt("                 Nome: ", 0, 0);
			rankingTabela.setValueAt("                 Pontuação: ", 0, 1); // Os espaços são para centralizar na interface
			rankingTabela.setValueAt("                 Tempo (min): ", 0, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorDificil[i], 1, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoDificil[i] = (float) (jogada * 2.5), 1, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoDificil[i], 1, 2);
			tempoInicio = Calendar.getInstance().getTime().getTime();
			i++;
			ButtonHandler.d++;

			frame.dispose();
			frame.setVisible(true);
			
			//Retorna ao menu
			Botao menu = new Botao();
			menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			menu.getContentPane().setBackground(Color.orange);
			menu.setBounds(400, 100, 500, 550);
			menu.setVisible(true);

		}

	}
}
