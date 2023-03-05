package questao75;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 75. Um vendedor de um plano de saúde apresentou a tabela a seguir:
		//Até 10 anos – 30 reais
		//Acima de 10 até 29 anos – 60 reais
		//Acima de 29 até 45 anos – 120 reais
		//Acima de 45 até 59 anos – 150 reais
		//Acima de 59 até 95 anos – 250 reais
		//Maior que 65 anos – 400 reais
		//Faça um programa que leia o nome e a idade de uma pessoa e imprima o nome e o valor que ela deverá pagar.
		String nome = JOptionPane.showInputDialog(null, "Informe o nome:");
		int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade:"));
		if (age <= 10) {
			JOptionPane.showMessageDialog(null, String.format("Nome: %s%nValor do plano: R$ 30,00", nome));

		}
		else if (age > 10 && age <= 29) {
			JOptionPane.showMessageDialog(null, String.format("Nome: %s%nValor do plano: R$ 60,00", nome));

		}
		else if (age > 29 && age <= 45) {
			JOptionPane.showMessageDialog(null, String.format("Nome: %s%nValor do plano: R$ 120,00", nome));

		}
		else if (age > 45 && age <= 59) {
			JOptionPane.showMessageDialog(null, String.format("Nome: %s%nValor do plano: R$ 150,00", nome));

		}
		else if (age > 59 && age <= 65) {
			JOptionPane.showMessageDialog(null, String.format("Nome: %s%nValor do plano: R$ 250,00", nome));

		}
		else if (age > 65) {
			JOptionPane.showMessageDialog(null, String.format("Nome: %s%nValor do plano: R$ 400,00", nome));

		}
		else {
			JOptionPane.showMessageDialog(null, "Valor inválido.");
		}

	}

}
