package questao37;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 37. Faça um programa que leia o valor gasto com despesas realizadas em um 
		//restaurante e exiba na tela o valor total com a gorjeta (10%).
		double despesas = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor gasto no restaurante:"));
		double total = despesas * 1.1;
		JOptionPane.showMessageDialog(null, String.format("Total a pagar: R$%.2f", total));

}


	}


