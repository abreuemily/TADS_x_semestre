package questao71;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 71. A turma de programação I, por ter muitos alunos, será dividida em dias de provas. Decidiu-se dividi-las em 3 grupos. 
		//Faça um programa que leia o nome do aluno e imprima a sala onde o mesmo irá fazer a prova:
			//A – K: sala 101
			//L – N: sala 102
			//O –Z: sala 103
		String nome = JOptionPane.showInputDialog(null, "Informe o seu primeiro nome:");
		char inicial = Character.toUpperCase(nome.charAt(0));
		if (inicial == 'A' || inicial == 'B' || inicial == 'C' || inicial == 'D' || inicial == 'E' || inicial == 'F' || inicial == 'G' || inicial == 'H' || inicial == 'I' || inicial == 'J' || inicial == 'K') {
			JOptionPane.showMessageDialog(null, "Fará na sala 101");

		}
		else if (inicial == 'L' || inicial == 'M' || inicial == 'N') {
			JOptionPane.showMessageDialog(null, "Fará na sala 102");

		}
		else if (inicial == 'O' || inicial == 'P' || inicial == 'Q' || inicial == 'R' || inicial == 'S' || inicial == 'T' || inicial == 'U' || inicial == 'V' || inicial == 'W' || inicial == 'X' || inicial == 'Y' || inicial == 'Z') {
			JOptionPane.showMessageDialog(null, "Fará na sala 103");

		}


	}

}
