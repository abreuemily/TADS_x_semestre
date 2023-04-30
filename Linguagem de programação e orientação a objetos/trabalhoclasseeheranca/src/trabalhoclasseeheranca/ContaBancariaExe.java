package trabalhoclasseeheranca;

import javax.swing.JOptionPane;

public class ContaBancariaExe {

	public static void main(String[] args) {
		contaPoupanca c1;
		c1 = new contaPoupanca();
		
		c1.setCliente(JOptionPane.showInputDialog(null, "Informe o nome:"));
		c1.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da conta:")));
		c1.setSaldo(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o saldo:")));
		
		c1.sacar(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe quanto deseja sacar (seu saldo atual é de R$ " + c1.getSaldo() +"):")));
		
		c1.depositar(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe quanto deseja depositar (seu saldo atual é de R$" + c1.getSaldo() +"):")));
		
		c1.calcularNovoSaldo(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a porcentagem do rendimento por mês:")));
		
		JOptionPane.showMessageDialog(null, String.format("Nome: %s%nNúmero da conta: %d%nSaldo: R$ %.2f%n", c1.getCliente(), c1.getNumeroConta(), c1.getSaldo()));
		
		
		
		

	}

}
