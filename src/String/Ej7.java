package String;
//Implementa un programa que sume todas las cifras de los números que aparecen en una cadena de caracteres.
//
//Introduciendo: “15 de Noviembre de 2012”
//
//Da como salida: 11
public class Ej7 {
    public static void main(String[] args) {
        String cadena = "20 de enero del 2015";
        System.out.println(suma(cadena));
    }

    public static int suma(String cadena) {
        int numero = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letra =cadena.charAt(i);
            if (Character.isDigit(letra)) {
            numero += Character.getNumericValue(letra);}
        }
        return numero;
    }
}