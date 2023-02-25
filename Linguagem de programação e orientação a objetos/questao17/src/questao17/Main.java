package questao17;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 17. Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo, 
		//faça um programa que receba o valor de um salário mínimo e a quantidade de quilowatts
		//gasta por uma residência e exiba na tela: O valor em reais de cada quilowatt, 
		//o valor em reais a ser pago e o novo valor a ser pago por essa residência com um 
		//desconto de 10%.
		
		
		
		int quilo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de quilowatts gastos:"));
		int salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o salário mínimo atual:"));
		if (quilo < 0 || salario < 0) {
			JOptionPane.showMessageDialog(null, "Valores inválidos! (animal)");

		}
		else {
			double valorquilo = (salario / 7) / 100;
			double quilogasto = valorquilo * quilo;
			double descquilo = quilogasto * 0.9;
			JOptionPane.showMessageDialog(null, String.format("Valor por quilowatt: R$ %.2f%nValor a ser pago: R$ %.2f%nValor a ser pago com desconto: R$ %.2f", valorquilo, quilogasto, descquilo));
		}
		
		




		


	}

}
