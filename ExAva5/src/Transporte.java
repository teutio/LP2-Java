public abstract class Transporte {
    private String tipo;
    private double tarifa;


    public Transporte(){
        this.tipo = "Padrão";
        this.tarifa = calcularTarifa();

    }
    public Transporte(String tipo){
        this.tipo = tipo;
        this.tarifa = calcularTarifa();

    }
    public double calcularTarifa(){
        return 5.0;
    }

    public String exibirDetalhes(){
        return "-----------------------\nTipo: "+tipo+"\nTarifa: "+calcularTarifa();

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
