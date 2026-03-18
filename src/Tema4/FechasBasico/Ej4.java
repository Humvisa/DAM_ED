package Tema4.FechasBasico;

import java.time.DayOfWeek;
import java.time.LocalDate;

//Crea un método que reciba una fecha (LocalDate) y devuelva si es sábado o domingo.
public class Ej4 {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2026,02,01);
        System.out.println(finde(fecha));
    }
    public static String finde(LocalDate fecha){
        if (fecha.getDayOfWeek() == DayOfWeek.SATURDAY){
            return "Es Sabado";
        }else if (fecha.getDayOfWeek() == DayOfWeek.SUNDAY){
            return "Es Domingo";
        }else {
            return "No es fin de semana";
        }
    }
}
