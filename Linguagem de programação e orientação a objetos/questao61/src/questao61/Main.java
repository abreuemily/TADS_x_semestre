package questao61;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 61. Faça um programa que que leia um ano de nascimento e o ano atual e imprima a idade da 
		//pessoa, não se esqueça de verificar se o ano de nascimento é um ano válido
		int nascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o seu ano de nascimento:"));
		int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano atual:"));
		if (nascimento < 0 || ano < nascimento) {
			JOptionPane.showMessageDialog(null, "Valores inválidos!");

		}
		else {
			int idade = ano - nascimento;
			JOptionPane.showMessageDialog(null, String.format("A pessoa tem %d anos.", idade));

		}
			



	}

}
