package questao21;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 21. Faça um programa que entre com um lado de um quadrado 
		//e exiba na tela: perímetro, área e diagonal.
		double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o lado do quadrado:"));
		
		if (lado < 0) {
			JOptionPane.showMessageDialog(null, "Valor inválido!");

		}
		else {
			double perimetro = (lado * 4);
			double area = Math.pow(lado, 2);
			double diagonal = Math.sqrt(2) * lado;
			JOptionPane.showMessageDialog(null, String.format("Perímetro: %.3f%nÁrea: %.3f%nDiagonal: %.3f%n", perimetro, area, diagonal));
		}

	}

}
