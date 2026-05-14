package Tema3.fechasAvanzado;
//Proyecto
//Eres el responsable de un proyecto en tu empresa y necesitas planificar las fechas clave.
// El proyecto empieza el próximo lunes (suponiendo que hoy es 28/02/2025) y tiene las siguientes fases:
//Fase 1: Análisis, dura 5 días laborables (lunes a viernes).
//Fase 2: Desarrollo, dura 15 días laborables.
//Fase 3: Pruebas, dura 7 días laborables.
//Se pide:
//Calcular y mostrar la fecha de inicio y fin de cada fase, considerando solo días laborables.
//Si el proyecto termina antes del 15/03/2026, imprime "¡Entrega a tiempo!". Si no, imprime "¡Hay que darse prisa!".
//        Como bonus, calcula cuántos días naturales (incluyendo fines de semana) dura todo el proyecto desde el inicio hasta el fin.

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

//Concierto
//Planeas viajar desde Madrid a Londres para ver a tu banda favorita en concierto. Hoy es 03/04/2026, y el concierto es el sábado 05/04/2026 a las 20:00 (hora de Londres).
//Sales de Madrid el sábado a las 11:30 (hora local), y el vuelo dura 2 horas y 15 minutos hasta Londres.
//Desde el aeropuerto de Londres, tardas 45 minutos en llegar al lugar del concierto.
//Se pide:
//Calcula y muestra la hora local de salida desde Madrid y la hora local de llegada a Londres.
//Determina a qué hora llegarás al lugar del concierto y si llegarás a tiempo para el inicio (20:00 en Londres).
//El concierto dura 2 horas y 30 minutos. Calcula la hora de fin y decide si podrás tomar un vuelo de vuelta a Madrid esa misma noche, que sale a las 23:45 (hora de Londres), considerando que necesitas 1 hora para volver al aeropuerto desde el concierto.zzzzz
public class Proyecto {

    public static void main(String[] args) {
            int fase1 = 5;
            int fase2 = 15;
            int fase3 = 7;
            LocalDate hoy = LocalDate.now();
            fechas(hoy);
    }

    public static void fechas(LocalDate hoy){
    LocalDate fechaInicio = hoy.plusDays(1);
    if (hoy.equals(DayOfWeek.FRIDAY)){
        fechaInicio.plusDays(2);
    } else if (hoy.equals(DayOfWeek.SATURDAY) ) {
        fechaInicio.plusDays(1);
    }
        System.out.println("la fecha de inicio es " + fechaInicio);
    }
    public boolean daTiempo(){


        return true;
    }
}
