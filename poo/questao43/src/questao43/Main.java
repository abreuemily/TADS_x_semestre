package questao43;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 43. Faça um programa que leia um número de 0 e 60 e exiba na tela o seu sucessor, 
		//sabendo que o sucessor de 60 a 0. Não pode ser utilizado nem um comando de seleção e repetição
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número de 0 a 60:"));
		int sus = (numero + 1) % 61;
		JOptionPane.showMessageDialog(null, String.format("O sucessor de %d é %d.", numero, sus));
	}

}
