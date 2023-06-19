package aula_17do4;

public class Voluntario {
	private String nome;
	private String nacionalidade;
	private int idade;
	
	public Voluntario(String a, int b) {
		nacionalidade = a;
		idade = 18;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
