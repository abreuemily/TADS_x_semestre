package questao52;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 52. Faça um programa que leia um número e imprima se ele é positivo, positivo ou nulo.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
		if (a == 0) {
			JOptionPane.showMessageDialog(null, String.format("%d é nulo.", a));

		}
		else if (a < 0) {
			JOptionPane.showMessageDialog(null, String.format("%d é negativo.", a));

		}
		else {
			JOptionPane.showMessageDialog(null, String.format("%d é positivo.", a));

		}


	}

}
