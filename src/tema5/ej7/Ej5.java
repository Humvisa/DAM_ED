package tema5.ej7;

import java.util.HashSet;

//Ejercicio 5: HashSet - Palabras sin repetir
//
//Crea un programa que use un HashSet para almacenar palabras.
//Añade 6 palabras (incluye al menos dos repetidas).
//Muestra todas las palabras únicas.
//Cuenta cuántas palabras hay en el conjunto.
public class Ej5 {
    static HashSet<String> palabras = new HashSet<>();

    public static void main(String[] args) {
        palabras.add("aceptar");
        palabras.add("catarsis");
        palabras.add("rumiacion");
        palabras.add("soltar");
        palabras.add("aceptar");
        palabras.add("rumiacion");
        System.out.println(palabras);
        System.out.println("palabras: "+palabras.size());
    }
}
