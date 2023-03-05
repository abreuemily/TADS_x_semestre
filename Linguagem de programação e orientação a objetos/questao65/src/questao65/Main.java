package questao65;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 65. Faça um programa que leia 3 números e imprima-os em ordem decrescente.
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe três números:"));
		if (a < 100 || a > 999) {
			JOptionPane.showMessageDialog(null, "Você deve informar TRÊS números!");

		}
		else {
			int tres = a / 100;
			int sobra = a % 100;
			int dois = sobra / 10;
			int um = sobra % 10;
			if (um > dois && um > tres && dois > tres) {
				JOptionPane.showMessageDialog(null, String.format("Número em ordem decrescente: %d%d%d", um, dois, tres));

			}
			else if (um > dois && um > tres && tres > dois) {
				JOptionPane.showMessageDialog(null, String.format("Número em ordem decrescenteo: %d%d%d", um, tres, dois));

			}
			else if (dois > um && dois > tres && um > tres) {
				JOptionPane.showMessageDialog(null, String.format("Número em ordem decrescente: %d%d%d", dois, um, tres));

			}
			else if (dois > um && dois > tres && tres > um) {
				JOptionPane.showMessageDialog(null, String.format("Número em ordem decrescente: %d%d%d", dois, tres, um));

			}
			else if (tres > um && tres > dois && dois > um) {
				JOptionPane.showMessageDialog(null, String.format("Número em ordem decrescente: %d%d%d", tres, dois, um));

			} 
			else if (tres > um && tres > dois && um > dois) {
				JOptionPane.showMessageDialog(null, String.format("Número em ordem decrescente: %d%d%d", tres, um, dois));

			}
			else if (um == dois && dois > tres) {
				JOptionPane.showMessageDialog(null, String.format("Número em ordem decrescente: %d%d%d", um, dois, tres));

			}
			else if (dois == tres && dois < um) {
				JOptionPane.showMessageDialog(null, String.format("Número em ordem decrescente: %d%d%d", um, dois, tres));

			}
			else if (um == tres && tres > dois) {
				JOptionPane.showMessageDialog(null, String.format("Número em ordem decrescente: %d%d%d", um, tres, dois));

			}
			else if (um == tres && tres < dois) {
				JOptionPane.showMessageDialog(null, String.format("Número em ordem decrescente: %d%d%d", dois, um, tres));

			}
			else if (um == dois && dois == tres) {
				JOptionPane.showMessageDialog(null, String.format("Números iguais: %d%d%d", tres, um, dois));

			}
			
		}
			
	}

}