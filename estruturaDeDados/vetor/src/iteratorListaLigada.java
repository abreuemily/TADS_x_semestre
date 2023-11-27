
public class iteratorListaLigada<TIPO> {
	private Elemento<TIPO> elemento;
	
	public iteratorListaLigada(Elemento<TIPO> atual) {
		this.elemento=atual;
	}
	public boolean temProximo() {
		if (elemento.getProximo()==null) {
			return false;
		}else {
			return true;
		}
	}
	public Elemento<TIPO> getProximo(){
		elemento=elemento.getProximo();
		return elemento.getProximo();
	}

}
