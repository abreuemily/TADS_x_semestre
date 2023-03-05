package questao69;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 69. Faça um programa que leia o salário de uma pessoa e imprima o desconto do INSS:
		//Salario       Desconto
		//<= 600         isento
		//>600, <1200     20%
		//>1200, <2000    25%
		//>2000           30%
		int sal = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o salário:"));
		if (sal <= 600) {
			JOptionPane.showMessageDialog(null, "Isento.");

		}
		else if (sal > 600 && sal < 1200) {
			double desc = sal * 0.2;
			JOptionPane.showMessageDialog(null, String.format("O desconto do INSS será R$ %.2f.", desc));

		}
		else if (sal > 1200 && sal < 2000) {
			double desc2 = sal * 0.25;
			JOptionPane.showMessageDialog(null, String.format("O desconto do INSS será R$ %.2f.", desc2));


		}
		else {
			double desc3 = sal * 0.3;
			JOptionPane.showMessageDialog(null, String.format("O desconto do INSS será R$ %.2f.", desc3));

		}


	}

}
