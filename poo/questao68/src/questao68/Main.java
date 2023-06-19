package questao68;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 68. Faça um programa que leia nome, nota n1 e nota n2 de um aluno. Imprima seu nome, nota n1, nota n2, média e uma das 
		//mensagens:Aprovado, Reprovado ou em Prova Final (a média é 7 para aprovação, menor que 4 para reprovação e as demais para 
		//prova final)
		String nome = JOptionPane.showInputDialog(null, "Informe o seu nome:");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota da 1ª avaliação:"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota da 2ª avaliação:"));
		double media = (nota1 + nota2) / 2;
		if (media >= 7) {
			JOptionPane.showMessageDialog(null, String.format("Aluno(a): %s%n1ª avaliação: %.1f%n2ª avaliação: %.1f%nMédia: %.1f%nAprovado", nome,nota1, nota2, media));

		}
		else if (media < 4) {
			JOptionPane.showMessageDialog(null, String.format("Aluno(a): %s%n1ª avaliação: %.1f%n2ª avaliação: %.1f%nMédia: %.1f%nReprovado", nome, nota1, nota2, media));

		}
		else {
			JOptionPane.showMessageDialog(null, String.format("Aluno(a): %s%n1ª avaliação: %.1f%n2ª avaliação: %.1f%nMédia: %.1f%nEm prova final", nome,nota1, nota2, media));

		}




	}

}
