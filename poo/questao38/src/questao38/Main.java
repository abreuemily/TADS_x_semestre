package questao38;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 38. Faça um programa que leia um valor de hora informe quantos
		//minutos se passaram desde o início do dia.
		int hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe as horas (sem os minutos):"));
		int minuto = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe os minutos:"));

		int min = (hora * 60) + minuto;
		JOptionPane.showMessageDialog(null, String.format("Já se passaram %d minutos desde o início do dia", min));

		



	}

}
