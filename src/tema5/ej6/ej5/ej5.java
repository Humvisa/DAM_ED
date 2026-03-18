package tema5.ej6.ej5;
import java.util.HashMap;
import java.util.Map;

//Ejercicio 5: Contador de Frecuencia (Lógica avanzada)
//Este ejercicio integra lógica de control de flujo con mapas.
//Tarea: Crea un programa que reciba un array de Strings: {"Java", "Python", "Java", "C++", "Java", "Python"}.
//Acción: Utiliza un Map<String, Integer> para contar cuántas veces aparece cada lenguaje.
//Pista: Si el lenguaje ya está en el mapa, suma 1 a su valor actual; si no, inícialo en 1.
public class ej5 {
    static String[] array ={"Java", "Python", "Java", "C++", "Java", "Python"};
    public static void main(String[] args) {
        Map<String, Integer> cuantos = new HashMap<>();
        for (String actual : array){
            if (!cuantos.containsKey(actual)){
                cuantos.put(actual, 1);
            }else {
                cuantos.put(actual, cuantos.get(actual)+1);
            }
        }
        System.out.println(cuantos);
    }
}
