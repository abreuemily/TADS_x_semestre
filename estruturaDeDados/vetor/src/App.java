import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int x = 3;
        //System.out.println(x);
        x = 4;
        //System.out.println(x);
       /** int [] vetor = new int[10];
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;
        vetor[4] = 5;
        vetor[5] = 6;
        vetor[6] = 7;
        vetor[7] = 8;
        vetor[8] = 9;
        vetor[9] = 10;
        //System.out.println(vetor[9]);
        for (int i=0 ; i<vetor.length ; i++){
            System.out.println(vetor[i]);
        } **/

        String[] es = new String[10];
        es[0] = "Pa";
        es[1] = "Am";
        es[2] = "To";
        es[3] = "Ac";
        es[4] = "Pa";
        es[5] = "Rr";
        es[6] = "Ap";
        es[7] = "Mt";
        es[8] = "Go";
        es[9] = "Mg";
        for (int i=0 ; i<es.length ; i++){
            System.out.println(es[i]);
        }
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sigla de estado voce quer procurar, animal?");
        String siglaBusca = leitor.nextLine();
        //System.out.println(siglaBusca);
        boolean encontrou = false;
        for (int i=0 ; i<es.length ; i++){
            String el = es[i];
            if(el.equalsIgnoreCase(siglaBusca)){
                encontrou = true;
                break;
            }

        }
        if (encontrou){
            System.out.println("Achou (anta)");
        }else{
            System.out.println("Nao achou (anta)");
        }
    }
}
