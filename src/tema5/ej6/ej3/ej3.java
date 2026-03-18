package tema5.ej6.ej3;

import java.util.HashMap;

//Ejercicio 3: Listado de Notas (Recorrido de Claves)
//Aprender a recorrer un mapa utilizando el conjunto de sus claves (keySet).
//Tarea: Crea un HashMap<String, Double> con los nombres de 4 alumnos y sus notas.
//Acción: Recorre el mapa utilizando un bucle for-each sobre notas.keySet().
//Salida: Imprime por cada vuelta: "El alumno [clave] tiene una nota de [valor]".
public class ej3 {
    static HashMap<String, Double> notas = new HashMap<>();
    public static void main(String[] args) {
        notas.put("Lil supa", 1.0);
        notas.put("Akapellah", 4.9);
        notas.put("Tyron Jose Gonzales Orama", 20.0);
        notas.put("Apache", 7.0);

        imprimirValores();
    }
    public static void imprimirValores(){
        System.out.println("imprimiendo notas finales...");
        for (String actual: notas.keySet()){
            System.out.println("el alumno "+actual+" tiene una nota de: "+notas.get(actual));
        }
    }
}
