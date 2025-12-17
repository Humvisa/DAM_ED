package Arrays;

import java.util.Arrays;

//Comprobar si un array de 5x5 es un cuadro mágico.
// Se considera un cuadro mágico aquel en el que las filas,
// las columnas y las diagonales suman igual.
public class arraysej8 {
    public static void main(String[] args) {
        int fila1[] = {15,8,1,24,17};
        int fila2[] = {16,14,7,5,23};
        int fila3[] = {22,20,13,6,4};
        int fila4[] = {3,21,19,12,10};
        int fila5[] = {9,2,25,18,11};

        int[][] filas = {fila1, fila2, fila3, fila4, fila5};

        int[] sumaFilas = {0,0,0,0,0};
        for (int i = 0; i < filas.length; i++) {
            for (int j = 0; j < filas[i].length; j++) {
                sumaFilas[i] += filas[i][j];
                }
            }
        System.out.println("la suma de las filas es " + Arrays.toString(sumaFilas));

        int[][] columnas = {fila1,fila2,fila3,fila4,fila5};

        int[] sumaColumnas = {0,0,0,0,0};
            for (int j = 0; j <  columnas.length; j++) {
                for ( int k = 0; k < columnas[0].length; k++) {
                    sumaColumnas[j] += columnas[k][j];
                }
            }
        System.out.println("la suma de columnas es " + Arrays.toString(sumaColumnas));

            int[][] diagonales = {fila1,fila2,fila3,fila4,fila5};

            int[] sumaDiagonales = {0,0};
                for ( int j = 0; j < fila1.length; j++) {
                        sumaDiagonales[0] += diagonales[j][j];
                }
                int contador = 4;
                for (int i = 0; i < fila1.length; i++) {
                        sumaDiagonales[1] += diagonales[i][contador--];
                }
        System.out.println("la suma de diagonales son " + Arrays.toString(sumaDiagonales));
    }
}