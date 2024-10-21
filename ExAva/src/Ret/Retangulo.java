package Ret;

public class Retangulo {
    private double Altura;
    private double Largura;


    public Retangulo(double alt, double larg){
        this.Altura = alt;
        this.Largura = larg;

    }
    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        this.Altura = altura;
    }

    public double getLargura() {
        return Largura;
    }

    public void setLargura(double largura) {
        this.Largura = largura;
    }
    public void dados(){
        System.out.println("Altura: "+this.Altura+" Largura: "+this.Largura);
        System.out.println("Área: "+calcularArea());
        System.out.println("Perímetro: "+calcularPerimetro());


    }
    public double calcularArea(){
        return this.Largura * this.Altura;
    }
    public double calcularPerimetro(){
        return 2 * (this.Largura + this.Altura);
    }
}
