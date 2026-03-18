package tema5.ej6.ej4;

import java.util.TreeMap;

//Ejercicio 4: Clasificación por Orden (TreeMap)
//Observar la diferencia de comportamiento entre HashMap y TreeMap.
//Tarea: Crea un TreeMap<String, String> para guardar extensiones de archivo y su descripción (ej: ".java" - "Archivo de código fuente Java").
//Acción: Inserta 4 extensiones en orden desordenado.
//Salida: Imprime el mapa completo y comprueba cómo Java las ha ordenado alfabéticamente por la extensión (la clave).
public class ej4 {
    static TreeMap <String, String> extensiones = new TreeMap<>();
    public static void main(String[] args) {
        extensiones.put(".java", "Archivo de codigo fuente Java");
        extensiones.put(".4mor", "Archivo de codigo abstracto, descontinuado por falta de programadores");
        extensiones.put(".od1o", "Archivo de codigo malicioso, su ejecucion daña el Software de manera irreversible");
        extensiones.put(".m0ney", "Archivo de codigo fuente necesario para el funcionamiento del Hardware, acorta la vida util del mismo");
        System.out.println(extensiones);
    }
}
