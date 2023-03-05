package questao77;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 77. Sabendo que somente os municípios que possuem mais de 20000 eleitores tem segundo turno nas eleições para prefeito caso o 
	//primeiro colocado tenha mais de 50% dos votos, faça um programa que leia o nome do município, a quantidade de eleitores aptos, o 
		//numero de votos do candidato mais votado e informar se terá ou não segundo turno em sua eleição municipal.
		String nome = JOptionPane.showInputDialog(null, "Informe o nome do município:");
		int eleitores = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de eleitores aptos:"));
		if (eleitores < 20000) {
			JOptionPane.showMessageDialog(null, "Este município não tem segundo turno nas eleições para prefeito.");

		}
		else {
			int maisvot = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero de votos do candidato mais votado:"));
			if (maisvot > (eleitores * 0.5)) {
				JOptionPane.showMessageDialog(null, "Terá segundo turno na eleição municipal.");

				
			}
			else {
				JOptionPane.showMessageDialog(null, "Não terá segundo turno na eleição municipal.");

			}
		}
		

		
		




	}

}
