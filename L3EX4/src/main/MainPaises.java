package main;
import obj.Pais;
/*Escreva uma classe que represente um país. Um país é representado
através dos atributos: sigla (ex.: BRA), nome, população e a sua dimensão
em Km2
. Escreva a classe em Java contendo:
a) Construtor padrão e outro que inicialize a sigla, o nome e a dimensão do país;
b) Métodos de acesso (getter/setter);
c) Um méto do que retorne a densidade populacional do país;
d) Um mét do que permita exibir os dados do país.

*/

public class MainPaises {
    public static void main(String[] args) {
        Pais p1 = new Pais();
        Pais p2 = new Pais("USA", "Estados Unidos", 9500000);
        p2.setPop(300000000);
        p1.dados();
        p2.dados();













    }
}