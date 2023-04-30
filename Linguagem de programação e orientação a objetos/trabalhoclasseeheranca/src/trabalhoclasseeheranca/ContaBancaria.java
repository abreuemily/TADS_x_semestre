package trabalhoclasseeheranca;

public class ContaBancaria {
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
		if (a < saldo) {
			saldo = saldo - a;
		}
		else {
			saldo = 0;
		}
	}
	
	public void depositar(float a) {
		saldo = saldo + a;
	}

}
