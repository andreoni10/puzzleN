package br.com.poli.puzzle;

import javax.swing.*;
import java.awt.*;


import br.com.poli.exceptions.MovimentoInvalidoException;
import br.com.poli.interfaces.Botao;

public class Main {

	public static void main(String args[]) throws MovimentoInvalidoException {

		Botao menu = new Botao();
		
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.getContentPane().setBackground(Color.orange);
		menu.setBounds(400, 100, 500, 550);
		menu.setVisible(true);
	}

}
