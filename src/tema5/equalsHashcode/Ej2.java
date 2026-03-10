package tema5.equalsHashcode;

import java.util.HashSet;
import java.util.Scanner;

//Ejercicio 2: ¿Estás en la lista? (Uso de contains)
//Practicar la búsqueda rápida de elementos, una de las mayores ventajas de los conjuntos.
//Tarea: Crea un HashSet<Integer> con una lista de 5 números de identificación (IDs) fijos.
//Acción: Pide al usuario por teclado un número usando Scanner.
//Salida: Indica mediante un boolean si ese ID tiene acceso (si está contenido en el Set) o no.
public class Ej2 {
    static HashSet<Integer> ids = new HashSet<>(5);
    public static void main(String[] args){
        ids.add(1);ids.add(2);ids.add(3);ids.add(4);ids.add(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero ");
        Integer numero = sc.nextInt();
        boolean esta = ids.contains(numero);
        System.out.println(esta);
        sc.close();
    }
}
