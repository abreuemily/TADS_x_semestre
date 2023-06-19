package questao20;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 20. Faça um programa que entre com um raio de um círculo e exiba na tela: perímetro e área.
		double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o raio da circunferência:"));
		double perimetro = 2 * 3.14 * raio;
		if (raio < 0 || perimetro < 0) {
			JOptionPane.showMessageDialog(null, "Valores inválidos!");

		}
		else {
			double area = 3.14 * Math.pow(raio, 2);
			JOptionPane.showMessageDialog(null, String.format("Perímetro: %.2f%nÁrea: %.2f", perimetro, area));
		}
		




	}

}
