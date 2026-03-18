package tema5.ej6.ej2;

import java.util.HashMap;
import java.util.Map;

//Ejercicio 2: Gestión de Inventario (Existencia de Claves)
//Practicar el método containsKey para evitar sobrescribir datos sin querer.
//Tarea: Crea un Map<Integer, String> donde la clave sea el código del producto y el valor su nombre.
//Lógica: Al añadir un producto, comprueba si el código ya existe.
//Salida: Si el código existe, avisa al usuario; si no, añádelo al mapa.
public class ej2 {

    static Map<Integer, String> productos = new HashMap<>();
    public static void main(String[] args) {
        agregar(1, "dinero");
        agregar(2, "odio");
        agregar(3, "desesperanza");
        agregar(4, "destruccion");
        agregar(1, "Noches Blancas");
        System.out.println(productos);
    }
    public static boolean esta(Integer codigo){
        if (productos.containsKey(codigo)){
            System.out.println("el codigo "+codigo+" ya se encuentra registrado");
            return true;
        }
        return false;
    }
    public static void agregar(Integer codigo, String producto){
        if (!esta(codigo)){
            System.out.println("añadiendo "+ producto+ " al mapa");
            productos.put(codigo, producto);
        }
    }
}
