package Tema3.Ej2;

import java.util.Scanner;

public class  MainPersona {
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
        System.out.println("dime la altura en M con ,"); //con . me da error
        double altura = sc.nextDouble();
        Persona persona1 = new Persona(nombre, edad, sexo,peso,altura);

        System.out.println("dime el 2do nombre");
        String nombre1 = sc.next();
        System.out.println("dime la edad");
        int edad1 = sc.nextInt();
        System.out.println("dime el sexo");
        char sexo1 = sc.next().charAt(0);
        Persona persona2 = new Persona(nombre1, edad1, sexo1);

        System.out.println("dime el 3er nombre");
        String nombre2 = sc.next();
        Persona persona3 = new Persona(nombre2);

        Persona[] personas = new Persona[3];
        personas[0] = persona1;
        personas[1] = persona2;
        personas[2] = persona3;

        for (int i = 0; i < personas.length; i++){
            if (personas[i].calcularIMC() == 2){ // para cuando no hay suficientes datos
                System.out.println("no se pudo calcular el imc de " + personas[i].getNombre());
            }
            if (personas[i].calcularIMC() == -1){
                System.out.println(personas[i].getNombre() + " esta por debajo de su peso");
            } else if (personas[i].calcularIMC() == 0) {
                System.out.println(personas[i].getNombre() + " esta en su peso ideal");
            }else if (personas[i].calcularIMC() == 1){
                System.out.println(personas[i].getNombre() + " esta en sobrepeso");
            }
            if (personas[i].esMayorDeEdad()){
                System.out.println(personas[i].getNombre() + " es mayor de edad");
            }else {
                System.out.println(personas[i].getNombre() + " es menor de edad");
            }
        }
        for (int i = 0; i < personas.length; i++){
            System.out.println(personas[i].toString());
        }
        sc.close();
//Haz una clase llamada Persona que siga las siguientes condiciones:
//Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de visibilidad es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
//Se implantarán varios constructores:
//Un constructor con el nombre.
//Un constructor con el nombre, edad y sexo.
//Un constructor con todos los atributos como parámetro, salvo el DNI.
//Los métodos que se implementarán son:
//calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en m)), si esta fórmula devuelve un valor menor que 20, el método devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), está en un peso normal, por tanto, devuelve un 0 y si devuelve un valor mayor que 25 significa que tiene sobrepeso, devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
//esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
//comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, será H. No sería visible al exterior. Devolverá el carácter correspondiente al sexo.
//toString(): devuelve toda la información del objeto.
//generaDNI(): genera un número aleatorio de 8 cifras y con ese número, calcula su letra correspondiente. Este método será invocado cuando se construya el objeto. No será visible al exterior.
//Para calcular el DNI se debe obtener el módulo 23 del número. Y una vez obtenido, se relaciona el resto con la letra correspondiente: 
//
//
//Métodos set y get de cada atributo.
//Ahora, crea una clase principal que haga lo siguiente:
//Pide por teclado el nombre, la edad, sexo, peso y altura.
//Crea 3 objetos de la clase anterior:
//El primer objeto utilizará todas las variables.
//El segundo objeto utilizará todas las variables menos el peso y la altura.
//El último utilizará el constructor que solo dispone del nombre.
//Para cada persona se deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
//También hay que indicar, para cada persona, si es mayor de edad.
//Por último, se debe mostrar la información de cada objeto.
//NOTA: Deberás utilizar los métodos que consideres oportunos para realizar todas las acciones indicadas.
    }
}
