package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        String[] nombres = new String[3];
        int[] numeros = new int[3];
        nombres[0] = "juan";
        nombres[1] = "manuel";
        nombres[2] = "hitler";
        numeros[0] = 84523;
        numeros[1] = 235235;
        numeros[2] = 666;
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println("indice " + numero + " el nombre es " + nombres [numero] + " el numero es " + numeros [numero]);
    }
}
