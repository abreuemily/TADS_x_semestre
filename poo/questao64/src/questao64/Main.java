package questao64;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 64. Faça um programa que leia 2 números e imprima o quadrado do menor número e a
		//raiz quadrada do maior número.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número:"));
		if (a > b) {
			double maiora = Math.sqrt(a);
			double menorb = Math.pow(b, 2);
			JOptionPane.showMessageDialog(null, String.format("Raiz quadrada de %d: %.1f%nQuadrado de %d: %.1f", a, maiora, b, menorb));

		}
		else {
			double maiorb = Math.sqrt(b);
			double menora = Math.pow(a, 2);
			JOptionPane.showMessageDialog(null, String.format("Raiz quadrada de %d: %.1f%nQuadrado de %d: %.1f", b, maiorb, a, menora));

		}


	}

}
