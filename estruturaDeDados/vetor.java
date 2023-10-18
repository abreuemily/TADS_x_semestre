
import javax.swing.JOptionPane;
public class vetor {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        

        for (int n = 0; n < 10; n++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, String.format((n + 1 + " numero: "))));
            
            vetor[n] = numero;
        }

        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }

        JOptionPane.showMessageDialog(null,"Soma dos valores informados: " + soma);
    }
}
