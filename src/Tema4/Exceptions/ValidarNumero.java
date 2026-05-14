package Tema4.Exceptions;
//Crea una clase llamada ValidadorNumero con un método validarPositivo que reciba un número entero.
// Si el número es negativo, lanza una excepción no comprobada (IllegalArgumentException) con un mensaje adecuado.
//Requisitos:
//Implementar el método validarPositivo que lance IllegalArgumentException si el número es negativo.
//En la clase Main, llama al método con diferentes valores para probar el manejo de la excepción.
public class ValidarNumero {
    public static void main(String[] args){
        try {
            validarPositivo(0);
            validarPositivo(120);
            validarPositivo(20);
            validarPositivo(-10);
        }catch(IllegalArgumentException e) {
            System.out.println( "error encontrado: " + e.getMessage());
        }
    }
        static int validarPositivo ( int n){
            if (n < 0) {
                throw new IllegalArgumentException("el numero " + n +" es negativo");
            }
            return n;
        }
    }