package Objetos.Cuenta;

public class Gestion {
    public static void main(String[] args) {
    Cuenta c1 = new Cuenta(1);
    c1.imposicion(100);
        System.out.println(c1.toString());
    c1.reintegro(50);
        System.out.println(c1.toString());
    }
}