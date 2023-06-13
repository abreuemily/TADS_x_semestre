package polimorfismo;

public class Chefe extends Funcionario{
	private double bonus=1.15;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario()*bonus;  
	}
	

}
