package Tema4.excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int numero = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("has puesto una letra");
        }finally {
            sc.close();
        }
    }
}
