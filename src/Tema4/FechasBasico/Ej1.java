package Tema4.FechasBasico;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
//Escribe un programa que muestre la fecha actual en el formato "Hoy es día, dd de mes de yyyy" (ejemplo: "Hoy es miércoles, 02 de abril de 2025").
public class Ej1 {
    public static void main(String[] args) {
        ZonedDateTime avila = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        System.out.println("Hoy es " + avila.format(formato));
    }
}
