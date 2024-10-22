package obj;

public class Triangulo {

    private int l1;
    private int l2;
    private int l3;

    public Triangulo(){
        this.l1 = 1;
        this.l2 = 1;
        this.l3 = 1;
    }
    public Triangulo(int l1, int l2, int l3){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    public void dados(){
        System.out.println("Dados do Triangulo -------");
        System.out.println("L1: "+this.l1+"  L2: "+this.l2+"  L3: "+this.l3);
        System.out.println("O Triângulo é "+tipo());
        System.out.println("---------------------------");
    }
    public String tipo(){
        if(l1 == l2 && l2 == l3)
            return "Equilátero";
        else if(l1 == l2 || l2 == l3 || l3 == l1)
            return "Isósceles";
        else
            return "Escaleno";

    }

    public int getL3() {
        return l3;
    }

    public void setL3(int l3) {
        this.l3 = l3;
    }

    public int getL2() {
        return l2;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }

    public int getL1() {
        return l1;
    }

    public void setL1(int l1) {
        this.l1 = l1;
    }
}
