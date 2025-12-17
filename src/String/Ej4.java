package String;
//Desarrolla un programa que rote una cadena tantas veces como se le indique.
//
//Introduciendo: “Lunes”
//
//Rotaciones: 2
//
//Da como salida: “nesLu”
public class Ej4 {
    public static void main(String[] args) {
        String palabra = "Lunes";
        int rotaciones= 2;
        StringBuilder rotado = new StringBuilder();
        rotado = rotado.append(palabra);
        rotado = rotado.delete(0, rotaciones);
        for (int i = 0; i < rotaciones; i++) {
            rotado = rotado.append(palabra.charAt(i));
        }
        System.out.println(rotado);
    }
}