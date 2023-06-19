package questao26;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 26. Faça um programa que entre com os valores dos catetos 
		//de um triangulo retângulo e exiba na tela a sua hipotenusa.
		double cateto1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a medida do cateto 1:"));
		double cateto2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a medida do cateto 2:"));
		if (cateto1 < 0 || cateto2 < 0) {
			JOptionPane.showMessageDialog(null, "Valores inválidos!");

		}
		else {
			double hipo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
			JOptionPane.showMessageDialog(null, String.format("Hipotenusa: %.2f.", hipo));

		}



	}

}
