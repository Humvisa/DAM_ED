package tema5.ej7;

import java.util.ArrayList;

//Ejercicio 4: ArrayList - Lista de números
//
//Crea un programa que use un ArrayList para gestionar una lista de números enteros.
//Añade 5 números (por ejemplo, 3, 7, 1, 9, 4).
//Muestra la lista y calcula la suma de todos los números.
//Encuentra y muestra el número mayor de la lista.
//Multiplica por dos el número más pequeño.
public class Ej4 {
    static ArrayList<Integer> numeros = new ArrayList<>();

    public static void main(String[] args) {
        numeros.add(3);
        numeros.add(7);
        numeros.add(1);
        numeros.add(9);
        numeros.add(4);
        System.out.println(numeros);
        System.out.println("suma: "+suma());
        System.out.println("Mayor: "+mayor());
        System.out.println("menor * 2: "+menorPorDos());
    }
    public static Integer suma(){
        Integer suma = 0;
        for (Integer actual : numeros){ suma+= actual;}
        return suma;
    }
    public static Integer mayor(){
        Integer mayor = 0;
        for (Integer actual : numeros){
            if (mayor < actual){
                mayor = actual;
            }
        }
        return mayor;
    }
    public static Integer menorPorDos(){
        Integer menor = mayor();
        for (Integer actual: numeros)
        if (menor > actual){
            menor = actual;
        }
        return menor*2;
    }
}
