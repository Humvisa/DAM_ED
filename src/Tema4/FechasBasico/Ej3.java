package Tema4.FechasBasico;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
//Escribe un programa que muestre la hora actual en España ("Europe/Madrid"),
//Japón ("Asia/Tokyo") y México ("America/Mexico_City") en el formato "dd/MM/yyyy HH:mm z".
public class Ej3 {
    public static void main(String[] args) {
        ZonedDateTime españa = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        ZonedDateTime japon = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime mexico = ZonedDateTime.now(ZoneId.of("America/Mexico_City"));
        DateTimeFormatter formato =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm z");
        System.out.println("en españa es " + españa.format(formato));
        System.out.println("en Japon es " + japon.format(formato));
        System.out.println("en mexico es " + mexico.format(formato));
    }
}