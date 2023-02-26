package questao24;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 24. Faça um programa que calcule e exiba na tela a área de um losango.
		double maior = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a base maior do losango:"));
		double menor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a base menor do losango:"));
		double area = (menor * maior) / 2;
		JOptionPane.showMessageDialog(null, "Área do losango: " + area);



	}

}
