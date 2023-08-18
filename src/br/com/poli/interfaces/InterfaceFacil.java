package br.com.poli.interfaces;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class InterfaceFacil extends Frame implements ActionListener {
	private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, desistir, resolverTabuleiro, ajuda;
	private static long tempoInicio = Calendar.getInstance().getTime().getTime();
	private static int i = 0;
	private int j = 0;
	private int jogada;
	
	//Faz com que os números apareçam de forma aleatória
	public static Integer getRandom(List<Integer> array) {
		Integer rnd = new Random().nextInt(array.size());
		return array.get(rnd);
	}

	public InterfaceFacil() {
		super("Puzzle-N/FACIL/ " + ButtonHandler.jogadorFacil[i]); //Título do menu + nome do jogador
		
		//Número de botões da dificuldade 
		List<Integer> numeros = new ArrayList<Integer>();
		for (int n = 1; n < 9; n++) {
			numeros.add(n);
		}

		
		JOptionPane.showMessageDialog(null, "Pressione OK para iniciar"); //Botão para o início da partida, onde o tabuleiro só é gerado após o seu acionamento
		
		//Localiza os numeros na tela e impede que números iguais apareçam
		Integer escolhido1 = getRandom(numeros);
		b1 = new Button(escolhido1.toString());
		b1.setBounds(100, 60, 70, 70);
		numeros.remove(escolhido1);
		Integer escolhido2 = getRandom(numeros);
		b2 = new Button(escolhido2.toString());
		b2.setBounds(225, 60, 70, 70);
		numeros.remove(escolhido2);
		Integer escolhido3 = getRandom(numeros);
		b3 = new Button(escolhido3.toString());
		b3.setBounds(350, 60, 70, 70);
		numeros.remove(escolhido3);
		Integer escolhido4 = getRandom(numeros);
		b4 = new Button(escolhido4.toString());
		b4.setBounds(100, 150, 70, 70);
		numeros.remove(escolhido4);
		Integer escolhido5 = getRandom(numeros);
		b5 = new Button(escolhido5.toString());
		b5.setBounds(225, 150, 70, 70);
		numeros.remove(escolhido5);
		Integer escolhido6 = getRandom(numeros);
		b6 = new Button(escolhido6.toString());
		b6.setBounds(350, 150, 70, 70);
		numeros.remove(escolhido6);
		Integer escolhido7 = getRandom(numeros);
		b7 = new Button(escolhido7.toString());
		b7.setBounds(100, 240, 70, 70);
		numeros.remove(escolhido7);
		Integer escolhido8 = getRandom(numeros);
		b8 = new Button(escolhido8.toString());
		b8.setBounds(225, 240, 70, 70);
		numeros.remove(escolhido8);
		b9 = new Button("");
		b9.setBounds(350, 240, 70, 70);
		desistir = new Button("DESISTIR");
		desistir.setBounds(195, 400, 100, 40);
		resolverTabuleiro = new Button("RESOLVER TABULEIRO");
		resolverTabuleiro.setBounds(170, 450, 150, 50);
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
		desistir.addActionListener(this);
		resolverTabuleiro.addActionListener(this);
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
		add(desistir);
		add(resolverTabuleiro);
		add(ajuda);
		
		setBackground(Color.green);
		setLocation(400, 100);
		setSize(500, 550);
		setLayout(null);
		setVisible(true);
		
	}

	//Verifica os botões em volta para ver se é possiver realizar o movimento do botão acionado
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String label = b1.getLabel();
			if (b2.getLabel() != ("") && b4.getLabel() != ("")) {
					JOptionPane.showMessageDialog(null, "Movimento Inválido"); //Caso o movimento seja inválido
			}
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b1.setLabel("");
				jogada++;
			}
			if (b4.getLabel().equals("")) {
				b4.setLabel(label);
				b1.setLabel("");
				jogada++;
			}
		}
		
		if (e.getSource() == b2) {
			String label = b2.getLabel();
			if (b1.getLabel() != ("") && b3.getLabel() != ("") && b5.getLabel() != ("")) {
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
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b2.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b3) {
			String label = b3.getLabel();
			if (b2.getLabel() != ("") && b6.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b3.setLabel("");
				jogada++;
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b3.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b4) {
			String label = b4.getLabel();
			if (b1.getLabel() != ("") && b7.getLabel() != ("") && b5.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b1.getLabel().equals("")) {
				b1.setLabel(label);
				b4.setLabel("");
				jogada++;
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
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
			if (b2.getLabel() != ("") && b6.getLabel() != ("") && b4.getLabel() != ("") && b8.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b5.setLabel("");
				jogada++;
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b5.setLabel("");
				jogada++;
			}
			if (b4.getLabel().equals("")) {
				b4.setLabel(label);
				b5.setLabel("");
				jogada++;
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b5.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b6) {
			String label = b6.getLabel();
			if (b9.getLabel() != ("") && b3.getLabel() != ("") && b5.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b6.setLabel("");
				jogada++;
			}
			if (b3.getLabel().equals("")) {
				b3.setLabel(label);
				b6.setLabel("");
				jogada++;
			}
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b6.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b7) {
			String label = b7.getLabel();
			if (b4.getLabel() != ("") && b8.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b4.getLabel().equals("")) {
				b4.setLabel(label);
				b7.setLabel("");
				jogada++;
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b7.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b8) {
			String label = b8.getLabel();
			if (b9.getLabel() != ("") && b7.getLabel() != ("") && b5.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b8.setLabel("");
				jogada++;
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b8.setLabel("");
				jogada++;
			}
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b8.setLabel("");
				jogada++;
			}
		}
		if (e.getSource() == b9) {
			String label = b9.getLabel();
			if (b6.getLabel() != ("") && b8.getLabel() != ("")) {
				JOptionPane.showMessageDialog(null, "Movimento Inválido");
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b9.setLabel("");
				jogada++;
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b9.setLabel("");
				jogada++;
			}
		}
		
		
		//Tela de desistência com os dados da partida jogada
		if (e.getSource() == desistir) {

			JOptionPane.showMessageDialog(this, "Voce Perdeu");
			JTable rankingTabela = new JTable(2, 3);
			JFrame frame = new JFrame("FIM DE JOGO");
			long tempoFinal = (Calendar.getInstance().getTime().getTime() - tempoInicio) / 60000;
			ButtonHandler.tempoFacil[i] = tempoFinal;

			
			frame.add(rankingTabela);
			frame.setBounds(880, 50, 500, 136);
			rankingTabela.setValueAt("                 Nome: ", 0, 0);
			rankingTabela.setValueAt("                 Pontuação: ", 0, 1); // Os espaços são para centralizar na interface					
			rankingTabela.setValueAt("                 Tempo (min): ", 0, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorFacil[i], 1, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoFacil[i] = (float) (jogada * 2.5), 1, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoFacil[i], 1, 2);
			tempoInicio = Calendar.getInstance().getTime().getTime();
			i++;
			ButtonHandler.f++;
			
			
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
		if (e.getSource() == resolverTabuleiro) {
			
			b1.setLabel("1");
			b2.setLabel("2");
			b3.setLabel("3");
			b4.setLabel("4");
			b5.setLabel("5");
			b6.setLabel("6");
			b7.setLabel("7");
			b8.setLabel("8");
			b9.setLabel("");
			
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
				}
			j++;
		}
		
		//Única combiação possível para a vitória + dados da partida jogada
		if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3")
				&& b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6")
				&& b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("")) {

			JOptionPane.showMessageDialog(this, "Voce Venceu!");

			JTable rankingTabela = new JTable(2, 3);
			JFrame frame = new JFrame("FIM DE JOGO");
			long tempoFinal = (Calendar.getInstance().getTime().getTime() - tempoInicio) / 60000;
			ButtonHandler.tempoFacil[i] = tempoFinal;

			 
																				 

			frame.add(rankingTabela);
			frame.setBounds(880, 50, 500, 136);
			rankingTabela.setValueAt("                 Nome: ", 0, 0);
			rankingTabela.setValueAt("                 Pontuação: ", 0, 1); // Os espaços são para centralizar na interface
			rankingTabela.setValueAt("                 Tempo (min): ", 0, 2);
			rankingTabela.setValueAt(ButtonHandler.jogadorFacil[i], 1, 0);
			rankingTabela.setValueAt(ButtonHandler.pontuacaoFacil[i] = (float) (jogada * 2.5), 1, 1);
			rankingTabela.setValueAt(ButtonHandler.tempoFacil[i], 1, 2);
			tempoInicio = Calendar.getInstance().getTime().getTime();
			i++;
			ButtonHandler.f++;

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