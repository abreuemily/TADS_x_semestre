package questao7;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 7. Faça um programa que leia um número real e exiba na tela a sua terça parte.
		double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número:"));
		double terca = a / 3.0;
		JOptionPane.showMessageDialog(null, String.format("Produto: %.2f", terca));



	}

}
