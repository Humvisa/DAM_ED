package Arrays;

import java.util.Arrays;
import java.util.Scanner;
// Matrices! Crea un programa que tenga varias funciones:
//Un main, donde se solicitará al usuario las dimensiones de la matriz.
//Generar una matriz aleatoria. Esta función recibirá un entero (la dimensión) y devolverá la matriz (int[][]).
//Generar la matriz traspuesta, en esta matriz se intercambian las dimensiones.
//Ejemplo:
//Matriz original:
//12 45 23
//67 89 10
//Matriz transpuesta:
//12 67
//45 89
//23 10
public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime las dimensiones de la matriz ");
        int dimensiones = sc.nextInt();
        sc.close();
        int[][] matriz = matriz(dimensiones);
        int[][] matrizT = new int[dimensiones][dimensiones];
        for (int i = 0; i < dimensiones; i++) {
            for (int j = 0; j < dimensiones; j++) {
                matrizT[j][i] = matriz[i][j];
                //i0 j1 = j1 i0
                //i0 j2 = j2 i0
                //i1 j0 = j0 i1
                //i1 j1 = j1 i1
                //i1 j2 = j2 i1
                //i2 j0 = j0 i2
                //i2 j1 = j1 i2
                //i2 j2 = j2 i2
            }
        }
        System.out.println("La matriz es: ");
        for (int i = 0; i < dimensiones; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        System.out.println("La matriz transpuesta es: ");
        for (int i = 0; i < matrizT.length; i++) {
            System.out.println(Arrays.toString(matrizT[i]));
        }
    }

    public static int[][] matriz(int dimensiones) { //solo use chatgpt para decirme lo de [][] en el int
        int contador = 0;
        int[][] matriz = new int[dimensiones][dimensiones];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = contador++;
            }
        }
        return matriz;
    }
}