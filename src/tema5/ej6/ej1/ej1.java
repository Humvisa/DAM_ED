package tema5.ej6.ej1;

import java.util.HashMap;
import java.util.Scanner;

//Ejercicio 1: El Diccionario de Traducción (Básico)
//El objetivo es comprender la relación Clave-Valor y el uso de put y get.
//Tarea: Crea un HashMap<String, String> llamado diccionario.
//Acción: Añade 5 parejas de palabras Inglés-Español (ej: "Apple" - "Manzana").
//Consulta: Pide una palabra en inglés por teclado y muestra su traducción. Si no existe, muestra un mensaje de error.
//Consulta2: Busca si existe una palabra en Español.
public class ej1 {
    static HashMap<String, String> diccionario = new HashMap<>();
    public static void main(String[] args) {

        diccionario.put("Apple", "Manzana");diccionario.put("Love", "Amor");diccionario.put("Soul", "Alma");diccionario.put("Life", "Vida");diccionario.put("Happiness", "Felicidad");
        System.out.println("La palabra esta en el diccionario?: " +consulta2("Amor"));
        try {
            System.out.println(consulta()
            );
        } catch (sinTraduccion e){
            System.out.println(e.getMessage());
        }
    }
    public static String consulta(){
        Scanner sc = new Scanner(System.in);
        String palabra = sc.next();
        sc.close();
        if (diccionario.get(palabra) == null){
            throw new sinTraduccion("No hay traduccion para la palabra: " + palabra + " en el diccionario");
        }
        return diccionario.get(palabra);
    }
    public static boolean consulta2(String palabra){
        return diccionario.containsValue(palabra);
    }
}
