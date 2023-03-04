package questao39;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 39. Faça um programa que leia o valor de um deposito e o valor de taxa de juros. 
		//Calcule e exiba na tela o valor do rendimento e o valor depois do rendimento.
		double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do depósito:"));
		double juro = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da taxa de juros:"));
		double rend = deposito * (juro / 100);
		double mont = deposito + rend;
		if (deposito < 0 || juro < 0) 
		{
			JOptionPane.showMessageDialog(null, "Valores inválidos!!");

		}
		else {
			
			JOptionPane.showMessageDialog(null, String.format("Valor do rendimento: R$%.2f%nMontante total: R$%.2f", rend, mont));

		}
				

	}

}
