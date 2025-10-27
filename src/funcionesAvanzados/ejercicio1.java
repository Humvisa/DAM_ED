package funcionesAvanzados;
//Implementa un método recursivo que determine si un número es primo.
public class ejercicio1 {
    public static void main(String[] args) {
        numeroPrimo(1003);
    }
    public static void numeroPrimo(int num1) {
        int i=num1-1;
        while (i > 1){
            if (num1%i!=0){
                i--;
            }
        }
        System.out.println("primo");
        }
    }

