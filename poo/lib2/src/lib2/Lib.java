package lib2;

public class Lib {
	private String titulo;
	private String editora;
	private String autor;
	private int ano;
	
	public void setTitulo(String x) {
		titulo = x;
	}
	public void setEditora(String x) {
		editora = x;
	}
	public void setAutor(String x) {
		autor = x;
	}
	public void setAno(int x) {
		ano = x;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getEditora() {
		return editora;
	}
	public String getAutor() {
		return autor;
	}
	public int getAno() {
		return ano;
	}
}

