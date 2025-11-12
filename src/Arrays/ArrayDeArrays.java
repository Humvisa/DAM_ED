package Arrays;

import java.util.Arrays;

public class ArrayDeArrays {
    public static void main(String[] args) {
        int[] fila1 = {1, 2, 3};
        int[] fila2 = {4, 5, 6};
        int[][] tabla = {fila1, fila2};
        System.out.println(Arrays.toString(tabla[0]));
        System.out.println(Arrays.toString(tabla[1]));
    }
}
