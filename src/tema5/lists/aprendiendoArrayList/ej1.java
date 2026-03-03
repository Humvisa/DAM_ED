package tema5.lists.aprendiendoArrayList;

import java.util.ArrayList;
import java.util.List;

//Ejercicio 1: Operaciones Básicas con Alumnos
//Crea un programa que gestione una lista de nombres de alumnos (String) utilizando un ArrayList.
//Añade cinco nombres a la lista.
//Inserta un nombre nuevo en la tercera posición (índice 2).
//Muestra el tamaño actual de la lista utilizando el atributo o método correspondiente.
//Elimina al alumno que esté en la última posición.
public class ej1 {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();

        array.add("MeduGitano");
        array.add("OmarVeneko");
        array.add("AngelDemonio");
        array.add("EstebanQuito");
        array.add("DonalTron");
        array.add(2,"LilSupa");
        System.out.println(array.size());
        array.remove(array.size()-1);
        System.out.println(array.size());
    }
}
