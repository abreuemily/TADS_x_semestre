package questao6;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 6. Faça um programa que leia dois números inteiros e exiba na tela seu produto.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe outro número:"));
		int produto = a * b;
		JOptionPane.showMessageDialog(null, String.format("Produto: %d", produto));

	}

}
