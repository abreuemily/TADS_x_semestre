package questao59;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 59. Faça um programa que leia um inteiro de 3 casas decimais e imprima se o algarismo
		//da centena é impar ou par.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número de três casas decimais:"));
		if (a < 100) {
			JOptionPane.showMessageDialog(null, "Valor inválido!");

		}
		else {
			int tres = a / 100;
			if (tres % 2 != 0) {
				JOptionPane.showMessageDialog(null, "O algarismo da centena é ímpar.");

			}
			else {
				JOptionPane.showMessageDialog(null, "O algarismo da centena é par.");

			}
		}
		



	}

}
