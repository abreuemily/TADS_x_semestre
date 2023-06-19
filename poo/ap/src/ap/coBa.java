package ap;

import javax.swing.JOptionPane;

public class coBa {
	private String cliente;
	private int numeroConta;
	private float saldo;
	
	
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	
	public void sacar(float a) {		
		
		if (a > saldo) {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
		}
		else {
			saldo = saldo - a;
		}
		
	}
	
	public void depositar(float a) {
		saldo = saldo + a;
	}
}
