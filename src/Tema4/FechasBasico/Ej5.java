package Tema4.FechasBasico;


import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

//Escribe un programa que calcule cuántas horas y minutos dura una clase (o varias) que introduzca el usuario.
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime horas con este formato HH:MM-HH:MM");
        String horas = sc.nextLine();
        Duration duracion = Duration.ZERO;

        while (true) {
            if (horas.equalsIgnoreCase("fin")) {
                break;
            }
                String[] array = horas.split("-");
                LocalTime inicio = LocalTime.parse(array[0]);
                LocalTime fin = LocalTime.parse(array[1]);
                duracion = duracion.plus(Duration.between(inicio, fin));
                horas = sc.nextLine();
        }
        long h = duracion.toHours();
        long m = duracion.toMinutes()%60;
        System.out.println("Total horas: " + h + " minutos: " + m);
        sc.close();
    }
}