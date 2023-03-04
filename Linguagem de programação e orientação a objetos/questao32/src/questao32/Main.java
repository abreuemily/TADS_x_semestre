package questao32;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 32. Faça um programa que calcule e apresente o valor do volume de uma lata de óleo, utilizando a fórmula: volume = 3.14159 * R^2 * altura
		double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o raio da lata de óleo:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura da lata de óleo:"));
		double volume = 3.14159 * Math.pow(raio, 2) * altura;
		JOptionPane.showMessageDialog(null, String.format("Volume: %.2f", volume));

	}

}
