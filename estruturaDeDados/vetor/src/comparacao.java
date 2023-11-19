import java.util.ArrayList;

public class comparacao {
  
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<Integer>();
        ArrayList<Integer> vetor = new ArrayList<Integer>();

        //adicionar elementos
        int limite = 10;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;
        for(int i=0; i < limite; i++){
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou "+limite+" elementos no vetor");
        System.out.println(tempoFinal-tempoInicial);
    }
}
