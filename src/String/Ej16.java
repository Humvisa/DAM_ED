package String;

import java.util.Scanner;

//16.  Realiza un programa que compruebe si en una palabra se repite alguna vocal más de 2 veces.
// El programa pedirá que se teclee una palabra y comprobará las vocales que contiene
// cuando compruebe que una vocal aparece más de dos veces emitirá un mensaje en la pantalla y terminará.
// El programa debe terminar en el mismo instante en que encuentre más de dos vocales iguales, no esperará a comprobar toda la palabra (prohibido usar break).
//Ejemplo: Escriba una palabra: “Instintivo”
//Dará como resultado: “Tiene mas de dos vocales iguales”
public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        String palabra = sc.nextLine();
        boolean noHayMasDe2 = true;
        int contador = 0;
        while ((a < 3 && e < 3 && i < 3 && o < 3 && u < 3) && noHayMasDe2) {
            if (palabra.charAt(contador) == 'a') {
                a++;
            }
            if (palabra.charAt(contador) == 'e') {
                e++;
            }
            if (palabra.charAt(contador) == 'i') {
                i++;
            }
            if (palabra.charAt(contador) == 'o') {
                o++;
            }
            if (palabra.charAt(contador) == 'u') {
                u++;
            }
            if (contador == palabra.length()-1) {
                noHayMasDe2 = false;
            }
            contador++;
        }
        sc.close();
        if (a > 2 || e > 2 || i > 2 || o > 2 || u > 2) {
            System.out.println("la palabra "+ palabra + " SI tiene mas de 2 vocales repetidas");
        }else {
            System.out.println("la palabra " + palabra + " NO tiene mas de 2 vocales repetidas");
        }
    }
}
