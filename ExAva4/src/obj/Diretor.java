package obj;

public class Diretor {
    private String nome;
    private int anos;
    private String local;

public Diretor(String nome, int anos, String local){
    this.nome = nome;
    this.anos = anos;
    this.local = local;
}
public Diretor(){
    this.nome = "Fulano";
    this.anos = 0;
    this.local = "Algum Lugar";
}

@Override
    public String toString(){
        return "Diretor -----\nNome: "+nome+"\nAnos de Experiência: "+anos+
                "\nLocal de Origem: "+local;

}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
