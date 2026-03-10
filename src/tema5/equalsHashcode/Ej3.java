package tema5.equalsHashcode;

import java.util.TreeSet;

//Ejercicio 3: Ordenación de Premios (TreeSet)
//Entender la diferencia entre un saco desordenado (HashSet) y uno que ordena automáticamente (TreeSet).
//Tarea: Crea un TreeSet<Integer> para guardar los números premiados de una rifa.
//Acción: Añade los números: 45, 12, 89, 3, 22.
//Salida: Recorre el conjunto con un bucle for-each y observa cómo Java los muestra ordenados de menor a mayor sin haber hecho nada extra.
public class Ej3 {
    public static void main(String[] args) {
        TreeSet<Integer> numRifa = new TreeSet<>();
        numRifa.add(45);numRifa.add(12);numRifa.add(89);numRifa.add(3);numRifa.add(22);
        for (int numero : numRifa){
            System.out.println(numero);
        }
    }
}