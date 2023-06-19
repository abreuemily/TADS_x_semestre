package ap;

import javax.swing.JOptionPane;

public class coBaExe {

	public static void main(String[] args) {
		
	
		coPo c1;
		chEsp c2;
		c1 = new coPo();
		c2 = new chEsp();
		
		
		c1.setCliente(JOptionPane.showInputDialog(null, "Informe o nome:"));
		
		c1.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da conta (conta poupança):")));
		
		c1.setSaldo(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o saldo:")));
		
		c1.setDiaRendimento(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de dias que o dinheiro está rendendo:")));
		
		c1.sacar(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe quanto deseja sacar (seu saldo atual é de R$ " + c1.getSaldo() +"):")));
		
		c1.depositar(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe quanto deseja depositar:")));
		
		c1.calcularNovoSaldo(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a porcentagem do rendimento:")));
		
		JOptionPane.showMessageDialog(null, String.format("Nome: %s%nNúmero da conta: %d%nSaldo: R$ %.2f%n", c1.getCliente(), c1.getNumeroConta(), c1.getSaldo()));
		
		
		c2.setCliente(JOptionPane.showInputDialog(null, "Informe o nome:"));
		
		c2.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da conta (cheque especial):")));
		
		c2.setSaldo(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o saldo:")));
		
		c2.setLimite(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe qual o valor do limite:")));
		
		c2.sacar(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe quanto deseja sacar (seu saldo atual é de R$ " + (c2.getSaldo()+c2.getLimite()) +"):")));		
		
		c2.depositar(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe quanto deseja depositar:")));		
		
		JOptionPane.showMessageDialog(null, String.format("Nome: %s%nNúmero da conta: %d%nSaldo: R$ %.2f%n", c2.getCliente(), c2.getNumeroConta(), c2.getSaldo()));
	}
}
