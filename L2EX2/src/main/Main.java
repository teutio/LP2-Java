/*2. Crie uma classe para representar um jogador de futebol, com os
atributos nome, posição, nacionalidade, altura e peso. Crie os métodos de
acesso aos atributos (setters e getters) e também um méto do para imprimir
todos os dados do jogador. Além disso, defina um mét odo para calcular o
IMC do jogador. Em seguida, crie uma classe com o mét odo main utilizando
array de objetos para armazenar os dados de até 40 jogadores, de acordo
com o desejo do usuário. Ao final, o programa deve exibir todos os dados
dos jogadores, bem como o IMC de cada um deles. */

package main;
import java.util.Scanner;
import obj.Jogador;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos jogadores? ");
        int qtd = sc.nextInt();
        Jogador[] jogadores =  new Jogador[qtd];
        for(int i = 0; i <=qtd-1; i++){
            //scan e setter, se necessario
            jogadores[i] = new Jogador();
        }
        for(int i = 0; i <=qtd-1; i++){
            System.out.println("Jogador "+(i+1));
            jogadores[i].dados();
        }








    }
}