package questao3;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 3. Faça um programa que leia um número inteiro e exiba na tela seu sucessor e seu antecessor.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
		int ant = a - 1;
		int sus = a + 1;
		JOptionPane.showMessageDialog(null, String.format("Sucessor: %d%nAntecessor: %d", sus, ant));


	}

}
