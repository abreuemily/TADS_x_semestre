package aula_17do4;

import javax.swing.JOptionPane;

public class Voluntarioexe {

	public static void main(String[] args) {
		Voluntario v1, v2;
		v1 = new Voluntario("brasileiro", 18);
		v2 = new Voluntario("brasileiro", 18);
		v1.setNome(JOptionPane.showInputDialog(null, "Informe o nome do voluntário da CRUZ VERMELHA"));
		v2.setNome(JOptionPane.showInputDialog(null, "Informe o nome do voluntário da CRUZ VERMELHA"));
		JOptionPane.showMessageDialog(null, String.format("Nome: %s%nIdade: %d%nNacionalidade: %s", v1.getNome(), v1.getIdade(), v1.getNacionalidade()));
		JOptionPane.showMessageDialog(null, String.format("Nome: %s%nIdade: %d%nNacionalidade: %s", v2.getNome(), v2.getIdade(), v2.getNacionalidade()));

	}

}
