package questao63;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 63. Faça um programa que entre com a sigla do Estado de uma pessoa e imprima uma das 
		//mensagens: carioca, paulista, mineiro, outros estados
		String estado = JOptionPane.showInputDialog(null, "Informe a sigla do seu estado:");
		String est = estado.toLowerCase();
		String cari = "rj";
		String paul = "sp";
		String min = "mg";

		
		if (est == cari) {
			JOptionPane.showMessageDialog(null, "Carioca");

		}
		else if (est == paul) {
			JOptionPane.showMessageDialog(null, "Paulista");

		}
		else if (est == min) {
			JOptionPane.showMessageDialog(null, "Mineiro");

		}
		else {
			JOptionPane.showMessageDialog(null, "Outros estados");

		}


	}

}
