package questao9;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 9. Faça um programa que entre com dois números inteiros e exiba na tela a 
		//seguintes saída: dividendo, divisor, quociente e resto.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um dividendo:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um divisor:"));
		double quociente = a / b;
		double resto = a % b;
		JOptionPane.showMessageDialog(null, String.format("Dividendo: %d%nDivisor: %d%n Quociente: %.2f%nResto: %.2f", a, b, quociente, resto));

		


	}

}
