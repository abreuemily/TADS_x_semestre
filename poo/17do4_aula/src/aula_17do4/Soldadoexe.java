package aula_17do4;

import javax.swing.JOptionPane;

public class Soldadoexe {

	public static void main(String[] args) {
		Soldado s1, s2, s3 , s4;
		s1 = new Soldado("Soldado raso");
		s2 = new Soldado("Soldado raso");
		s3 = new Soldado("Soldado raso");
		s4 = new Soldado("Soldado raso");
		
		s1.setNome(JOptionPane.showInputDialog("Informe o nome:"));
		s1.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula:")));
		s2.setNome(JOptionPane.showInputDialog("Informe o nome:"));
		s2.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula:")));
		s3.setNome(JOptionPane.showInputDialog("Informe o nome:"));
		s3.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula:")));
		s4.setNome(JOptionPane.showInputDialog("Informe o nome:"));
		s4.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula:")));
		
		JOptionPane.showMessageDialog(null, String.format("Nome: %s%nMatrícula: %d%nPatente: %s", s1.getNome(), s1.getMatricula(), s1.getPatente()));
		JOptionPane.showMessageDialog(null, String.format("Nome: %s%nMatrícula: %d%nPatente: %s", s2.getNome(), s2.getMatricula(), s2.getPatente()));
		JOptionPane.showMessageDialog(null, String.format("Nome: %s%nMatrícula: %d%nPatente: %s", s3.getNome(), s3.getMatricula(), s3.getPatente()));
		JOptionPane.showMessageDialog(null, String.format("Nome: %s%nMatrícula: %d%nPatente: %s", s4.getNome(), s4.getMatricula(), s4.getPatente()));
		
	}

}
