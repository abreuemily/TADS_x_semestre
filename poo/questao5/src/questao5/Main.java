package questao5;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 5. Faça um programa que leia dois números inteiros e exiba na tela a soma.
		//Antes do resultado exiba na tela a mensagem "Soma".
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe outro número:"));
		int soma = a + b;
		JOptionPane.showMessageDialog(null, String.format("Soma: %d", soma));




	}

}
