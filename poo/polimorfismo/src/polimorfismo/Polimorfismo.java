package polimorfismo;

import javax.swing.JOptionPane;

public class Polimorfismo {
	public static void main(String[] args){
		Funcionario[] funcionario = new Funcionario[3];
		
		funcionario[0]=new Chefe();
		funcionario[1]=new Chefe();
		funcionario[2]=new Chefe();
		
		
		for(int i=0; i<3; i++) {
			funcionario[0].setNome(JOptionPane.showInputDialog(null , "digite o nome"));
			funcionario[1].setTelefone(Integer.parseInt(JOptionPane.showInputDialog(null , "digite o telefone")));
			funcionario[2].setSalario(Double.parseDouble(JOptionPane.showInputDialog(null , "digite o salário")));
			//funcionario[3].setCargo(JOptionPane.showInputDialog(null , "digite o nome"));
		}
		
		
		for(int i=0; i<3; i++) {
			
			JOptionPane.showMessageDialog(null,funcionario[i].getNome()+ "\n"+ funcionario[i].getTelefone()+"\n"+funcionario[i].calcularSalario());
			
		}
	}
	

}
