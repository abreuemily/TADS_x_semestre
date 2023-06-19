package questao56;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 56. Faça um programa que leia um números e imprima uma das mensagens: 
		//é múltiplo de 3 ou não é múltiplo de 3.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
		if (a % 3 != 0) {
			JOptionPane.showMessageDialog(null, "Não é múltiplo de 3.");

		}
		else {
			JOptionPane.showMessageDialog(null, "É múltiplo de 3.");

		}
			



	}

}
