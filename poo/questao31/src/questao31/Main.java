package questao31;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		// faça um programa que leia a temperatura em graus celsius e apresente as em fahrenheit. F = (9C+160) / 5. C = Celsius F = Fahrenheit 
		double celsius = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a temperatura em celsius:"));
		double fah = (9 * celsius + 160) / 5;
		JOptionPane.showMessageDialog(null, String.format("É  equivalente a %.1f °F.", fah));

	}

}
