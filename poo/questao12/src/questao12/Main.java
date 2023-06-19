package questao12;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 12. Faça um programa que entre com um número e exiba na tela o log desse número na base 10.
		double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número:"));
		double loga = Math.log10(a);
		JOptionPane.showMessageDialog(null, String.format("O log de %.1f na base 10 é: %.2f", a, loga));



	}

}
