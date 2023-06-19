package questao54;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 54. Faça um programa que leia 2 inteiros e efetue e a adição. Caso o valor somado seja maior
		//que 20, este deverá ser imprimido somando-se a 8, caso seja menor do que 20 o mesmo deverá ser 
		//imprimido subtraindo-se 5.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe outro número:"));
		int soma = a + b;
		if (soma > 20) {
			int soma1 = soma + 8;
			JOptionPane.showMessageDialog(null, String.format("Soma dos números + 8: %d", soma1));

		}
		else {
			int soma2 = soma - 5;
			JOptionPane.showMessageDialog(null, String.format("Soma dos números - 5: %d", soma2));

		}


	}

}
