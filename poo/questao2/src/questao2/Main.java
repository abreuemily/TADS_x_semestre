package questao2;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 2. Faça um programa que leia dois números inteiros e os exiba na tela.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe outro número:"));
		JOptionPane.showMessageDialog(null, "Os números escolhidos foram " + a + " e " + b);



	}

}
