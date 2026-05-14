package Tema4.Exceptions.ej6;
public class DivisionSimple {
    static void main() {
        try {
            realizarDivision("0", "9");
        }catch (NumberFormatException e){
            System.out.println("no se puede convertir en numero uno de los textos");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static void realizarDivision(String aa, String bb){
    int a =Integer.parseInt(aa);
    int b =Integer.parseInt(bb);
        if (a == 0 || b == 0){
            throw new ArithmeticException("uno de los Strings es igual a 0, no se puede dividir");
        }
        double d= (double) a/b;
        System.out.println("el resultado de la division es "+d);
    }
}
