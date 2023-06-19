package biblioteca;

import javax.swing.JOptionPane;

public class UsuarioExe {

	public static void main(String[] args) {
		Usuario u1, u2, u3; 
		u1 = new Usuario();
		u2 = new Usuario();
		u3 = new Usuario();
		u1.setNome(JOptionPane.showInputDialog(null, "Informe o nome:"));
		u1.setGenero(JOptionPane.showInputDialog(null, "Informe o gênero (F/M):"));
		JOptionPane.showMessageDialog(null, String.format("Nome: %s%nGênero: %s", u1.getNome(), u1.getGenero()));


	}

}
