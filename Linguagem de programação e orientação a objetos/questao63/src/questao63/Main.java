package questao63;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 63. Faça um programa que entre com a sigla do Estado de uma pessoa e imprima uma das 
		//mensagens: carioca, paulista, mineiro, outros estados
		String estado = JOptionPane.showInputDialog(null, "Informe a sigla do seu estado:");
		
		if (estado == "RJ" || estado == "Rj" || estado == "rj" || estado == "rJ") {
			JOptionPane.showMessageDialog(null, "Carioca");

		}
		else if (estado == "SP" || estado == "Sp" || estado == "sp" || estado == "sP") {
			JOptionPane.showMessageDialog(null, "Paulista");

		}
		else if (estado == "MG" || estado == "Mg" || estado == "mg" || estado == "mG") {
			JOptionPane.showMessageDialog(null, "Mineiro");

		}
		else {
			JOptionPane.showMessageDialog(null, "Outros estados");

		}
		


	}

}
