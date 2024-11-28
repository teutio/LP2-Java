public class Onibus extends Transporte{
    private boolean inter;

    public Onibus(boolean inter){
        super("Ônibus");
        this.inter = inter;

    }
    public Onibus(String tipo, boolean inter){
        super(tipo);
        this.inter = inter;

    }

    @Override
    public double calcularTarifa() {
        if(inter)
            return 1.5*super.calcularTarifa();
        else
            return super.calcularTarifa();
    }

    @Override
    public String exibirDetalhes() {
        if(inter)
            return super.exibirDetalhes()+"\nIntermunicipal: Sim";
        else
            return super.exibirDetalhes()+"\nIntermunicipal: Não";
    }

    public boolean isInter() {
        return inter;
    }

    public void setInter(boolean inter) {
        this.inter = inter;
    }
}
