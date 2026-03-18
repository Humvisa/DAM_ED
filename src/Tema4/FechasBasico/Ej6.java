package Tema4.FechasBasico;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//Crea un programa que cuente cuántos días laborables (lunes a viernes) hay entre el 01/04/2025 y el 15/04/2025.
public class Ej6 {
    public static void main(String[] args) {
        long dias = 0;
        LocalDate f1 = LocalDate.of(2025, 04,01);
        LocalDate f2 = LocalDate.of(2025, 04,15);
        dias = ChronoUnit.DAYS.between(f1,f2.plusDays(1));
        int contador = 0;
        for (int i =0; i < dias; i++){
            if (!(f1.plusDays(i).getDayOfWeek().equals(DayOfWeek.SATURDAY)) && !(f1.plusDays(i).getDayOfWeek().equals(DayOfWeek.SUNDAY))){
                contador++;
            }
        }
        System.out.println("dias laborales: " + contador);
    }
}
