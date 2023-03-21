package orientacao_a_objetos;

public class Aluno 
{
	private String nome;
	private int idade; 
	private int cpf;
	private boolean menor;
	
	public void setNome(String nome) 
	{
		this.nome = nome; //se a variável local e a de instância tiverem o mesmo nome, para identificar coloca-se a palavra this. na variavel de instância
		
	}
	
	public String getNome() 
	{
		
		return nome;
	}
	
	public void setIdade(int n) 
	{
		if (n > 100)
			idade = 0;
		else
			idade = n;
		
	}
	
	public int getIdade() 
	{
		return idade;
		
	}
	
	public void setCpf(int n) 
	{
		cpf = n;
		
	}
	
	public int getCpf() 
	{
		return cpf;
		
	}
	
	public void setMenor(boolean n) 
	{
		menor = n;
		
	}
	
	public boolean getMenor() 
	{
		return menor;
		
	}

	//se as variáveis de instância estivessem aqui, ainda fariam parte da classe

}

//níveid de acesso a uma variável: public, private, protected, default
// inserir, alterar, deletar dado da variável -> set  consultar dado da variável -> get
// para gerar os métodos getter e setter automaticamente, vá em Source -> Generate getters and setters -> marque as variáveis desejadas -> Generate
	