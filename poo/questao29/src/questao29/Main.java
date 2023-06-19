package questao29;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 29. Faça um programa que possa entrar com o valor de um produto e exiba na tela o
		//novo valor tendo em vista que o desconto de 9%.
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do produto:"));
		if (valor < 0) {
			JOptionPane.showMessageDialog(null, "Valor inválido!");

		}
		else {
			double novovalor = valor * 0.91;
			JOptionPane.showMessageDialog(null, String.format("Valor com desconto: R$ %.2f.", novovalor));

		}



	}

}
