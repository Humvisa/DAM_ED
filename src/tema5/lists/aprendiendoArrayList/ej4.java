package tema5.lists.aprendiendoArrayList;

import java.util.ArrayList;
import java.util.List;

//Ejercicio 4: Conversión Array a List
//Dado el siguiente array de notas: int[] notasArray = {4, 9, 7, 5, 10};
//Crea un ArrayList de objetos Integer.
//Vuelca todos los datos del array a la lista utilizando un bucle.
//Muestra la lista final formateada como un String.
public class ej4 {
    public static void main(String[] args) {
        int[] notasArray = {4, 9, 7, 5, 10};
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i< notasArray.length; i++){
            lista.add(notasArray[i]);
        }
        System.out.println(lista.toString());
    }
}
