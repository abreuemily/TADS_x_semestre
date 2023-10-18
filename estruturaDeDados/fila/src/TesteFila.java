
public class TesteFila {
    public static void main(String[] args){
        Fila fila1=new Fila();
		fila1.inserir(50);
		fila1.inserir(150);
		fila1.inserir(250);
		int num=fila1.remover();
		System.out.println("item removido: " +num);

    }
    
}
