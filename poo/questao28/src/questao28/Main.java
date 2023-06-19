package questao28;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 28. Faça um programa que entre com a razão de uma PG e o valor do 1º termo. 
		//Calcule e exiba na tela o 5º termo da série.
		double razao = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a razão da PG:"));
		double termo1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o seu primeiro termo:"));
		double termo5 = termo1 * Math.pow(razao, 4);
		JOptionPane.showMessageDialog(null, "O 5º termo desta PG é " + termo5);




	}

}
