package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int[] veinte = new int [20];
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20 ; i++){
            veinte [i] = random.nextInt(10);
        }
        int numeroPedido = sc.nextInt();
        int apariciones = 0;
        for (int i = 0; i < 20; i ++){
            if (numeroPedido == veinte [i]){
                apariciones++;
            }
        }
        System.out.println(Arrays.toString(veinte));
        System.out.println("estas son las coincidencias " + apariciones);
    }
}
