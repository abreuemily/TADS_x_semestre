package questao70;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 70. Um comerciante comprou um produto e quer vende-lo com um lucro de 45% se o valor da compra for menor que 
		//R$ 20,00 caso contrário, o lucro será de 30%. Faça um programa que leia o valor do produto e imprima o valor da venda.
		double val = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do produto:"));
		if (val < 20) {
			double ven = val * 1.45;
			JOptionPane.showMessageDialog(null, String.format("Valor da venda: R$ %.2f.", ven));

		}
		else {
			double ven2 = val * 1.3;
			JOptionPane.showMessageDialog(null, String.format("Valor da venda: R$ %.2f.", ven2));


		}


	}

}
