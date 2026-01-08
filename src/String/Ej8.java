package String;

import java.lang.reflect.Array;

//Igual al anterior pero sumando los números completos.
//
    //Introduciendo: “15 de Noviembre de 2012”
    //
    //Da como salida: 2027
public class Ej8 {
    public static void main(String[] args) {
        String frase = "15 de Noviembre de 2012";
        System.out.println(sumas(frase));
    }

    public static int sumas(String frase) {
        int suma = 0;
        char letra;
        for (int i = 0; i < frase.split(" ").length; i++) {
            letra = frase.split(" ")[i].charAt(0);
            if (Character.isDigit(letra)) {
                suma += Integer.parseInt(frase.split(" ")[i]);
            }
        }
        return suma;
    }
}