public class Fila {
    int valores[];
	int primeiro, ultimo, total;
	//construtor
	public Fila(){
		primeiro=0;
		ultimo=0;
		total=0;
		valores=new int[5];
	}
	public boolean vazio() {
		return total==0;
	}
	public boolean cheio() {
		return total==valores.length;
	}
	public void inserir(int item) {
		if (cheio()) {
			throw new RuntimeException("Fila cheia (anta)!");
		}
		valores[ultimo]=item;
		ultimo=(ultimo+1)%valores.length;
		total++;
	}
	public int remover() {
		if (vazio()) {
			throw new RuntimeException("Fila vazia (anta)!");
			
		}
		int item=valores[primeiro];
		primeiro=(primeiro+1)%valores.length;
		total--;
		return item;
	}


    }

