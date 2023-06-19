package questao15;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 15. Faça um programa que entre com o saldo de uma aplicação
		//e exiba na tela um novo saldo, considerando um reajuste de 1%.
		double aplicacao = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da aplicação:"));
		double ajuste = aplicacao * 1.01; 
		JOptionPane.showMessageDialog(null, "Novo saldo com reajuste de 1%: R$ " + ajuste);




	}

}
