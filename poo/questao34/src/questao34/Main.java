package questao34;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 34. Faça um programa que efetue o cálculo do valor de uma prestação em atraso, utilizando:
		//prestação = valor + (valor * (taxa / 100) * tempo).
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da prestação em atraso:"));
		double taxa = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a taxa:"));
		double tempo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe quanto tempo está em atraso (em dias):"));
		if (valor < 0 || taxa < 0 || tempo < 0) {
		JOptionPane.showMessageDialog(null, "Valor inválido!");
		}
		else {
		double mes = tempo / 30;
		double prestacao = valor + (valor  * (taxa / 100) * mes);
		JOptionPane.showMessageDialog(null, String.format("Valor da prestação: R$%.2f", prestacao));
		}

	}

}
