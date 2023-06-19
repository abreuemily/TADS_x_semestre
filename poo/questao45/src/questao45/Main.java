package questao45;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 45. Dado m polígono convexo de N lados, podemos calcular o número de diagonais diferente(ND)
		//desse polígono pela fórmula: ND = N(N - 3) / 2. Faça um programa que leia quantos lados tem 
		//o polígono, calcule e exiba na tela o número de diagonais diferentes do mesmo.
		int diag = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de lados do polígono"));
		int ndiag = diag * (diag - 3) / 2;
		JOptionPane.showMessageDialog(null, String.format("O número de diagonais diferentes é %d.", ndiag));



	}

}
