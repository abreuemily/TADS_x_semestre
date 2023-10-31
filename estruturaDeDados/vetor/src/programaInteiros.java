public class programaInteiros {
    public static void main(String[] args) {
        ListaLigada<Integer> n1 = new ListaLigada<Integer>();
        n1.adicionar(1);
        n1.adicionar(2);
        n1.adicionar(3);
        n1.adicionar(4);
        n1.adicionar(5);
        n1.adicionar(6);

        System.out.println("Tamanho: "+n1.getTamanho());
        for(int i=0; i<n1.getTamanho();i++){
            System.out.println(n1.get(i).getValor());
        }
    }
}
