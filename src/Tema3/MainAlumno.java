package Tema3;

import java.util.Scanner;

public class MainAlumno {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];
        Scanner sc = new Scanner(System.in);
        Alumno alumno1 = new Alumno("juan", 5);
        alumnos[0] = alumno1;
        Alumno alumno2 = new Alumno("maria", 7);
        alumnos[1] = alumno2;
        Alumno alumno3 = new Alumno("hitler", 0);
        alumnos[2] = alumno3;
        for (int i = 0; i < alumnos.length; i++) {
        }
    }
}
