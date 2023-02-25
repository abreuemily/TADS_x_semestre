package questao14;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 14. Faça um programa que entre com um número e exiba na tela:
		//número, quadrado e raiz quadrada.
		double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número:"));
		double quadrado = Math.pow(a, 2);
		if (a < 0) {
			JOptionPane.showMessageDialog(null, String.format("Número: %.2f%nQuadrado: %.2f%nRaiz quadrada: este número não possui raiz quadrada real", a, quadrado));

		}
		else {
			double raiz = Math.sqrt(a);
			JOptionPane.showMessageDialog(null, String.format("Número: %.2f%nQuadrado: %.2f%nRaiz quadrada: %.2f", a, quadrado, raiz));

		}

	}

}
