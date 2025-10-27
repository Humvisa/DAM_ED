public class ejercicio8 {
    public static void main(String[] args) {
        valorAbsoluto(-100);
    }

    public static void valorAbsoluto(int num1) {
        if (num1 < 0){
            num1 = num1 * -1;
        }
        System.out.println("el valor absoluto es "+num1);
    }
}
//falta el return