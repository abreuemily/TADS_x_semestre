package questao73;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 73. Faça um programa que leia a altura e o sexo da pessoa, calcule e imprima o seu peso ideal, utilizando as seguintes 
		//formulas:
		//Homens: (72,7 * H) - 58
		//Mulheres: (62,1 * H) – 44,7
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a sua altura:"));
		String sexo = JOptionPane.showInputDialog(null, "Informe o seu sexo (m/f):");
		char genero = Character.toLowerCase(sexo.charAt(0));
		if (genero == 'f') {
			double peso = (62.1 * altura) - 44.7;
			JOptionPane.showMessageDialog(null, String.format("Seu peso ideal é %.2f kg (sqñ)", peso));

		}
		else if (genero == 'm') {
			double peso2 = (72.7 * altura) - 58;
			JOptionPane.showMessageDialog(null, String.format("Seu peso ideal é %.2f kg (sqñ)", peso2));

		}
		else {
			JOptionPane.showMessageDialog(null, "Valor inválido.");

		}



	}

}
