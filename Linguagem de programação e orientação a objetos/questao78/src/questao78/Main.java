package questao78;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 78. Um restaurante fez uma promoção semanal de descontos para clientes de acordo com as iniciais do nome da pessoa. Crie um 
	//programa que leia o primeiro nome do cliente, o valor de sua conta e se o nome iniciar coma as letras A, D, M ou S, dar um desconto 
		//de 30%. Para o cliente cujo nome não se inicia por nenhuma dessas letras, exibir a mensagem “Que pena. Nesta semana o desconto 
		//não é para o seu nome, mas continue a nos prestigiar que sua vez chegará”.
		String nome = JOptionPane.showInputDialog(null, "Informe o seu primeiro nome:");
		int conta = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor da conta:"));
		char letra = Character.toUpperCase(nome.charAt(0));
		if (letra == 'A' || letra == 'D' || letra == 'M' || letra == 'S') {
			double desc = conta * 0.7;
			JOptionPane.showMessageDialog(null, String.format("Valor da conta com desconto: R$ %.2f", desc));

		}
		else {
			JOptionPane.showMessageDialog(null, "Que pena. Nesta semana o desconto não é para o seu nome, mas continue a nos prestigiar que sua vez chegará!");

		}

	}

}
