package questao18;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 18. Faça um programa que entre com um nome e exiba na tela: nome completo, 
		//primeiro caractere, último caractere, do primeiro ao 
		//terceiro caractere, quarto caractere, todos menos o primeiro e os dois últimos
		String nome = JOptionPane.showInputDialog(null, "Informe o seu nome:");
		char pri = nome.charAt(0);
		char ult = nome.charAt(nome.length()-1);
		String priter = nome.substring(0, 3);
		char quar = nome.charAt(3);
		String tod = nome.substring(1);
		String two = nome.substring(nome.length()-2);
		JOptionPane.showMessageDialog(null, String.format("%s%n%s%n%s%n%s%n%s%n%s%n%s", nome, pri, ult, priter, quar, tod, two));


	}

}
