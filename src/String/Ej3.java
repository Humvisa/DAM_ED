package String;
// Implementa un programa que codifique una cadena cambiando cada letra por la siguiente en el código ASCII.
//
//Introduciendo: “Lunes”
//
//Da como salida: “Mvoft”
public class Ej3 {
    public static void main(String[] args) {
        String palabra = "Lunes";
        StringBuilder cambiado = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            int ascii = (int) palabra.charAt(i);
            cambiado.append((char) (ascii +1));
        }
        System.out.println(cambiado);
    }
}