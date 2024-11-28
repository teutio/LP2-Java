public class Bike extends Transporte{
    private double tempo;

    public Bike(double horas){
        super("Bike Compartilhada");
        tempo = horas;
    }
    public Bike(String tipo, double horas){
        super(tipo);
        tempo = horas;
    }

    @Override
    public double calcularTarifa() {
        return 1.5*tempo;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes()+"\nHoras de uso: "+tempo;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
}
