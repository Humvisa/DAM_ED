package String;
// Escribe un programa que lea un número en coma flotante de doble precisión,
// lo convierta a una cadena y le añada las comas separadoras de los miles.
//
//Introduciendo: 2388432.34
//
//Da como salida: 2,388,432.34
public class Ej5 {
    public static void main(String[] args) {
    double num = 2388432.34;
    StringBuilder numero = new StringBuilder();
    numero = numero.append(num);
    System.out.println(numero);
    }
}
