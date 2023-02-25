package questao4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 4. Faça um programa que leia nome, endereço e telefone e exiba na tela.
		String nome = JOptionPane.showInputDialog(null, "Informe o seu nome:");
		String telefone = JOptionPane.showInputDialog(null, "Informe o seu telefone:");
		String endereco = JOptionPane.showInputDialog(null, "Informe o seu endereço:");
		JOptionPane.showMessageDialog(null, String.format("Nome: %s%nTelefone: %s%nEndereço: %s", nome, telefone, endereco));





	}

}
