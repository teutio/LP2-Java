/* 3. Crie um novo projeto que defina uma classe para representar um
triângulo. Três atributos precisam ser definidos: l1, l2 e l3. Cada atributo
representa um dos lados do triângulo, do tipo inteiro. A classe deve
implementar construtores (padrão e completo), os métodos de acesso aos
atributos (getters e setters), além de definir um métod o para informar o
tipo do triângulo (equilátero, isósceles ou escaleno) e outro para exibir os
dados do triângulo. Em seguida, crie uma classe contendo o méto do main
e instancie dois triângulos. Exiba os dados de cada triângulo, bem como o
seu tipo.
OBS.: Equilátero = três lados iguais, Isósceles = 2 lados iguais e escaleno =
todos os lados diferentes.

*/

package main;
import obj.Triangulo;

public class Main {
    public static void main(String[] args) {
        Triangulo tri1 = new Triangulo(1,2,3);
        Triangulo tri2 = new Triangulo(3,3,2);
        tri1.dados();
        tri2.dados();


    }
}