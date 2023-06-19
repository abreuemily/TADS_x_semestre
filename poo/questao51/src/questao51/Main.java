package questao51;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 51. Faça um programa que leia um número e imprima se ele é ímpar ou par.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
		if (a % 2 != 0) {
			JOptionPane.showMessageDialog(null, String.format("%d é ímpar.", a));

		}
		else {
			JOptionPane.showMessageDialog(null, String.format("%d é par.", a));

		}



	}

}
