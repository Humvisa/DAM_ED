package tema5.lists.aprendiendoArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Ejercicio 2: Búsqueda y Modificación
//Utilizando la lista del ejercicio anterior:
//Pide un nombre por teclado y comprueba si el alumno existe en la lista.
//Si existe, modifica su nombre para que aparezca todo en mayúsculas.
//Muestra la lista completa utilizando un bucle for-each.
public class ej2 {
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

        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        boolean existe = false;
        for (String nombre : array){
            if (nombre.equals(entrada)){
                existe = true;
            }
        }
        sc.close();
        System.out.println("existe " + entrada + " en la lista?: " + existe);
        if (existe){
            System.out.println(entrada.toUpperCase());
        }
        for (String nombre : array){
            System.out.println(nombre);
        }
    }
}
