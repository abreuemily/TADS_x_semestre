package questao58;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 58. A prefeitura abriu uma linha de credito para os funcionários estatutários. O valor máximo
		//da prestação não poderá ultrapassar 30% do salário bruto. Faça um programa que permita ler um 
		//salário bruto e o valor da prestação e imprimir se é ou não possível fazer o empréstimo.
		double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário:"));
		double presta = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da prestação:"));
		double trinta = salario / 0.30;
		if (presta > trinta) {
			JOptionPane.showMessageDialog(null, "Não é possível fazer o empréstimo.");

		}
		else {
			JOptionPane.showMessageDialog(null, "É possível fazer o empréstimo.");

		}


	}

}
