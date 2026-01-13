package Tema3;

public class Alumno {
    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public static void aprobar(double nota) {
    if (nota < 5){
        nota = 5.0;
        }
    }

    public static void imprimir(String nombre,  double nota) {
        System.out.println(nombre);
        System.out.println(nota);
    }
}
