package questao49;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//49. Faça um programa que leia um número se ele for maior que 20, então imprima sua metade
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número maior que 20:"));
		if (a <= 20) {
			JOptionPane.showMessageDialog(null, "Valor inválido! (animal)");

		}
		else {
			double metade = a / 2;
			JOptionPane.showMessageDialog(null, String.format("Metade de %d: %.1f", a, metade));

		}


	}

}
