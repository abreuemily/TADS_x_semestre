package biblioteca;

import javax.swing.JOptionPane;

public class LivroExe {

	public static void main(String[] args) {
		Livro l1, l2;
		l1 = new Livro();
		l2 = new Livro();
		l1.setTitulo(JOptionPane.showInputDialog(null, "Título do livro:"));
		l1.setIdioma(JOptionPane.showInputDialog(null, "Idioma:"));
		l1.setEditora(JOptionPane.showInputDialog(null, "Editora:"));
		l1.setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Ano da edição:")));
		JOptionPane.showMessageDialog(null, String.format("Título: %s%nIdioma: %s%nEditora: %s%nAno da edição: %d", l1.getTitulo(), l1.getIdioma(), l1.getEditora(), l1.getAno()));


	}

}
