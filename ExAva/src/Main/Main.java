package Main;
import Ret.Retangulo;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double n;
     Retangulo r1, r2;
     r1 = new Retangulo(1.0,1.0);
     r2 = new Retangulo(1.0,1.0);
     System.out.println("Insira uma altura para o R1:");
     n = sc.nextDouble();
     r1.setAltura(n);
     r1.setLargura(3.0);
     r2.setAltura(4.0);
     System.out.println("Insira uma largura para o R2:");
     n = sc.nextDouble();
     r2.setLargura(n);
     System.out.println();
     System.out.println("Retângulo 1 -----------------");
     r1.dados();
     System.out.println("Retângulo 2 -----------------");
     r2.dados();
     System.out.println("------------------------------");
     System.out.println("---FIM---");

    sc.close();




    }
}
