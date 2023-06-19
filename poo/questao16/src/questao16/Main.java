package questao16;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 16. Faça um programa que entre com um número no formato CDU e 
		//exiba na tela invertido: UDC. Exiba na tela das duas maneiras em 
		// variáveis individuais.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe três números:"));
		if (a < 100 || a > 999) {
			JOptionPane.showMessageDialog(null, "Você deve informar TRÊS números! (animal)");

		}
		else {
			int tres = a / 100;
			int sobra = a % 100;
			int dois = sobra / 10;
			int um = sobra % 10;
			JOptionPane.showMessageDialog(null, String.format("Número invertido: %d%d%d", um, dois, tres));

					
		}


	}

}
