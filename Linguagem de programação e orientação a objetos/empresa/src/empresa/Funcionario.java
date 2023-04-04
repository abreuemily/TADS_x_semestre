package empresa;

public class Funcionario {
	private String nome;
	private int salbruto;
	private int desconto;
	public static int quantFuncionarios;
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public int getSalbruto() 
	{
		return salbruto;
	}
	
	public void setSalbruto(int salbruto) 
	{
		this.salbruto = salbruto;
	}
	
	public int getDesconto() 
	{
		return desconto;
	}
	
	public void setDesconto(int x) 
	{
		desconto = salbruto - x;
	}
	
	public static int getQuantFuncionarios()
	{
		return quantFuncionarios;
	}
	
	public static void setQuantFuncionarios(int aquantFuncionarios) 
	{
		quantFuncionarios = aquantFuncionarios;
	}
	

	

}
