package String;

import java.util.Locale;

//Crea un programa que pase un String a mayúsculas y diga cuántas letras han cambiado.
//
//Introduciendo: “Hola a Todos”
//
//Da como salida: “HOLA A TODOS” 8 cambios
public class Ej1 {
    public static void main(String[] args) {
        String frase = "Hola a Todos";
        String fRASE = frase.toUpperCase();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != fRASE.charAt(i)) {
                contador++;
            }
        }
        System.out.println("La frase original es: " +  frase);
        System.out.println("La frase cambiada es: " + fRASE + " hubo: " + contador + " cambios");
    }
}