package questao62;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 62. Faça um programa que leia nome, sexo e idade de uma pessoa. Se a pessoa for do sexo
		//feminino e tiver menos que 25 anos, imprimir nome e a mensagem: ACEITA. Caso contrário, 
		//imprimir nome e a mensagem: NÃO ACEITA. (Considerar f, F, m, M)
		String nome = JOptionPane.showInputDialog(null, "Informe o seu nome:");
		String sexo = JOptionPane.showInputDialog(null, "Informe o seu sexo (F/M):");
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a sua idade:"));
		char genero = Character.toUpperCase(sexo.charAt(0));
		if (genero == 'F') {
			if (idade < 25) {
				JOptionPane.showMessageDialog(null, "ACEITA");

			}
			else {
				JOptionPane.showMessageDialog(null, "NÃO ACEITA");

			}
			
		}
		else {
			JOptionPane.showMessageDialog(null, "NÃO ACEITA");

		}



	}

}
