package Tema4.fechasAvanzado;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//Proyecto
//Eres el responsable de un proyecto en tu empresa y necesitas planificar las fechas clave.
// El proyecto empieza el próximo lunes (suponiendo que hoy es 28/02/2025) y tiene las siguientes fases:
//Fase 1: Análisis, dura 5 días laborables (lunes a viernes).
//Fase 2: Desarrollo, dura 15 días laborables.
//Fase 3: Pruebas, dura 7 días laborables.
//Se pide:
//Calcular y mostrar la fecha de inicio y fin de cada fase, considerando solo días laborables.
//Si el proyecto termina antes del 15/03/2026, imprime "¡Entrega a tiempo!". Si no, imprime "¡Hay que darse prisa!".
//Como bonus, calcula cuántos días naturales (incluyendo fines de semana) dura todo el proyecto desde el inicio hasta el fin.
public class Ej3 {

    public static void main(String[] args) {
        LocalDate hoy = LocalDate.of(2025,02,28);
        LocalDate limite = LocalDate.of(2026,03,15);
        LocalDate diaFin = inicializacion(hoy);
        if (diaFin.isBefore(limite)){
            System.out.println("entrega a tiempo!!");
        }else {
            System.out.println("hay que darse prisa!");
        }
        System.out.println("se necesitan " + (ChronoUnit.DAYS.between(diaInicio(hoy),diaFin) + 1) + " dias para realizar el proyecto");
    }
    static LocalDate inicializacion(LocalDate hoy){
        return fase3(fase2(fase1(diaInicio(hoy))));
    }
    static LocalDate diaInicio(LocalDate hoy){ //se iniciara el proximo lunes a partir de la fecha de hoy
        boolean esLunes = false;
        int contador = 0;
        LocalDate diaInicio = hoy;
        while (!esLunes){
            if (diaInicio.plusDays(contador).getDayOfWeek().equals(DayOfWeek.MONDAY)){
                diaInicio = diaInicio.plusDays(contador);
                esLunes = true;
            }else {
                contador++;
            }
        }
        System.out.println("el proyecto y la fase 1 inicia el dia " + diaInicio);
        return diaInicio;
    }
    static LocalDate fase1(LocalDate fechaInicio){
        LocalDate finFase1 = fechaInicio.plusDays(4);
        System.out.println("la fase 1 termina el dia " + finFase1);
        return finFase1;
    }
    static LocalDate fase2(LocalDate finFase1){
        LocalDate finFase2 = diaLaboral(finFase1);//empieza al siguiente dia laboral
        System.out.println("la fase 2 inicia el " + finFase2);
        int contador = 0;
        while (contador < 15){
            if (!finFase2.getDayOfWeek().equals(DayOfWeek.SATURDAY) && !finFase2.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
                contador++;
                finFase2 = finFase2.plusDays(1);
            } else {
                finFase2 = finFase2.plusDays(1);
            }
        }
        System.out.println("la fase 2 termina el " + finFase2);
        return finFase2;
    }
    static LocalDate fase3 (LocalDate finFase2){
        LocalDate finFase3 = diaLaboral(finFase2);
        System.out.println("la fase 3 inicia el " + finFase3);
        int contador = 0;
        while (contador < 7){
            if (finFase3.getDayOfWeek().equals(DayOfWeek.SATURDAY) || finFase3.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
                finFase3 = finFase3.plusDays(1);
            } else {
                contador++;
                finFase3 = finFase3.plusDays(1);
            }
        }
        System.out.println("la fase 3 termina el " + finFase3);
        return finFase3;
    }
    static LocalDate diaLaboral(LocalDate fecha){
        boolean esLaboral = false;
        while(!esLaboral) {
            if (fecha.getDayOfWeek().equals(DayOfWeek.SATURDAY) || fecha.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            fecha = fecha.plusDays(1);
            } else {
                esLaboral = true;
            }
        }
        return fecha;
    }
}
