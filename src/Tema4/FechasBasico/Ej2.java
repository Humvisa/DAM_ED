package Tema4.FechasBasico;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
//Crea un programa que pida al usuario su fecha de nacimiento (día y mes) y calcule cuántos días faltan para su próximo cumpleaños desde hoy (02/04/2025).
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("que dia naciste");
        int dia =  sc.nextInt();
        System.out.println("que mes naciste");
        int mes = sc.nextInt();
        LocalDate hoy = LocalDate.now();
        LocalDate cumple = LocalDate.of(hoy.getYear(), mes,dia);
        long diasRestantes = ChronoUnit.DAYS.between(hoy,cumple);//
        System.out.println("Faltan " +  diasRestantes + " dias para tu cumpleaños");
        sc.close();
    }
}