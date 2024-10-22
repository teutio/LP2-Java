/*2.Faça um programa que, a partir de uma string digitada pelo usuário,
imprima:
a) O número de caracteres da string.
b) A string com todas suas letras em maiúsculo.
c) O número de vogais da string.
d) Se a string digitada começa com “A” (ignorando maiúsculas/minúsculas).
e) Se a string digitada termina com “O” (ignorando maiúsculas/minúsculas).
f) Se a string é um palíndromo ou não.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vogais = "AEIOUaeiou";
        int qtd = 0;
        boolean palindromo = true;

        System.out.println("Insira um texto: ");
        String entrada = sc.nextLine();
//tamanho
        System.out.println("No de Caracteres: "+entrada.length());
//uppercase
        System.out.println("Maiúsculo: "+entrada.toUpperCase());
//no vogais
        for(int i =0; i < entrada.length();i++){
            char c = entrada.charAt(i);
            if (vogais.indexOf(c) != -1) // procura c em vogais, retorna -1 se nao achar
                qtd++;
        }
        System.out.println("No de Vogais: "+ qtd);
//comeco
        if(entrada.charAt(1) == 'A' || entrada.charAt(1) == 'a')
            System.out.println("Começa com A/a");
        else
            System.out.println("Não começa com A/a");
//final
        if(entrada.charAt(entrada.length()-1) == 'O' || entrada.charAt(entrada.length()-1) == 'o')
            System.out.println("Termina com O/o");
        else
            System.out.println("Não termina com O/o");

//palindromo
for (int i = 0; i<entrada.length()/2; i++){
    if (entrada.charAt(i)!=entrada.charAt(entrada.length()-1-i)){
        palindromo = false;
        break;
    }
}
if(palindromo)
        System.out.println("A String é um Palindromo");






sc.close();

    }
}