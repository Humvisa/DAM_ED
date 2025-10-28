package funcionesAvanzados;
//Implementa un método recursivo que determine si un número es primo.
public class ejercicio1 {
    public static void main(String[] args) {
        numeroPrimo(3);
    }

    public static void numeroPrimo(int num1) {
        for (int i = num1-1; i > 1; i--) {
            if (num1%i == 0) {
                i=0;
                System.out.println("no primo");
                } else if (i == 2) {
                System.out.println("primo");
                }
            }
        }
    }
    //sin ayudas pero me tarde como 5 horas probando cosas