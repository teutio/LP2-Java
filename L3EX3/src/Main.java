import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um texto: ");
        String entrada = sc.nextLine();
        int palavras = 0;
        for(int i = 0; i < entrada.length()-2; i++){
            if(entrada.charAt(i)==' ')
                palavras++;
        }
        palavras++;
        System.out.println("A Quantidade de palavras é: "+palavras);

    }
}