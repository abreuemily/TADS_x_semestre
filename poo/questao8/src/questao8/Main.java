package questao8;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 8. Faça um programa que entre com dois números reais e exiba na tela a 
		//sua média aritmética, com a mensagem "Média:" antes do resultado
		double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número:"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe outro número:"));
		double media = (a + b) / 2.0;
		JOptionPane.showMessageDialog(null, String.format("Média: %.2f", media));



	}

}
