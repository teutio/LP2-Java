package Obj;


public class Circ {
    private double r;
    private String c;

    public Circ(){
        this.r = 1;

        this.c = "vermelho";
    }
    public Circ(int r, String c){
        this.r = r;
        this.c = c;
    }

    public void area (){
        System.out.println("Área ----------------------");
        System.out.println(this.r*this.r*3.14*2);
        System.out.println("----------------------------");
    }

    public void dados() {
        System.out.println("Dados ----------------------");
        System.out.println("Raio: "+this.r +" Cor: "+this.c);
        System.out.println("----------------------------");
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
