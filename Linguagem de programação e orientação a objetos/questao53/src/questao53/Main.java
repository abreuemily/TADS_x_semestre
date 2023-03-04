package questao53;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 53. Faça um programa que leia um peso na Terra e o número de um planeta e imprima o valor 
		//do seu peso no planeta escolhido. Gravidades relativas a Terra:
		//a) 0,37 Mercúrio
		//b) 0,88 Vênus
		//c) 0,38 Marte
		//d) 2,64 Júpiter
		//e) 1,15 Saturno
		//f) 1,17 Urano
		//Para calcular o peso no planeta use a formula: Pplaneta * (Pterra/10) * gravidade
		int peso = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um peso:"));
		int gplaneta = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Escolha um planeta:%n1- Mercúrio%n2- Vênus%n3- Marte%n4- Júpiter%n5- Saturno%n6- Urano")));
		if (gplaneta == 1) {
			double pplaneta1 = (peso / 10) * 0.37;
			JOptionPane.showMessageDialog(null, String.format("Peso em Mercúrio: %.1f kg", pplaneta1));

		}
		else if (gplaneta == 2) {
			double pplaneta2 = (peso / 10) * 0.88;
			JOptionPane.showMessageDialog(null, String.format("Peso em Vênus: %.1f kg", pplaneta2));

		}
		else if (gplaneta == 3) {
			double pplaneta3 = (peso / 10) * 0.38;
			JOptionPane.showMessageDialog(null, String.format("Peso em Marte: %.1f kg", pplaneta3));


		}
		else if (gplaneta == 4) {
			double pplaneta4 = (peso / 10) * 2.64;
			JOptionPane.showMessageDialog(null, String.format("Peso em Júpiter: %.1f kg", pplaneta4));


		}
		else if (gplaneta == 5) {
			double pplaneta5 = (peso / 10) * 1.17;
			JOptionPane.showMessageDialog(null, String.format("Peso em Saturno: %.1f kg", pplaneta5));


		}
		else if (gplaneta == 6) {
			double pplaneta6 = (peso / 10) * 1.15;
			JOptionPane.showMessageDialog(null, String.format("Peso em Urano: %.1f kg", pplaneta6));

		}
		else {
			JOptionPane.showMessageDialog(null, "Valor inválido!");

		}
		


	

	}

}
