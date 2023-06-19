package trabalhoclasseeheranca;

public class contaPoupanca extends ContaBancaria{
	
	
	private int diaRendimento;
	
	public int getDiaRendimento() {
		return diaRendimento;
	}
	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	public void calcularNovoSaldo(float a) {
		setSaldo(getSaldo() + (getSaldo() * (a/100)));
		
	}

}
