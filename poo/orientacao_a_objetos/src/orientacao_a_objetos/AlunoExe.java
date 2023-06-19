package orientacao_a_objetos;

import javax.swing.JOptionPane;

public class AlunoExe 
{
	public static void main(String[] args) 
	{
		Aluno a1; //variável de referencia, diz onde está o objeto
		a1 = new Aluno();
		Aluno a3;
		Aluno a2 = new Aluno();
		a3 = a1;
		a1.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "informe a idade:")));
		JOptionPane.showMessageDialog(null, a1.getIdade());
		//a1.nome = "Emily";
		//a1.cpf = 309396580;
		//a1.idade = 21;
		//a1.menor = false;
		
		//a2.nome = "Ylime"; 
		//a2.cpf = 876587578;
		//a2.idade = 12;
		//a2.menor = true;
		//a2 = null;
		a1 = null;
		//a1.nome = "Abreu";
	}

}
