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
        for (int i = 0; i < array.length; i++) {
            int numeroRandom = random.nextInt(100);
            array[i] = numeroRandom;
        }
        System.out.println("Array Random " + Arrays.toString(array));
        boolean esta = true;
        int contador = 0;
            for (int j = 0; j < 50; j++) {
                if (contador == array[j]) {
                    System.out.println(contador);
                    contador++;
                }
                else {

                }
        }
    }
}
// es con doble for