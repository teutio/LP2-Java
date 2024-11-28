public class Metro extends Transporte{
    private int numEstacoes;


    public Metro(int est){
        super("Metrô");
        numEstacoes = est;
    }
    public Metro(String tipo, int est){
        super(tipo);
        numEstacoes = est;
    }

    @Override
    public double calcularTarifa() {
        return 5.5; // valor fixo
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes()+"\nEstações Percorridas: "+numEstacoes;
    }

    public int getNumEstacoes() {
        return numEstacoes;
    }

    public void setNumEstacoes(int numEstacoes) {
        this.numEstacoes = numEstacoes;
    }
}
