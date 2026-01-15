package Tema3.Ej2;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el nombre");
        String nombre = sc.nextLine();
        System.out.println("dime la edad");
        int edad = sc.nextInt();
        System.out.println("dime el sexo");
        char sexo = sc.next().charAt(0);
        System.out.println("dime el peso en kg");
        double peso = sc.nextDouble();
        System.out.println("dime el altura en M con ,");
        double altura = sc.nextDouble();
        Persona persona1 = new Persona(nombre, edad, sexo,peso,altura);

        System.out.println("dime el nombre");
        String nombre1 = sc.next();
        System.out.println("dime la edad");
        int edad1 = sc.nextInt();
        System.out.println("dime el sexo");
        char sexo1 = sc.next().charAt(0);
        Persona persona2 = new Persona(nombre1, edad1, sexo1);

        System.out.println("dime el nombre");
        String nombre2 = sc.nextLine();
        Persona persona3 = new Persona(nombre2);


        if (persona1.calcularIMC() == -1){
            System.out.println("esta por debajo de su peso ideal");
        } else if (persona1.calcularIMC() == 0) {
            System.out.println("esta en su peso ideal");
        }else {
            System.out.println("tiene sobrepeso");
        }
        persona2.calcularIMC();

        persona3.calcularIMC();


        persona1.esMayorDeEdad();
        persona2.esMayorDeEdad();
        persona3.esMayorDeEdad();

        persona1.toString();
        sc.close();
    }
}
