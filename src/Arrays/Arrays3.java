package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numerosEnteros = new int [3];
        Random random = new Random();
        for (int i = 0; i < 3; i++){
            numerosEnteros [i] = random.nextInt(3);
        }
        if (numerosEnteros[0] < numerosEnteros [1] && numerosEnteros [1] < numerosEnteros [2]){
            System.out.println("ordenados");
        }
        else {
            System.out.println("desordenados");
        }
        System.out.println(Arrays.toString(numerosEnteros));
    }
}
