public class Elemento<TIPO> {
    private Elemento<TIPO> proximo;
    private TIPO valor;
    
    public Elemento(TIPO novoVal){ //esse metodo indica que quando um novo node for adicionado na lista, la na classe nao exe vaai ser possivel passar o valor direto no construtor
        this.valor = novoVal;
    }
    /**
     * @return Elemento return the proximo
     */
    public Elemento getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(Elemento<TIPO> proximo) {
        this.proximo = proximo;
    }

    /**
     * @return String return the valor
     */
    public TIPO getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(TIPO valor) {
        this.valor = valor;
    }

}
