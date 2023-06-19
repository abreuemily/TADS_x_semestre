package ap;

import javax.swing.JOptionPane;

public class chEsp extends coBa{
	private float limite;

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public void sacar(float s) {
		
		if ((getSaldo()+limite) - s >= limite+getSaldo()) {
			setSaldo(getSaldo() - s);
		}
		else {
			JOptionPane.showMessageDialog(null, "Limite insuficiente");
		}
		
	}

}
