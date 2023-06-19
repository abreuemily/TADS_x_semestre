package questao27;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 27. Faça um programa que entre com a razão de uma PA e o valor do 1º termo. 
		//Calcule e exiba na tela o 10º termo da série.
		double razao = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a razão da PA:"));
		double termo1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o seu primeiro termo:"));
		double termo10 = termo1 + 9 * razao;
		JOptionPane.showMessageDialog(null, "O 10º termo desta PA é " + termo10);




	}

}
