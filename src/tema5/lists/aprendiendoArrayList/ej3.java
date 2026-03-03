package tema5.lists.aprendiendoArrayList;

import java.util.ArrayList;
import java.util.List;

//Ejercicio 3: Listas y Tipos Primitivos (Wrapper)
//Crea una lista de números enteros (Integer).
//Rellena la lista con 10 números aleatorios entre 1 y 50.
//Calcula la suma de todos los números de la lista recorriéndola con un bucle for clásico.
//Muestra el número mayor encontrado en la lista.
public class ej3 {
    public static void main(String[] args) {
        List<Integer> ne = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            int num = (int) (Math.random()*50+1);
            ne.add(num);
        }
        int total = 0;
        int mayor = ne.get(0);
        for (int i = 0; i< ne.size(); i++){
            total+= ne.get(i);
            if (mayor <= ne.get(i)){
                mayor = ne.get(i);
            }
        }
        System.out.println("suma total: "+total);
        System.out.println(mayor);
    }
}
