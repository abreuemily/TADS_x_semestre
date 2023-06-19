package questao80;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	// 80. Faça um programa que leia um percurso em Km, o tipo de carro e o consumo estimado de combustível, sabendo-se que um carro tipo 
		//C faz 12 Km com um litro de gasolina, um tipo B faz 9 Km e o tipo A faz 8 Km por litro.
		double km = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o percurso em km:"));
		String tipo = JOptionPane.showInputDialog(null, String.format("Informe o tipo do carro (A, B ou C):"));
		char car = Character.toUpperCase(tipo.charAt(0));
		if (car == 'A') {
			double consumo = km / 8;
			JOptionPane.showMessageDialog(null, String.format("Consumo estimado de combustível: %.1f L", consumo));

		}
		if (car == 'B') {
			double consumo = km / 9;
			JOptionPane.showMessageDialog(null, String.format("Consumo estimado de combustível: %.1f L", consumo));

		}
		if (car == 'C') {
			double consumo = km / 12;
			JOptionPane.showMessageDialog(null, String.format("Consumo estimado de combustível: %.1f L", consumo));

		}
	}

}
