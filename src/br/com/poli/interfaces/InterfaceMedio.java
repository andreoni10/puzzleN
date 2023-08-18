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

public class InterfaceMedio extends Frame implements ActionListener {
	private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, desistir, resolveTabuleiro, ajuda;
	private static long tempoInicio = Calendar.getInstance().getTime().getTime();
	private static int i = 0;
	private int j = 0;
	private int jogada;
	
	//Faz com que os números apareçam de forma aleatória
	public static Integer getRandom(List<Integer> array) {
		Integer rnd = new Random().nextInt(array.size());
		return array.get(rnd);
	}

	public InterfaceMedio() {
		super("Puzzle-N/MEDIO/ " + ButtonHandler.jogadorMedio[i]); //Título do menu + nome do jogador
		//Número de botões da dificuldade 
		List<Integer> numeros = new ArrayList<Integer>();
		for (int n = 1; n < 16; n++) {
			numeros.add(n);
		}

		JOptionPane.showMessageDialog(null, "Pressione OK para iniciar");//Botão para o início da partida, onde o tabuleiro só é gerado após o seu acionamento
		
		//Localiza os numeros na tela e impede que números iguais apareçam
		Integer escolhido1 = getRandom(numeros);
		b1 = new Button(escolhido1.toString());
		b1.setBounds(75, 60, 60, 60);
		numeros.remove(escolhido1);
		Integer escolhido2 = getRandom(numeros);
		b2 = new Button(escolhido2.toString());
		b2.setBounds(175, 60, 60, 60);
		numeros.remove(escolhido2);
		Integer escolhido3 = getRandom(numeros);
		b3 = new Button(escolhido3.toString());
		b3.setBounds(275, 60, 60, 60);
		numeros.remove(escolhido3);
		Integer escolhido4 = getRandom(numeros);
		b4 = new Button(escolhido4.toString());
		b4.setBounds(375, 60, 60, 60);
		numeros.remove(escolhido4);
		Integer escolhido5 = getRandom(numeros);
		b5 = new Button(escolhido5.toString());
		b5.setBounds(75, 130, 60, 60);
		numeros.remove(escolhido5);
		Integer escolhido6 = getRandom(numeros);
		b6 = new Button(escolhido6.toString());
		b6.setBounds(175, 130, 60, 60);
		numeros.remove(escolhido6);
		Integer escolhido7 = getRandom(numeros);
		b7 = new Button(escolhido7.toString());
		b7.setBounds(275, 130, 60, 60);
		numeros.remove(escolhido7);
		Integer escolhido8 = getRandom(numeros);
		b8 = new Button(escolhido8.toString());
		b8.setBounds(375, 130, 60, 60);
		numeros.remove(escolhido8);
		Integer escolhido9 = getRandom(numeros);
		b9 = new Button(escolhido9.toString());
		b9.setBounds(75, 200, 60, 60);
		numeros.remove(escolhido9);
		Integer escolhido10 = getRandom(numeros);
		b10 = new Button(escolhido10.toString());
		b10.setBounds(175, 200, 60, 60);
		numeros.remove(escolhido10);
		Integer escolhido11 = getRandom(numeros);
		b11 = new Button(escolhido11.toString());
		b11.setBounds(275, 200, 60, 60);
		numeros.remove(escolhido11);
		Integer escolhido12 = getRandom(numeros);
		b12 = new Button(escolhido12.toString());
		b12.setBounds(375, 200, 60, 60);
		numeros.remove(escolhido12);
		Integer escolhido13 = getRandom(numeros);
		b13 = new Button(escolhido13.toString());
		b13.setBounds(75, 270, 60, 60);
		numeros.remove(escolhido13);
		Integer escolhido14 = getRandom(numeros);
		b14 = new Button(escolhido14.toString());
		b14.setBounds(175, 270, 60, 60);
		numeros.remove(escolhido14);
		Integer escolhido15 = getRandom(numeros);
		b15 = new Button(escolhido15.toString());
		b15.setBounds(275, 270, 60, 60);
		numeros.remove(escolhido15);
		b16 = new Button("");
		b16.setBounds(375, 270, 60, 60);
		desistir = new Button("DESISTIR");
		desistir.setBounds(195, 400, 100, 40);
		resolveTabuleiro = new Button("RESOLVER TABULEIRO");
		resolveTabuleiro.setBounds(170, 450, 150, 50);
		ajuda = new Button("AJUDA");
		ajuda.setBounds(195, 350, 100, 40);

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
		add(desistir);
		add(resolveTabuleiro);
		add(ajuda);
		setBackground(Color.blue);
		setLocation(400, 100);
		setSize(500, 550);
		setLayout(null);
		setVisible(true);
	}
	
	//Verifica os botões em volta para ver se é possiver realizar o movimento do botão acionado
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String label = b1.getLabel();
			if (b2.getLabel() != ("") && b5.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido"); //Caso o movimento seja inválido
			}
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b1.setLabel("");
				jogada++;
			}
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b1.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b2) {
			String label = b2.getLabel();
			if (b1.getLabel() != ("") && b3.getLabel() != ("") && b6.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b1.getLabel().equals("")) {
				b1.setLabel(label);
				b2.setLabel("");
				jogada++;
			}
			if (b3.getLabel().equals("")) {
				b3.setLabel(label);
				b2.setLabel("");
				jogada++;
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b2.setLabel("");
				jogada++;
			}

		}
		if (e.getSource() == b3) {
			String label = b3.getLabel();
			if (b2.getLabel() != ("") && b7.getLabel() != ("") && b4.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b3.setLabel("");
				jogada++;
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
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
			if (b3.getLabel() != ("") && b8.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b3.getLabel().equals("")) {
				b3.setLabel(label);
				b4.setLabel("");
				jogada++;
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b4.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b5) {
			String label = b5.getLabel();
			if (b1.getLabel() != ("") && b6.getLabel() != ("") && b9.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b1.getLabel().equals("")) {
				b1.setLabel(label);
				b5.setLabel("");
				jogada++;
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b5.setLabel("");
				jogada++;
			}
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b5.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b6) {
			String label = b6.getLabel();
			if (b5.getLabel() != ("") && b2.getLabel() != ("") && b7.getLabel() != ("") && b10.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b6.setLabel("");
				jogada++;
			}
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b6.setLabel("");
				jogada++;
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b6.setLabel("");
				jogada++;
			}
			if (b10.getLabel().equals("")) {
				b10.setLabel(label);
				b6.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b7) {
			String label = b7.getLabel();
			if (b6.getLabel() != ("") && b3.getLabel() != ("") && b8.getLabel() != ("") && b11.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b7.setLabel("");
				jogada++;
			}
			if (b3.getLabel().equals("")) {
				b3.setLabel(label);
				b7.setLabel("");
				jogada++;
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b7.setLabel("");
				jogada++;
			}
			if (b11.getLabel().equals("")) {
				b11.setLabel(label);
				b7.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b8) {
			String label = b8.getLabel();
			if (b4.getLabel() != ("") && b7.getLabel() != ("") && b12.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b4.getLabel().equals("")) {
				b4.setLabel(label);
				b8.setLabel("");
				jogada++;
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b8.setLabel("");
				jogada++;
			}
			if (b12.getLabel().equals("")) {
				b12.setLabel(label);
				b8.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b9) {
			String label = b9.getLabel();
			if (b5.getLabel() != ("") && b10.getLabel() != ("") && b13.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b9.setLabel("");
				jogada++;
			}
			if (b10.getLabel().equals("")) {
				b10.setLabel(label);
				b9.setLabel("");
				jogada++;
			}
			if (b13.getLabel().equals("")) {
				b13.setLabel(label);
				b9.setLabel("");
			}
		}
		if (e.getSource() == b10) {
			String label = b10.getLabel();
			if (b9.getLabel() != ("") && b6.getLabel() != ("") && b11.getLabel() != ("") && b14.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b10.setLabel("");
				jogada++;
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b10.setLabel("");
				jogada++;
			}
			if (b11.getLabel().equals("")) {
				b11.setLabel(label);
				b10.setLabel("");
				jogada++;
			}
			if (b14.getLabel().equals("")) {
				b14.setLabel(label);
				b10.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b11) {
			String label = b11.getLabel();
			if (b10.getLabel() != ("") && b7.getLabel() != ("") && b12.getLabel() != ("") && b15.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b10.getLabel().equals("")) {
				b10.setLabel(label);
				b11.setLabel("");
				jogada++;
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b11.setLabel("");
				jogada++;
			}
			if (b12.getLabel().equals("")) {
				b12.setLabel(label);
				b11.setLabel("");
				jogada++;
			}
			if (b15.getLabel().equals("")) {
				b15.setLabel(label);
				b11.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b12) {
			String label = b12.getLabel();
			if (b8.getLabel() != ("") && b11.getLabel() != ("") && b16.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b12.setLabel("");
				jogada++;
			}
			if (b11.getLabel().equals("")) {
				b11.setLabel(label);
				b12.setLabel("");
				jogada++;
			}
			if (b16.getLabel().equals("")) {
				b16.setLabel(label);
				b12.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b13) {
			String label = b13.getLabel();
			if (b9.getLabel() != ("") && b14.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b13.setLabel("");
				jogada++;
			}
			if (b14.getLabel().equals("")) {
				b14.setLabel(label);
				b13.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b14) {
			String label = b14.getLabel();
			if (b13.getLabel() != ("") && b10.getLabel() != ("") && b15.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b13.getLabel().equals("")) {
				b13.setLabel(label);
				b14.setLabel("");
				jogada++;
			}
			if (b10.getLabel().equals("")) {
				b10.setLabel(label);
				b14.setLabel("");
				jogada++;
			}
			if (b15.getLabel().equals("")) {
				b15.setLabel(label);
				b14.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b15) {
			String label = b15.getLabel();
			if (b14.getLabel() != ("") && b11.getLabel() != ("") && b16.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b14.getLabel().equals("")) {
				b14.setLabel(label);
				b15.setLabel("");
				jogada++;
			}
			if (b11.getLabel().equals("")) {
				b11.setLabel(label);
				b15.setLabel("");
				jogada++;
			}
			if (b16.getLabel().equals("")) {
				b16.setLabel(label);
				b15.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b16) {
			String label = b16.getLabel();
			if (b12.getLabel() != ("") && b15.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b12.getLabel().equals("")) {
				b12.setLabel(label);
				b16.setLabel("");
				jogada++;
			}
			if (b15.getLabel().equals("")) {
				b15.setLabel(label);
				b16.setLabel("");
				jogada++;
			}
		}
		
		//Tela de desistência com os dados da partida jogada
		if (e.getSource() == desistir) {
			JOptionPane.showMessageDialog(this, "Voce Perdeu");
			JTable rankingTabela = new JTable(2, 3);
			JFrame frame = new JFrame("FIM DE JOGO");
			long tempoFinal = (Calendar.getInstance().getTime().getTime() - tempoInicio) / 60000;
			ButtonHandler.tempoMedio[i] = tempoFinal;

			
			frame.add(rankingTabela);
			frame.setBounds(880, 50, 500, 136);
			rankingTabela.setValueAt("                 Nome: ", 0, 0);
			rankingTabela.setValueAt("                 Pontuação: ", 0, 1); // Os espaços são para centralizar na interface					
			rankingTabela.setValueAt("                 Tempo (min): ", 0, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorMedio[i], 1, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoMedio[i] = (float) (jogada * 2.5), 1, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoMedio[i], 1, 2);
			tempoInicio = Calendar.getInstance().getTime().getTime();
			i++;
			ButtonHandler.m++;
			
			
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
		if(e.getSource() == resolveTabuleiro) {
			
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
			b16.setLabel("");
			
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
					}
				j++;
		}
		
		//Única combiação possível para a vitória + dados da partida jogada
		if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3")
				&& b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6")
				&& b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9")
				&& b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12")
				&& b13.getLabel().equals("13") && b14.getLabel().equals("14") && b15.getLabel().equals("15")
				&& b16.getLabel().equals("")) {

			JOptionPane.showMessageDialog(this, "Voce Venceu!");

			JTable rankingTabela = new JTable(2, 3);
			JFrame frame = new JFrame("FIM DE JOGO");
			long tempoFinal = (Calendar.getInstance().getTime().getTime() - tempoInicio) / 60000;
			ButtonHandler.tempoMedio[i] = tempoFinal;

			frame.add(rankingTabela);
			frame.setBounds(880, 50, 500, 136);
			rankingTabela.setValueAt("                 Nome: ", 0, 0);
			rankingTabela.setValueAt("                 Pontuação: ", 0, 1); // Os espaços são para centralizar na interface
			rankingTabela.setValueAt("                 Tempo (min): ", 0, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorMedio[i], 1, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoMedio[i] = (float) (jogada * 2.5), 1, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoMedio[i], 1, 2);
			tempoInicio = Calendar.getInstance().getTime().getTime();
			i++;
			ButtonHandler.m++;

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