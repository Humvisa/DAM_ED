package String;
//12.  Realiza un programa que lea un String y elimine las palabras de menos de tres letras. Una vez eliminadas esas palabras, no deben existir espacios duplicados.
//
//Ejemplo: “El bar de la calle”
//
//Dará como resultado: “bar calle”
public class Ej12 {
    public static void main(String[] args) {
        String frase = "El bar de la calle";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < frase.split(" ").length; i++) {
            if (frase.split(" ")[i].length() > 2) {
                sb.append(frase.split(" ")[i]);
                sb.append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
