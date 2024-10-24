package obj;

public class Cliente {
    private int cod;
    private String nom;
    private String cpf ;
    private String num;


    public Cliente() {

    }
    public Cliente(int cod, String nom, String cpf, String num) {
        this.cod = cod;
        this.nom = nom;
        this.cpf = cpf;
        this.num = num;

    }


    public void dados() {
        System.out.println("Dados do Cliente ----------");
        System.out.print("Código: "+cod);
        System.out.println("   Nome: "+nom);
        System.out.println("CPF: "+cpf);
        System.out.println("Número: "+num);
        System.out.println("------------------------");

    }

    public boolean busca(String s) {
        return s.equalsIgnoreCase(this.nom);
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
