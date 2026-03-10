package tema5.equalsHashcode;

import java.util.ArrayList;
import java.util.HashSet;

//Ejercicio 4: Limpieza de una Lista (Conversión)
//Aprender a "limpiar" duplicados de una lista de forma eficiente.
//Tarea: Crea un ArrayList<String> con los colores: "Rojo", "Azul", "Rojo", "Verde", "Azul".
//Acción: Pasa todos los elementos del ArrayList a un HashSet (puedes usar el constructor del Set o un bucle).
//Salida: Muestra la nueva colección sin colores repetidos.
public class Ej4 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");colores.add("Azul");colores.add("Rojo");colores.add("Verde");colores.add("Azul");
        HashSet<String> colores2 = new HashSet<>();
        for (String color : colores){
            colores2.add(color);
        }
        System.out.println(colores2);
    }
}