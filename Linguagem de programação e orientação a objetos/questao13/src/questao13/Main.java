package questao13;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 13. Faça um programa que entre com o número e a base em que se deseja 
		// calcular o log e o exiba na tela.
		double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número:"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a base desejada para o cálculo do log:"));
		double loga = Math.log(a) / Math.log(b);
		JOptionPane.showMessageDialog(null, String.format("O log de %.1f na base %.1f é %.2f", a, b, loga));



	}

}
