package questao46;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 46. Uma pessoa resolveu fazer uma aplicação na poupança programada. Para calcular seu 
		//rendimento, ela deverá fornecer o valor constante da aplicação mensal, a taxa e o número 
		//de meses. Sabendo-se que a fórmula é:
		//VALOR ACUMULADO = P * ((1 + i) ^n - 1) / i. P = aplicação mensal; i = taxa; n = número de meses.
		double apmensal = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da aplicação mensal:"));
		double taxa = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da taxa:"));
		double meses = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe quantos meses durará a poupança:"));
		if (apmensal < 0 || taxa < 0 || meses < 0) {
			JOptionPane.showMessageDialog(null, "Valores inválidos!");

		}
		else {
			double vacumulado = apmensal * (Math.pow((1 + (taxa / 100)), meses - 1)) / taxa;
			JOptionPane.showMessageDialog(null, String.format("O seu rendimento será R$%.2f.", vacumulado));

		}


	}

}
