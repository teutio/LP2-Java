package obj;

public class Jogador {
    private String nome;
    private String pos;
    private String nac;
    private double alt;
    private double pes;

    public Jogador(){
        this.nome = "Pedro";
        this.pos = "Zagueiro";
        this.nac = "BRA";
        this.alt = 1.81;
        this.pes = 74;
    }


    public void dados(){
        System.out.println("Dados do Jogador ---------");
        System.out.println("Nome: "+this.nome + "    País: "+this.nac);
        System.out.println("Posição: "+this.pos);
        System.out.println("Altura: "+this.alt+"m    Peso: "+this.pes+"Kg");
        imc();
        System.out.println("---------------------------");
    }
    public void imc(){
        System.out.print("o IMC do Jogador é: ");
        System.out.println(this.pes/(this.alt*this.alt));
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getNac() {
        return nac;
    }

    public void setNac(String nac) {
        this.nac = nac;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }
}
