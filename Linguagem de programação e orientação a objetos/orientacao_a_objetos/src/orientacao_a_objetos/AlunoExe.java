package orientacao_a_objetos;

public class AlunoExe 
{
	public static void main(String[] args) 
	{
		Aluno a1; //variável de referencia, diz onde está o objeto
		a1 = new Aluno();
		
		Aluno a2 = new Aluno();
		
		a1.nome = "Emily";
		a1.cpf = 309396580;
		a1.idade = 21;
		a1.menor = false;
		
		a2.nome = "Ylime"; 
		a2.cpf = 876587578;
		a2.idade = 12;
		a2.menor = true;
		
	}

}
