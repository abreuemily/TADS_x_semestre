package questao41;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 41. Faça um programa que leia o valor do salário mínimo e o valor do salário de uma pessoa.
		//Calcule e exiba na tela quantos salários mínimos ela ganha.
		double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do seu salário:"));
		double min = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do salário mínimo atual:"));
		if (salario < 0 || min < 0) 
		{
			JOptionPane.showMessageDialog(null, "Valores inválidos!!");

		}
		else 
		{
			double quant = salario / min;
			JOptionPane.showMessageDialog(null, String.format("Você ganha %.2f salários mínimos.", quant));

		}




	}

}
