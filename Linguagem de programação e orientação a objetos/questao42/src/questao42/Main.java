package questao42;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 42. Faça um programa que leia o peso de uma pessoa (só a parte inteira),
		//calcule e exiba na tela: o peso da pessoa em gramas, novo 
		//peso (em gramas, se a pessoa engordar 12%).
		int peso = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o seu peso (só a parte inteira):"));
		if (peso < 0) {
			JOptionPane.showMessageDialog(null, "Valor inválido!!");

		}
		else {
			int grama = peso * 1000;
			int novo = (int) ((peso * 1.12) * 1000);
			JOptionPane.showMessageDialog(null, String.format("Total de gramas: %d g%nSe você engordar doze por cento: %d g", grama, novo));

		}



	}

}
