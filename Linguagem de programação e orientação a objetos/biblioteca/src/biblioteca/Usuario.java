package biblioteca;

public class Usuario {
	private String nome;
	private char genero;
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String x) 
	{
		nome = x;
	}
	
	public char getGenero() 
	{
		return genero;
	}
	
	public void setGenero(String x) 
	{
		genero = x.charAt(0);
	}
	

}
