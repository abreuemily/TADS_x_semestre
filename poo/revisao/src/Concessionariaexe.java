import javax.swing.JOptionPane;

public class Concessionariaexe {
    public static void main(String args[]) {
        CarroNacional cn1 = new CarroNacional();
        CarroImportado ci1 = new CarroImportado();

        cn1.setMarca(JOptionPane.showInputDialog(null, "Informe a marca do carro nacional:"));
        cn1.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do carro nacional:")));

        JOptionPane.showMessageDialog(null, String.format("Marca: %s%nPreço: R$ %.2f", cn1.getMarca(), cn1.calcularPreco()));

        ci1.setMarca(JOptionPane.showInputDialog(null, "Informe a marca do carro importado:"));
        ci1.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do carro importado:")));
        ci1.setTaxa(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a taxa de importação:")));

        JOptionPane.showMessageDialog(null, String.format("Marca: %s%nPreço: R$ %.2f", ci1.getMarca(), ci1.calcularPreco()));
    }
}