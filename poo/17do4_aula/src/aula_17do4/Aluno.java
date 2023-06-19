package aula_17do4;

public class Aluno {
	private String nome;
	private int matricula;
	private int creditoCassino;
	private int idade;
	private double nota;
	private static int quantAlunos;
	
	public Aluno( ) { //metodos cronstrutores não tem nenhum tipo de retorno, o nome dele é o mesmo que o da classe
		nome = null;
		matricula = 0;
		idade = 0;
		nota = 0;
	}//metodo construtor default
	
	public Aluno(String n, int i, int j, int creditoCassino) {
		nome = n;
		matricula = j;
		idade = i;
		nota = 0;
		this.creditoCassino = creditoCassino;
	}
	/*
	public Aluno(int j, int i, String n) {
		nome = n;
		matricula = j;
		idade = i;
		nota = 0;
	}
*/

	public static int getQuantAlunos() {
		return quantAlunos;
	}
	public static void setQuantAlunos(int quantAlunos) {
		Aluno.quantAlunos = quantAlunos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	

}
