package questao22;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 22. Faça um programa que entre com os lados a, b, c de um paralelepípedo. 
		//Calcule e exiba na tela a diagonal.
		double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a base do paralelepípedo:"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura do paralelepípedo:"));
		double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a largura do paralelepípedo:"));
		double diagonal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
		JOptionPane.showMessageDialog(null, "Diagonal: " + diagonal);




	}

}
