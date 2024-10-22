package main;
import obj.Pais;
import java.util.Scanner;

/*Escreva uma classe que represente um país. Um país é representado
através dos atributos: sigla (ex.: BRA), nome, população e a sua dimensão
em Km2
. Escreva a classe em Java contendo:
a) Construtor padrão e outro que inicialize a sigla, o nome e a dimensão do país;
b) Métodos de acesso (getter/setter);
c) Um méto do que retorne a densidade populacional do país;
d) Um mét do que permita exibir os dados do país.
Em seguida, você deve criar a classe MainPaises que cria uma array de
países e permite que o usuário cadastre países enquanto desejar. Ao final,
o programa deve exibir a lista de países cadastrados.


*/

public class MainPaises {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        Pais[] paises = new Pais[10];
        int qtd = 0;
        String resp;
       do{
           System.out.println("Sigla: ");
           String sig = sc.nextLine();
           System.out.println("Nome: ");
           String nom = sc.nextLine();
           System.out.println("Tamanho: ");
           double dim = sc.nextDouble();
           System.out.println("Populacao: ");
           int pop = sc.nextInt();
           sc.nextLine();

           Pais p0 = new Pais(sig,nom,dim);
           p0.setPop(pop);
            paises[qtd] = p0;
            qtd++;

           System.out.println("Cadastrar outro país? S/N");
           resp = sc.nextLine();

       } while (resp.equalsIgnoreCase("S"));

       for(int i = 0; i <qtd; i++){
           paises[i].dados();
       }












sc.close();
    }
}