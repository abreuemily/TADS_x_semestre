package questao25;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 25. Faça um programa que entre com notas P1 e P2 e exiba na
		//tela a média final truncada e arredondada.
		double p1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota da 1ª avaliação:"));
		double p2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota da 2ª avaliação:"));
		double media = (p1 + p2) / 2;
		JOptionPane.showMessageDialog(null, String.format("A sua média final é %.1f.", media));




	}

}
