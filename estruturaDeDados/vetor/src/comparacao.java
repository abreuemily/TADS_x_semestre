import java.util.ArrayList;

public class comparacao {
  
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<Integer>();
        ArrayList<Integer> vetor = new ArrayList<Integer>();

        //adicionar elementos
        int limite = 100000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;
        for(int i=0; i < limite; i++){
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou "+limite+" elementos no vetor");
        System.out.println(tempoFinal-tempoInicial);
        
        tempoInicial = System.currentTimeMillis();
        
        for(int i=0; i < limite; i++){
            lista.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou "+limite+" elementos na lista");
        System.out.println(tempoFinal-tempoInicial);
        
        //ler valores
        tempoInicial = System.currentTimeMillis();
        for(int i=0; i < vetor.size(); i++){
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de leitura do vetor");
        System.out.println(tempoFinal-tempoInicial);
        
        
        //ler valores da lista
        tempoInicial = System.currentTimeMillis();
        iteratorListaLigada<Integer> iterator= lista.getIterator();
        
        while(iterator.temProximo()) {
        	iterator.getProximo();
        }
        
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de leitura da lista");
        System.out.println(tempoFinal-tempoInicial);
    }
}
