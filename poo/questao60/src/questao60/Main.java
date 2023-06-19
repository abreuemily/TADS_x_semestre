package questao60;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 60. Faça um programa que indique se o número digitado está entre 20 e 90 ou não.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
		if (a >= 20 && a <= 90) {
			JOptionPane.showMessageDialog(null, "O número informado está entre 20 e 90.");

		}
		else {
			JOptionPane.showMessageDialog(null, "O número informado não está entre 20 e 90.");

		}


	}

}
