package Arrays;

import java.util.Arrays;

public class arrayej9 {
    public static void main(String[] args) {
        int[] array1 = {4,8,15,22,25,40};
        int[] array2 = {3,6,18,21,25,47};
        int[][] arrays = {array1, array2};
        int[] arrayMezclaOrdenada = new int[array1.length*2];

        int[] arrayMezcla = new int[array1.length*2];
        int contador = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                arrayMezcla[contador] = arrays[i][j];
                contador++;
            }
        }
        contador = 0;
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < arrayMezcla.length; j++) {
                if (i == arrayMezcla[j]){
                    arrayMezclaOrdenada[contador] = i;
                    contador++;
                }
            }
        }
        System.out.println("array 1 " + Arrays.toString(array1));
        System.out.println("array 2 " + Arrays.toString(array2));
        System.out.println("conjunto de arrays sin ordenar " + Arrays.toString(arrayMezcla));
        System.out.println("conjunto de arrays ordenados " + Arrays.toString(arrayMezclaOrdenada));
    }
}
