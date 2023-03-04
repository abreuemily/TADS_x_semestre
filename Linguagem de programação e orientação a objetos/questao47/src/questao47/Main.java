package questao47;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//47. Faça um programa que leia a quantidade de fitas que uma locadora de vídeo possui e
		//o valor que ela cobra por cada aluguel, mostrando as informações pedidas a seguir:
		//A) Sabendo-se que um terço das fitas são alugadas por mês, exiba o faturamento anual da 
		//locadora
		//B) Quando o cliente atrasa a entrega, é cobrada uma multa de 10% sobre o valor do aluguel, 
		//sabe-se que um décimo das fitas alugadas por mês são devolvidas com atraso, calcule o valor
		//ganho com multas por mês.
		//C) Sabendo-se que 2% de fitas se estragam ao longo do ano, e um décimo do total é comprado para
		//a reposição, exiba a quantidade de fitas que a locadora terá o final do ano
		int quantfitas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de fitas que a locadora possui:"));
		int aluguel = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor cobrado pelo aluguel das fitas:"));
		if (quantfitas < 0 || aluguel < 0) {
			JOptionPane.showMessageDialog(null, "Valores inválidos!");

		}
		else {
			double fatanual = ((quantfitas / 3) * aluguel) * 12;
			double multa = (((quantfitas / 3) / 10) * aluguel) * 1.1;
			int quantfimdoano = (int) ((int) (quantfitas) - ((quantfitas * 0.02) / 10));
			JOptionPane.showMessageDialog(null, String.format("Faturamento anual: R$ %.2f%nFaturamento mensal com multas: R$ %.2f%nQuantidade de fitas no final do ano: %d", fatanual, multa, quantfimdoano));

		}
		



	}

}
