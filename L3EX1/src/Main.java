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