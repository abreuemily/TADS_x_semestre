package questao79;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 79. O banco XXX concederá um credito especial com juros de 20% aos seus clientes de acordo com o saldo médio do ultimo ano. Faça 
		//um programa que leia o saldo médio de um cliente e calcule o valor do credito de acordo com a tabela a seguir:
			//SALDO MEDIO      PERCENTUAL
			//De 0 a 500       nenhum crédito
			//De 501 a 1000    30% do valor do saldo
			//De 1001 a 3000   40% do valor do saldo
			//Acima de 3001    50% do valor do saldo
			//Imprima uma mensagem informando o saldo médio e o valor do credito
		double medio = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o saldo médio:"));
		if (medio <= 500) {
			JOptionPane.showMessageDialog(null, String.format("Valor do saldo médio: R$ %.2f%nNenhum crédito para você (pobre)", medio));

		}
		else if (medio > 500 && medio <= 1000) {
			double credito = medio * 0.3;
			JOptionPane.showMessageDialog(null, String.format("Valor do saldo médio: R$ %.2f%nValor do crédito: R$ %.2f", medio, credito));

		}
		else if (medio > 1001 && medio <= 3000) {
			double credito = medio * 0.4;
			JOptionPane.showMessageDialog(null, String.format("Valor do saldo médio: R$ %.2f%nValor do crédito: R$ %.2f", medio, credito));

		}
		else if (medio > 3001) {
			double credito = medio * 0.5;
			JOptionPane.showMessageDialog(null, String.format("Valor do saldo médio: R$ %.2f%nValor do crédito: R$ %.2f", medio, credito));

		}

	}

}
