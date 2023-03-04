package questao55;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 55. Faça um programa que leia um número e imprima a raiz quadrada caso ele positivo e o 
		//seu quadrado caso ele seja negativo.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
		if (a > 0) {
			double raiz = Math.sqrt(a);
			JOptionPane.showMessageDialog(null, String.format("Raiz quadrada de %d: %.1f", a, raiz));

		}
		else {
			double quadrado = Math.pow(a, 2);
			JOptionPane.showMessageDialog(null, String.format("Quadrado de %d: %.1f", a, quadrado));

		}



	}

}
