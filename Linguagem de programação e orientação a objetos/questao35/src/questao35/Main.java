package questao35;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 35. Faça um programa que leia valores para as variáveis A e B, efetue a troca de 
		//valores para que a variável A passe a ter o valor da variável B e vice versa,
		//apresente os valores trocados.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina um valor para A:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina um valor para B:"));
		int aux;
		aux = a;
		a = b;
		b = aux;
		JOptionPane.showMessageDialog(null, String.format("%d | %d", a, b));

				
				
	}

}
