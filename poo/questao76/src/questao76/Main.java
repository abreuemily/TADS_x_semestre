package questao76;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 76. Faça um programa que leia 3 inteiros (variáveis a, b, c) e efetuar cálculo da equação de segundo grau, apresentando: 
		//as duas raízes, se para os calores informados for possível fazer o cálculo delta; A mensagem “Não há raízes reais” se não
		//for possível fazer o cálculo delta; e a mensagem “Não é equação de segundo grau” se a for igual a zero.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor a:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor b:"));
		int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor c:"));
		if (a == 0) {
			JOptionPane.showMessageDialog(null, "Não é equação polinomial do segundo grau.");

		}
		else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				JOptionPane.showMessageDialog(null, "Não há raizes reais.");

			}
			else {
				double x1 = (-b - Math.sqrt(delta)) / (2 * a);
				double x2 = (-b + Math.sqrt(delta)) / (2 * a);
				JOptionPane.showMessageDialog(null, String.format("X1 = %.1f%nX2 = %.1f", x1, x2));


			}
		}



	}

}
