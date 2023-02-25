package questao11;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 11. Faça um programa que entre com um angulo em graus e exiba na tela: 
		//seno, co-seno, tangente, secante, co-secante e co-tangente do mesmo
		double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um ângulo:"));
		double rad = (a * 3.14) / 180;
		double seno = Math.sin(rad);
		double coseno = Math.cos(rad);
		double tangente = Math.tan(rad);
		double cosecante = 1 / Math.sin(rad);
		double secante = 1 / Math.cos(rad);
		double cotangente = 1 / Math.tan(rad);
		JOptionPane.showMessageDialog(null, String.format("Seno: %.3f%nCosseno: %.3f%nTangente: %.3f%nCo-secante: %.3f%nSecante: %.3f%nCo-tangente: %.3f%n", seno, coseno, tangente, cosecante, secante, cotangente));

		


	}

}
