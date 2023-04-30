package trabalhoclasseeheranca;

public class ChequeEspecial extends ContaBancaria{
	

	
	private float limite;

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public void sacarEspecial(float a) {
		if (getSaldo() - a <= limite * (-1)) {
			setSaldo(getSaldo() - a);
		}
		else {
			setSaldo(limite * (-1));
		}
	}


}
