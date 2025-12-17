package String;

import java.util.Arrays;

// Desarrolla un programa que reciba una cadena y diga cuántas palabras contiene. (Las palabras pueden estar separadas por espacios, puntos o comas).
//
//Introduciendo: “Hola a todos. Adios”
//
//Da como salida: 4
public class Ej2 {
    public static void main(String[] args) {
        String frase = "adios hola si adios";
        String[] array = frase.split(" ");
        System.out.println(frase);
        System.out.println("el numero de palabras en la frase es de: " + array.length);
    }
}