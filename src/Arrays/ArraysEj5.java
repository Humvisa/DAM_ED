package Arrays;

import java.util.Arrays;
import java.util.Random;

//Dado un array de 50 números entre 1 y 100,
// aleatorios, escribir una lista ordenada con los valores
// que no aparecen en el array.
public class ArraysEj5 {
    public static void main(String[] args) {
        int[] array = new int[50];
        Random random = new Random();
        for (int i=0; i< array.length; i++){
            int numeroRandom = random.nextInt(100);
            array[i] = numeroRandom;
        }
        int[] excluidos = new int[50];
        for (int i = 0; i < excluidos.length; i++){
            if (array [i] != excluidos[0]);
        }
        System.out.println("Array Random " + Arrays.toString(array));
    }
}
// es con doble for