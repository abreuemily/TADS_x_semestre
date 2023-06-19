package questao66;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 66. Faça um programa que leia 3 números e armazene-os em 3 variáveis com os seguintes nomes: maior, intermediário e menor.

		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe três números:"));
		if (a < 100 || a > 999) {
			JOptionPane.showMessageDialog(null, "Você deve informar TRÊS números!");

		}
		else {
			int tres = a / 100;
			int sobra = a % 100;
			int dois = sobra / 10;
			int um = sobra % 10;
			if (um > dois && um > tres && dois > tres) {
				int maior = um;
				int intermediario = dois;
				int menor = tres;

			}
			else if (um > dois && um > tres && tres > dois) {
				int maior = um;
				int intermediario = tres;
				int menor = dois;
			}
			else if (dois > um && dois > tres && um > tres) {
				int maior = dois;
				int intermediario = um;
				int menor = tres;
			}
			else if (dois > um && dois > tres && tres > um) {
				int maior = dois;
				int intermediario = tres;
				int menor = um;
			}
			else if (tres > um && tres > dois && dois > um) {
				int maior = tres;
				int intermediario = dois;
				int menor = um;
			} 
			else if (tres > um && tres > dois && um > dois) {
				int maior = tres;
				int intermediario = um;
				int menor = dois;
			}
			
			
			
		}
			
	}

}