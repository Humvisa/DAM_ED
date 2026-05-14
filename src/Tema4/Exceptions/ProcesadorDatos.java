package Tema4.Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Descripción: Crea una clase llamada ProcesadorDatos con un método procesarEntrada que realice las siguientes operaciones:
//Leer una línea de texto desde la consola.
//Convertir la línea leída a un número entero.
//Dividir 100 por el número ingresado.
//Implementa el manejo de excepciones para capturar posibles errores que puedan ocurrir durante estas operaciones, como:
//IOException: Si ocurre un error al leer la entrada de la consola.
//NumberFormatException: Si la entrada no se puede convertir a un número entero.
//ArithmeticException: Si se intenta dividir por cero.
//Requisitos:
//Utilizar un bloque try que englobe las operaciones mencionadas.
//Implementar múltiples bloques catch para manejar cada tipo de excepción de forma específica.
//Mostrar mensajes de error claros y descriptivos para cada excepción capturada.
//Añadir un bloque finally que imprima un mensaje indicando que el proceso ha finalizado, independientemente de si ocurrió una excepción o no.
public class ProcesadorDatos {
    public static void main(String[] args){
        procesarEntrada();
    }
    static void procesarEntrada() {
        try {
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            String entrada = sc.readLine();
            int entradaInt = 100/Integer.parseInt(entrada);
            sc.close();
            System.out.println(entradaInt);
        } catch (IOException ioException) {
            System.out.println("Ocurre un error al leer la entrada de la consola.");
        } catch (NumberFormatException numberFormatException) {
            System.out.println("La entrada no se puede convertir a un número entero.");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("No es posible dividir por cero.");
        } finally {
            System.out.println("el proceso ha finalizado");
        }
    }
}