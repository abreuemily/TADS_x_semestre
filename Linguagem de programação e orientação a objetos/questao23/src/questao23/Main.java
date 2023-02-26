package questao23;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 23. Faça um programa que calcule e exiba na tela a área de um triangulo.
		double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a base do triângulo:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura do triângulo:"));
		double area = (base * altura) / 2;
		JOptionPane.showMessageDialog(null, "Área do triângulo: " + area);


	}

}
