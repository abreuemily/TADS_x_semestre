package questao67;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 67. Faça um programa que leia 3 números, os possíveis lados de um triangulo, e imprima a classificação segundo os lados.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o lado A do triângulo:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o lado B do triângulo:"));
		int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o lado C do triângulo:"));
		if (Math.abs(b - c) < a && a < (b + c) && Math.abs(a - c) < b && b < (a + c) && Math.abs(a - b) < c && c < (a + b)) {
			if (a == b && b == c) {
				JOptionPane.showMessageDialog(null, "Triângulo equilátero.");

			}
			else if (a == b || b == c || c == a) {
				JOptionPane.showMessageDialog(null, "Triângulo isosceles.");

			}
			else {
				JOptionPane.showMessageDialog(null, "Triângulo escaleno.");

			}

		}
		else if (a >= (b + c) || b >= (a + c) || c >= (a + b)) {
			JOptionPane.showMessageDialog(null, "Não é possível fazer um triângulo com essas medidas.");

		}
		


	}

}
