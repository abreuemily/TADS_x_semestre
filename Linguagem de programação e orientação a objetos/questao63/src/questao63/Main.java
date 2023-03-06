package questao63;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 63. Faça um programa que entre com a sigla do Estado de uma pessoa e imprima uma das 
		//mensagens: carioca, paulista, mineiro, outros estados
		String estado = JOptionPane.showInputDialog(null, "Informe a sigla do seu estado:");
		String est = estado.toLowerCase();
	
		switch (est) {
		case "rj":
			JOptionPane.showMessageDialog(null, "Carioca");
			break;
		case "sp":
			JOptionPane.showMessageDialog(null, "Paulista");
			break;
		case "mg":
			JOptionPane.showMessageDialog(null, "Mineiro");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Outros estados");
			break;

		}
		


	}

}
