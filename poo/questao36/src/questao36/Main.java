package questao36;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 36. Faça um programa que leia o numerador e o denominador de uma fração 
		//e transforme-a em um número decimal.
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor do numerador:"));
		int deno = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor do denominador:"));
		if (deno == 0) 
		{
			JOptionPane.showMessageDialog(null, "O denominador deve ser diferente de 0!!");

		}
		else {
			double frac = num / deno;
			JOptionPane.showMessageDialog(null, String.format("Decimal: %.3f", frac));

		}


	}

}
