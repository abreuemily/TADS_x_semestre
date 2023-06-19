package questao33;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 33. Faça um programa que efetue o cálculo da quantidade de litros de combustível
		//gastos em uma viagem, sabendo-se que o carro faz 12km/L. Deverão ser fornecidos o tempo 
		//gasto na viagem e a velocidade média. Utilize,distancia = tempo * velocidade; litros usados = distancia / 12.
		int tempo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantas horas durou a viagem:"));
		int velocidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a velocidade média durante a viagem:"));
		if (tempo < 0 || velocidade < 0) {
		JOptionPane.showMessageDialog(null, "Valores inválidos!");
		}
		else {
		int distancia = tempo * velocidade;
		int litrosUsados = distancia / 12;
		JOptionPane.showMessageDialog(null, "Litros usados: " + litrosUsados + "L");
		}

	}

}
