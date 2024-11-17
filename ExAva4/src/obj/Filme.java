package obj;

public class Filme {
    private String titulo;
    private String descricao;
    private Diretor diretor;
    private int duracaoMin;

    public Filme(String titulo, String descricao, Diretor diretor, int duracaoMin) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.diretor = diretor;
        this.duracaoMin = duracaoMin;
    }

    public Filme(){
        this.titulo = "Lorem Ipsum";
        this.descricao = "Dolor Sit Amet";
        this.diretor = new Diretor();
        this.duracaoMin = 0;

    }

    public String exibirHoras(){
        int h = duracaoMin/60;
        int m = duracaoMin%60;
        return "O filme possui "+h+"h "+m+"m.\n";
    }

    @Override
    public String toString(){
        return "Filme ------------------------\nTítulo: "+titulo+"\nDescrição: "+descricao+
                "\nDuração: "+this.exibirHoras()+this.diretor+"\n------------------------------";
    }

    public String comparacao(String nm){
        if (this.titulo.equals(nm))
            return toString();
        else
            return "";
    }







    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
