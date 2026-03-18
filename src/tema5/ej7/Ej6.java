package tema5.ej7;
import java.util.HashMap;

//Ejercicio 6: HashMap - Inventario de productos
//
//Crea un programa que use un HashMap para gestionar un inventario de productos.
//Añade 4 productos con su cantidad (por ejemplo, "Manzanas" → 10).
//Muestra todos los productos y sus cantidades.
//Aumenta la cantidad de un producto en 5 y muestra el inventario actualizado.
public class Ej6 {
    static HashMap<String, Integer> productos = new HashMap<>();
    public static void main(String[] args) {
        productos.put("Manzanas", 10);
        productos.put("Alumnos", 23); //para algun ""Docente"" somos mas un producto que un alma en aprendizaje
        productos.put("PremiosGanados", 50);
        productos.put("Humanidad", 0);

        System.out.println(productos);
        productos.put("Manzanas", productos.get("Manzanas")+5);
        System.out.println(productos);
    }
}
