package Tema4.fechasViaje;
//Estás de merecidas vacaciones, y tienes que coger un vuelo para ir a Japón. Los tiempos son los siguientes.
//Sales el día 12 de abril del 2025 a las 20:45 de Madrid, y tienes 6:45 de vuelo hasta Doha.
//Tienes 1h de tránsito en el aeropuerto (no tienes que coger las maletas porque has reservado con la misma compañía el vuelo completo a Japón).
//Despegas de Doha y tienes 10:25 hasta el aeropuerto de Haneda (Tokio).
//Se pide:
//Calcular las horas locales a las que despegas y aterrizas.
//Como eres una persona responsable, quieres avisar a tu familia cuando aterrizas, pero no quieres despertarlos, por eso si cuando aterrices es una hora respetable (9am a 22pm), puedes llamar, sino mandas un whatsapp. Calcula en los dos aterrizajes qué debes hacer.
//Calcula el tiempo total del viaje (incluida escala).

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

//Si llegas un sábado o domingo, avisa a tus amigos con un whatsapp.
public class Ej2 {
    public static void main(String[] args) {
        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZoneId doha = ZoneId.of("Asia/Qatar");
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        LocalDateTime salida = LocalDateTime.of(2025,04,12,20,45);

    }
}
