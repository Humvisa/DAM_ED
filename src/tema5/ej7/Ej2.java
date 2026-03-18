package tema5.ej7;

import java.util.HashSet;

//Ejercicio 2: HashSet - Colores únicos
//
//Crea un programa que use un HashSet para almacenar colores.
//Añade 5 colores (incluye uno repetido).
//Muestra todos los colores.
//Comprueba si "Verde" está en el conjunto.
public class Ej2 {
    static HashSet<String> colores = new HashSet<>();

    public static void main(String[] args) {
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("verde");
        colores.add("amarillo");
        System.out.println(colores);

        System.out.println("contiene verde?: " + verde());
    }
    public static boolean verde(){
        if (colores.contains("verde")){
            return true;
        }
        return false;
    }
}
