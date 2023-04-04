package empresa;

import javax.swing.JOptionPane;

public class FuncionarioExe {

	public static void main(String[] args) {
	
		Funcionario[] vetFunc = new Funcionario[5];
		for (int i=0; i < 5; i++) {
			vetFunc[i] = new Funcionario();
			Funcionario.setQuantFuncionarios(i+1);
		}
		for (int i=0; i < 5; i++) {
			JOptionPane.showMessageDialog(null, "In   formações do " + (i+1) + "° funcionário:");
			vetFunc[i].setNome(JOptionPane.showInputDialog(null, "Nome do funcionário:"));
			vetFunc[i].setSalbruto(Integer.parseInt(JOptionPane.showInputDialog(null, "Salário de " + vetFunc[i].getNome() + ":")));
			vetFunc[i].setDesconto(Integer.parseInt(JOptionPane.showInputDialog(null, "Desconto do salário de " + vetFunc[i].getNome() + ":")));
		}
		for (int i=0; i < 5; i++) {
			JOptionPane.showMessageDialog(null, String.format("%s%n%d", vetFunc[i].getNome(), vetFunc[i].getDesconto()));
			

		}
		JOptionPane.showMessageDialog(null, "Quant. de funcionários: " + Funcionario.getQuantFuncionarios());

		
	}

}
