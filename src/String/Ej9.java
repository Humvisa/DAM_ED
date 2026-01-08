package String;
// Escribe un programa que recibe dos cadenas de caracteres y comprueba cuantas veces aparece la primera en la segunda.
//
//Introduciendo:               “la”
//
//“La calle de la plaza”
//
//Da como salida: 2
public class Ej9 {
    public static void main(String[] args) {
        String palabra = "la";
        String frase = "La calle de la plaza";
        int contador = 0;
        for (int i = 0; i < frase.split(" ").length; i++) {
            if (frase.split(" ")[i].equalsIgnoreCase(palabra)) {
                ++contador;
            }
        }
        System.out.println(contador);
    }
}
