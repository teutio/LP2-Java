package obj;

public class Pais {
    private String sigla;
    private String nome;
    private int pop;
    private double dim;

    public Pais(){
        this.dim = 8510417.7;
        this.nome = "Brasil";
        this.sigla = "BRA";
        this.pop = 212600000;

    }

    public Pais(String sigla, String nome, double dim){
        this.dim = dim;
        this.nome = nome;
        this.sigla = sigla;
    }

    public void dados(){
        System.out.println("---------------Dados---------------");
        System.out.println("Sigla: "+sigla+"  Nome: "+nome);
        System.out.println("População: "+pop+"  Dimensão: "+dim);
        System.out.println("Densidade Pop.: "+densidade());
        System.out.println("----------------------------------");
    }

    public double densidade(){
        return this.pop/this.dim;

    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public double getDim() {
        return dim;
    }

    public void setDim(double dim) {
        this.dim = dim;
    }
}
