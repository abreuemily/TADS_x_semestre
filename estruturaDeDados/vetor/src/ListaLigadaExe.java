public class ListaLigadaExe {
    public static void main(String[] args) throws Exception {
        ListaLigada<String> l1 = new ListaLigada<String>();
        System.out.println(l1.getTamanho());
        l1.adicionar("Pa");
        l1.adicionar("To");
        l1.adicionar("Am");
        l1.adicionar("Ac");
        //System.out.println(l1.getTamanho());
        //System.out.println(l1.getPrimeiro().getValor());
        //System.out.println(l1.getUltimo().getValor());
        
        System.out.println(l1.get(1).getValor());
        System.out.println(l1.get(2).getValor());
        System.out.println(l1.get(3).getValor());
        System.out.println(l1.get(0).getValor());
    }
        
}
