package questao74;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 74. Faça um programa que receba a idade de um nadador e imprima sua categoria segundo a tabela a seguir:
		//Infantil A 5 - 7 anos
		//Infantil B 8 – 10 anos
		//Juvenil A 11 – 13 anos
		//Juvenil B 14 – 17 anos
		//Sênior maiores de 18 anos
		int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade:"));
		if (age >= 5 && age <= 7) {
			JOptionPane.showMessageDialog(null, "A categoria é Infantil A");

		}
		else if (age >= 8 && age <= 10) {
			JOptionPane.showMessageDialog(null, "A categoria é Infantil B");

		}
		else if (age >= 11 && age <= 13) {
			JOptionPane.showMessageDialog(null, "A categoria é Juvenil A");

		}
		else if (age >= 14 && age <= 17) {
			JOptionPane.showMessageDialog(null, "A categoria é Juvenil B");

		}
		else if (age > 18) {
			JOptionPane.showMessageDialog(null, "A categoria é Sênior");

		}
		else {
			JOptionPane.showMessageDialog(null, "Valor inválido.");

		}

	}

}
