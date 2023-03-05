package questao72;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 72. Faça um programa que leia uma quantia em reais e converta para uma das seguintes moedas:
		//f – franco suíço
		//l – libra
		//d – dólar
		//m – marco alemão
		double real = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor em reais:"));
		String moeda = JOptionPane.showInputDialog(null, String.format("Para qual das seguintes moedas deseja converter?%nf - franco suíço%nl – libra%nd – dólar%nm – marco alemão"));
		char inicial = Character.toLowerCase(moeda.charAt(0));
		if (inicial == 'f') {
			double franco = real * 0.18;
			JOptionPane.showMessageDialog(null, String.format("%.2f CHF", franco));

		}
		else if (inicial == 'l') {
			double libra = real * 0.16;
			JOptionPane.showMessageDialog(null, String.format("%.2f GBP", libra));

		}
		else if (inicial == 'd') {
			double dolar = real * 0.19;
			JOptionPane.showMessageDialog(null, String.format("%.2f USD", dolar));

		}
		else if (inicial == 'm') {
			double marco = real * 2.82;
			JOptionPane.showMessageDialog(null, String.format("%.2f DEM", marco));


		}
		else {
			JOptionPane.showMessageDialog(null, "Valor inválido.");

		}





	}

}
