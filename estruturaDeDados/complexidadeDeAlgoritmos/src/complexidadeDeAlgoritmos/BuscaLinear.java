package complexidadeDeAlgoritmos;

import java.util.Scanner;

public class BuscaLinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor=new int[8];
		for(int i=0; i < vetor.length; i++) {
			vetor[i] = (int)(Math.random()*10); //conversão de cast (forçando o math.random a mandar um inteiro)
			System.out.println(vetor[i]);
		}
		System.out.println("Qual numero vc busca (animal)?");
		Scanner leitor=new Scanner(System.in);
		int buscando=leitor.nextInt();
		boolean achou = false;
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] == buscando) {
				achou = true;
				break;
			}	
		}
		if (achou ) {
			System.out.println("Achou (anta)");
		}else {
			System.out.println("Não achou (anta)");
		}
	}

}
