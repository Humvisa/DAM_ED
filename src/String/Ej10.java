package String;

import java.util.Objects;
import java.util.Scanner;
//Desarrolla un programa que simule el juego del ahorcado. Elegimos una palabra y vamos pidiendo letras al usuario.
// Cada vez mostramos la palabra solo con las letras acertadas.
// Si no acierta todas las letras en 8 intentos, se da el juego por perdido.
public class Ej10 {
    public static void main(String[] args) {
        String palabra = "estrella";
        StringBuilder aciertos = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            aciertos.append("_");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(aciertos);
        for (int contador = 8; contador > 0; contador--) {
            String letra = sc.nextLine();
            if (palabra.contains(letra)) {
                System.out.println(aciertos);
            }else{
                System.out.println("te quedan " + contador + " vidas");
            }
        }
        sc.close();
    }
}
