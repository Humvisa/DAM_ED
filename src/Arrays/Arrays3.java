package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numerosEnteros = new int [4];
        boolean ordenado = true;
        Random random = new Random();
        for (int i = 0; i < 4; i++){
            numerosEnteros [i] = random.nextInt(4);
        }
        System.out.println(Arrays.toString(numerosEnteros));
        for (int i = 0; i < 3; i++){
            if (numerosEnteros[i] < numerosEnteros[i+1]){
                ordenado = true;
            }else {
                ordenado = false;
            }
        }
        System.out.println(ordenado);
    }
}