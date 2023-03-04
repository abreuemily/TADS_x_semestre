package questao48;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 48. Faça um programa que dado um número de conta corrente com três dígitos, retorne o seu
		//dígito verificador, o qual é calculado da seguinte forma:
		//Exemplo: número de conta: 235
		//A) Somar o número da conta com o seu inverso: 235 + 532 = 767.
		//B) Multiplicar cada dígito pela sua ordem posicional e somar estes resultados:
		//i. 7 6 7
		//C) X 1 2 3
		//i. 7+12+21=40
		//D) O último dígito desse resultado é o dígito verificador da conta(40 -> 0)
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da conta corrente:"));
		
		int tres = num / 100; 
		int sobra = num % 100;
		int dois = (sobra / 10) * 10;
		int um = (sobra % 10) * 100;
		
		int inverso  = (um + dois + tres) + num;
		
		int tressoma = (inverso / 100) * 3;
		
		int sobrasoma = inverso % 100;
		int doissoma = (sobrasoma / 10) * 2;
		int umsoma = sobrasoma % 10;
		int soma = doissoma + umsoma + tressoma;
		int digveri = soma % 10;
		
		JOptionPane.showMessageDialog(null, String.format("Número verificador: %d", digveri));

		
		


	}

}
