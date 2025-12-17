package repasoExamen;

import java.util.Arrays;

//Vamos a operar con Fibonacci:
//Crea una clase Java llamada Fibonacci, que contenga una función que devuelva en un String los N primeros números de la serie de Fibonacci. Por ejemplo:
//Se pasa 3: devolverá "1 1 2".
//Se pasa 5: devolverá "1 1 2 3 5"
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(calculoFibonacci(10));
        pintarTriangulo(6);
    }

    public static String calculoFibonacci(int n) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        int[] resultados = new int[n];
        for (int i = 0; i < n; i++) {
            num3 = num1 + num2;
            resultados[i] = num3;
            num1 = num2;
            num2 = num3;
        }
        return Arrays.toString(resultados);
    }
    //Crea un método llamado pintar triángulo, que reciba un parámetro (int niveles) y,
    // utilizando el método anterior, pinte lo siguiente, por ejemplo con 6 niveles:
//1
//1 1
//1 1 2
//1 1 2 3
//1 1 2 3 5
//1 1 2 3 5 8
    public static String pintarTriangulo(int niveles) {
        calculoFibonacci(niveles);
            for (int j = 0; j <= niveles; j++) {
                System.out.println(calculoFibonacci(j));
            }
        return "";
    }
}
