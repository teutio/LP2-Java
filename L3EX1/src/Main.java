/*1. Crie um vetor capaz de armazenar 50 números inteiros. Em seguida faça
o seu preenchimento automático com os números de 101 a 150, ou seja,
na posição número 0 ponha 101, na posição 1 ponha o número 102, e
assim sucessivamente. Em seguida, exiba os valores deste vetor.
*/


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num = 101;
        int[] numeros =  new int[50];
        Arrays.fill(numeros, 0,50,1);
        for(int i = 0; i <numeros.length; i++){
            numeros[i] = num;
            num++;
        }
        System.out.println(Arrays.toString(numeros);
    }
}
