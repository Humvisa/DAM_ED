package tema5.equalsHashcode;

import java.util.HashSet;

//Ejercicio 1: El Control de Acceso Único (HashSet)
//El objetivo es entender que un Set no permite duplicados.
//Tarea: Crea un HashSet<String> llamado invitados.
//Acción: Añade los nombres: "Ana", "Luis", "Ana", "Marta", "Luis".
//Salida: Muestra el tamaño de la lista (size()) y comprueba que solo hay 3 nombres en total.
public class Ej1 {
    static HashSet<String> invitados = new HashSet<>();

    public static void main(String[] args) {
        invitados.add("Ana");
        invitados.add("Luis");
        invitados.add("Ana");
        invitados.add("Marta");
        invitados.add("Luis");

        System.out.println(invitados.size());
    }
}
