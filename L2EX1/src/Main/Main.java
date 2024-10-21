/*1. Crie um novo projeto que defina uma classe para representar um
círculo. Dois atributos precisam ser definidos: raio, que é do tipo double e
possui como valor default 1 e cor, que armazenada um valor do tipo String
e tem como valor default “vermelho”. A classe deve implementar os
métodos de acesso aos atributos (getters e setters), além de definir um
mét odo para calcular a área do círculo e outro para exibir os
dados do círculo. Em seguida, crie uma classe contendo o méto do main e
instancie dois círculos. Altere a cor e o raio dos círculos, calcule a área e
exiba seus dados.
*/

package Main;

import Obj.Circ;

public class Main {
    public static void main(String[] args) {
        Circ c1 = new Circ();
        Circ c2 = new Circ(2,"amarelo");
        c1.setR(4);
        c2.setC("verde");
        System.out.println("-> C1");
        c1.dados();
        c1.area();
        System.out.println("-> C2");
        c2.dados();
        c2.area();
    }
}