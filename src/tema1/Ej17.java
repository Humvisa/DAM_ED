package tema1;//17.  Desarrolla un programa que averigüe cuantas asignaturas tiene aprobadas un alumno.
// El programa debe leer un String con el nombre de las asignaturas y después otro String con la lista de sus notas.
// Debe dar como resultado el nombre de las asignaturas aprobadas. Tanto la lista de asignaturas como la lista de notas utilizan el símbolo “:” como separador.
//Ejemplo de funcionamiento del programa:
//Escribe la lista de asignaturas: “Matemáticas:Literatura:Historia:Inglés”
//Escribe la lista de notas: 7:4:10:3
//Las asignaturas aprobadas son: Matemáticas Historia
//Suponemos que las listas de asignaturas y de notas están bien formadas, es decir siempre habrá unos 8:9 entre una asignatura y otra o una nota y otra.
//  Además siempre existirá el mismo número de notas que de asignaturas. El número de asignaturas no es fijo, pueden ser 4, 5, 6 o más.

public class Ej17 {
    public static void main(String[] args) {
        String asignaturas = "matematicas:literatura:historia:ingles";
        String notas = "7:4:10:3";
        StringBuilder sb = new StringBuilder();
        String[] arrayAsignaturas = asignaturas.split(":");
        String[] arrayNotas = notas.split(":");
        int aprobadas = 0;
        for (int i = 0; i < arrayNotas.length; i++){
            if (Integer.parseInt(arrayNotas[i]) >= 5){
                sb.append(" ");
                sb.append(arrayAsignaturas[i]);
                sb.append(" ");
                sb.append(arrayNotas[i]);
                sb.append(" ");
                aprobadas++;
            }
        }
        System.out.println("aprobadas: " + aprobadas);
        System.out.println(sb);
    }
}
