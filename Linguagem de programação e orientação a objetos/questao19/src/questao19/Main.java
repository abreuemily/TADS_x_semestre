package questao19;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 19. Faça um programa que entre com a base e altura de um
		//retângulo e exiba na tela: perímetro, área e a diagonal.
		double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a base do retângulo:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura do retângulo:"));
		
		if (base < 0 || altura < 0) {
			JOptionPane.showMessageDialog(null, "Valores inválidos!");

		}
		else {
			double perimetro = (base * 2) + (altura * 2);
			double area = base * altura;
			double diagonal = Math.sqrt(Math.pow(area, 2) + Math.pow(base, 2));
			JOptionPane.showMessageDialog(null, String.format("Perímetro: %.3f%nÁrea: %.3f%nDiagonal: %.3f%n", perimetro, area, diagonal));
		}
	




	}

}
