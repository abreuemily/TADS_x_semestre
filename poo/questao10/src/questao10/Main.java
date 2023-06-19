package questao10;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 10. Faça um programa que entre com 4 números e exiba na tela
		//a média ponderada, sabendo que seus respectivos pesos são: 1, 2, 3, 4.
		double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número:"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe outro número:"));
		double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe outro número:"));
		double d = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe outro número:"));
		double media = (a + (b * 2) + (c * 3) + (d * 4)) / 10;
		JOptionPane.showMessageDialog(null, String.format("Média ponderada: %.2f", media));


	}

}
