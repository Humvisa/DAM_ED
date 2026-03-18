package tema5.ej7;

import java.util.HashMap;

//Ejercicio 3: HashMap - Contactos telefónicos
//
//Crea un programa que use un HashMap para guardar nombres y números de teléfono.
//Añade 3 contactos (nombre como clave, teléfono como valor).
//Muestra todos los contactos.
//Busca el teléfono de un contacto específico (por ejemplo, "Carlos").
public class Ej3 {
    static HashMap<String, Number> contactos = new HashMap<>();

    public static void main(String[] args) {
        contactos.put("Mi contacto de emergencia", +34024);
        contactos.put("Paula", 693257203L);
        contactos.put("Carlos", 777777777L);
        System.out.println(contactos);
        System.out.println(contactos.get("Carlos"));
    }
}
