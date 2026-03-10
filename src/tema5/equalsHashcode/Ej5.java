package tema5.equalsHashcode;

import java.util.HashSet;
import java.util.Set;

//Ejercicio 5: Detector de Errores (Validación de add)
//El método add() devuelve un valor booleano que indica si el elemento se añadió con éxito o no.
//Tarea: Crea un Set<String> para matrículas de coches.
//Acción: Intenta añadir dos veces la misma matrícula.
//Lógica: Si el método add() devuelve false, muestra un mensaje por pantalla: "ERROR: La matrícula ya existe en el sistema"
public class Ej5 {
    public static void main(String[] args) {
        Set<Integer> matriculas = new HashSet<>();
        for (int i = 0; i < 2 ; i++){
            if (!(matriculas.add(123123))){
                System.out.println("Error: la matricula ya existe en el sistema");
            }
        }
        System.out.println(matriculas);
    }
}