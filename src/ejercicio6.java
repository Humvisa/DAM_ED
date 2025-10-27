import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        mayor(80, 81, 79);
    }
    public static void mayor(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            System.out.println("el mayor es "+num1);
        }
        else if (num2 > num3){
            System.out.println("el mayor es "+num2);
        }
        else{
            System.out.println("el mayor es "+num3);
        }
    }
}
