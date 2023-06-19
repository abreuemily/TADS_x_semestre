package aula27do3;

import javax.swing.JOptionPane;

public class medicosExe {

	public static void main(String[] args) {
		Medicos m1, m2, m3;
		m1 = new Medicos();
		m2 = new Medicos();
		m3 = new Medicos();
		m1.setNome(JOptionPane.showInputDialog(null, "informe o nome do médico:"));
		JOptionPane.showMessageDialog(null, "Nome do(a) médico(a): " + m1.getNome());
		m2.setNome(JOptionPane.showInputDialog(null, "informe o nome do médico:"));
		JOptionPane.showMessageDialog(null, "Nome do(a) médico(a): " + m2.getNome());
		//m2 = null;

	}

}
