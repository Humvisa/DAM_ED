package String;

import java.util.Objects;
import java.util.Scanner;
//Desarrolla un programa que simule el juego del ahorcado. Elegimos una palabra y vamos pidiendo letras al usuario.
// Cada vez mostramos la palabra solo con las letras acertadas.
// Si no acierta todas las letras en 8 intentos, se da el juego por perdido.
public class Ej10 {
    public static void main(String[] args) {
        String palabra = "estrella";
        Scanner sc = new Scanner(System.in);
        if (ahorcado(palabra, sc)) {
            System.out.println("ganaste");
        }else  {
            System.out.println("perdiste");
        }
        sc.close();
    }

    public static boolean ahorcado(String palabra, Scanner sc) {
        StringBuilder codificado = new StringBuilder();
        int vidas = 8;
        for (int i = 0; i < palabra.length(); i++) {
            codificado.append("_");
        }
        System.out.println(codificado);
        while (vidas > 0) {
            boolean acierto = false;
            char letra = sc.next().charAt(0);
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    codificado.setCharAt(i, letra);
                    acierto = true;
                }
            }
            if (!acierto) {vidas--;}
            System.out.println("tienes " + vidas + " vidas");
            System.out.println(codificado);
            if (palabra.equals(codificado.toString())) {
                return true;
            }
        }
        return false;
    }
}
