import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;

public class matriz {
    public static void main(String[] args) {
        List<List<Integer>> matriz = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            List<Integer> linha = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor para a posicao (" + (i+1) + "," + (j+1) + "): " ));
                
                linha.add(numero);
            }
            matriz.add(linha);
        }

        List<Integer> entre5e20 = new ArrayList<>();
        for (List<Integer> linha : matriz) {
            for (int numero : linha) {
                if (numero > 5 && numero <= 20) {
                    entre5e20.add(numero);
                }
            }
        }

        HashSet<Integer> semRepetidosSet = new HashSet<>(entre5e20);
        List<Integer> semRepetidos = new ArrayList<>(semRepetidosSet);

        JOptionPane.showMessageDialog(null,"Numeros maiores que 5 e menores ou iguais a 20: "+ semRepetidos);
        
    }
}
