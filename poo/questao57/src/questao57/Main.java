package questao57;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 57. Faça um programa que leia um número e imprima se ele é 
		//divisível por 10, por 5, por 2 ou por nenhum destes.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
		 if (a % 10 == 0) {
				JOptionPane.showMessageDialog(null, "É divisível por 10.");

		 }
		 else if (a % 5 == 0) {
				JOptionPane.showMessageDialog(null, "É divisível por 5.");

		 }
		 else if (a % 2 == 0) {
				JOptionPane.showMessageDialog(null, "É divisível por 2.");

		 }
		 else {
				JOptionPane.showMessageDialog(null, "Não é divisível por 10, 5 ou 2.");

		 }
		
		


	}

}
