package ap;

public class coPo extends coBa {
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
