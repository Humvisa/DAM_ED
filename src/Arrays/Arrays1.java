package Arrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] notasHumberto = new int[3];
        notasHumberto [0] = 6;
        notasHumberto [1] = 7;
        notasHumberto [2] = 5;
        System.out.println(Arrays.toString(notasHumberto));
        int[] notasHumbertoAuxiliares = notasHumberto;
        for (int i = 0; i < 3; i++){
            notasHumbertoAuxiliares [i] = notasHumberto [i];
        }
        System.out.println(Arrays.toString(notasHumberto));
        System.out.println("auxiliares" + Arrays.toString(notasHumbertoAuxiliares));
    }
}