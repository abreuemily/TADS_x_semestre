public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public ListaLigada(){ //esse método indica que quando o objeto ListaLigada for instanciado, na hora é atribuido a tamanho o valor 0.
        this.tamanho=0;
    }
    /**
     * @return Elemento return the primeiro
     */
    public Elemento getPrimeiro() {
        return primeiro;
    }

    /**
     * @param primeiro the primeiro to set
     */
    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    /**
     * @return Elemento return the ultimo
     */
    public Elemento getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    /**
     * @return int return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public void adicionar(String novoVal){
        Elemento novoElemento = new Elemento(novoVal);
        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
            
        }else{
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;

    }

    public void remover(String valorProcurado){
        Elemento anterior = null;
        Elemento atual = this.primeiro;
        for(int i=0; i<this.getTamanho(); i++){
            if (atual.getValor().equalsIgnoreCase(valorProcurado)){
                if (tamanho==1){
                    this.primeiro=null;
                    this.ultimo=null;
                
                }else if (atual == primeiro){
                    this.primeiro=atual.getProximo();
                }else if (atual == ultimo){
                    this.ultimo=anterior;
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
    public Elemento get(int posicao){
        Elemento atual = this.primeiro;
        for (int i=0; i < posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }

}
