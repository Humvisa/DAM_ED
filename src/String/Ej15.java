package String;

import java.util.Scanner;

//15.  Escribe un programa que pida al usuario que escriba varias palabras.
// El programa debe contar cuantas vocales tiene cada palabra y dará como resultado la palabra que más vocales tenga.
// Se deben ir pidiendo palabras al usuario hasta que este escriba la palabra “FIN”.
//Ejemplo:
//Escribe una palabra: JUEGO
//Escribe una palabra: INVIERNO
//Escribe una palabra: AJEDREZ
//Escribe una palabra: FIN
//La palabra con más vocales es: INVIERNO
//Y tiene 4 vocales
public class Ej15 {
    public static void main(String[] args) {
        StringBuilder palabras = new StringBuilder();
        boolean fin = false;
        Scanner sc = new Scanner(System.in);
        while (!fin) {
            String palabra = sc.nextLine();
            if (palabra.equalsIgnoreCase("fin")) {
                fin = true;
            }else  {
                palabras.append(palabra);
                palabras.append(" ");
            }
        }                                                                           //fin
        String[] array = palabras.toString().split(" ");
        int[] numVocales = new int[array.length];
        int contadorVocales = 0;
        int vocMax = 0;
        int posicion = 0;
        char letra = ' ';
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                letra = array[i].charAt(j);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    contadorVocales++;
                }
            }                                                                          //for cuenta vocales
            numVocales[i] = contadorVocales;                                         //for guarda numero vocales en otro array y pasa por cada palabra
            contadorVocales = 0;
            if (vocMax < numVocales[i]) {
                vocMax = numVocales[i];
                posicion = i;                                                    //esto con chatgpt, no sabia como guardar la posicion
            }
        }
        System.out.println("La palabra con mas vocales es " + array[posicion] + " con " + vocMax);
    }
}
