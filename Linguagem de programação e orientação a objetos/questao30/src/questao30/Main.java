package questao30;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 30. Faça um programa que efetue o cálculo do salário líquido de um professor, 
		//os valores fornecidos são: valor da hora aula, número de aulas dadas no mês e 
		//percentual do INSS.
		double numAulas = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o número de aulas ministradas em um mês:"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da hora/aula:"));
		double inss = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a porcentagem destinada ao INSS:"));
		if (numAulas < 0 || inss < 0 || valor < 0) {
			JOptionPane.showMessageDialog(null, "Valores inválidos!");

		}
		else {
			double saliquido = (numAulas * valor) * ((100 - inss) / 100);
			JOptionPane.showMessageDialog(null, String.format("Valor do seu salário líquido: R$ %.2f.", saliquido));

		}

		




	}

}
