package questao40;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 40. Faça um programa que receba um número real, calcule e exiba na tela: 
		//a parte inteira do número, a parte fracionaria do número e o número arredondado
		double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número real:"));
		int inteiro = (int) num;
		double flut = num - inteiro;
		JOptionPane.showMessageDialog(null, String.format("Parte inteira: %d%nParte fracionária: %f", inteiro, flut));


	}

}
