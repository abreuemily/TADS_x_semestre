package questao44;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 44. Faça um programa que leia dois números reais e exiba na tela o quadrado da
		//diferença do primeiro valor pelo segundo e a diferença dos quadrados.
		double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número:"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número:"));
		double quadrado = Math.pow((a - b), 2);
		double diferenca = Math.abs(Math.pow(a, 2) - Math.pow(b, 2));
		JOptionPane.showMessageDialog(null, String.format("Quadrado da diferença: %.1f%nDiferença dos quadrados: %.1f", quadrado, diferenca));





	}

}
