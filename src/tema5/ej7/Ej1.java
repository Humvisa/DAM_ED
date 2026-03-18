package tema5.ej7;

import java.util.ArrayList;

//Ejercicio 1: ArrayList - Lista de tareas
//
//Crea un programa que use un ArrayList para gestionar una lista de tareas pendientes.
//Añade 4 tareas (como Strings).
//Muestra todas las tareas.
//Elimina la segunda tarea y muestra la lista actualizada.
public class Ej1 {
    static ArrayList<String> tareas = new ArrayList<>();

    public static void main(String[] args) {
        tareas.add("leer");
        tareas.add("soltar");
        tareas.add("reflexionar");
        tareas.add("aprender");
        System.out.println(tareas);
        tareas.remove(1);
        System.out.println(tareas);
    }
}
