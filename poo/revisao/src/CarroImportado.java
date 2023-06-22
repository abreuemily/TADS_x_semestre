public class CarroImportado extends Carro{
    private double taxa;
    

    /**
     * @return double return the taxa
     */
    public double getTaxa() {
        return taxa;
    }

    /**
     * @param taxa the taxa to set
     */
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double calcularPreco() {
        setPreco(getPreco() * (1+taxa/100));
        return getPreco();
    }

}
