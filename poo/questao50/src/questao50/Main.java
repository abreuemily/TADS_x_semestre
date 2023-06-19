package questao50;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 50. Faça um programa que leia um número, se ele for positivo, imprima seu inverso, 
		//caso contrário imprima o valor absoluto do número.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
		if (a > 0) {
			int tres = a / 100; 
			int sobra = a % 100;
			int dois = (sobra / 10) * 10;
			int um = (sobra % 10) * 100;
			
			int inverso  = um + dois + tres;
			JOptionPane.showMessageDialog(null, String.format("Número inverso: %d", inverso));

		}
		else {
			int absoluto = Math.abs(a);
			JOptionPane.showMessageDialog(null, String.format("Número absoluto: %d", absoluto));

		}



	}

}
