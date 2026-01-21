package Tema3.PruebaExamen.Gimnasio;

public class MainSocio {
    public static void main(String[] args) {
        Socio socio1 = new Socio();
        Socio socio2 = new Socio();
        Socio socio3 = new Socio();
        Socio socio4 = new Socio();
        Socio socio5 = new Socio();
        System.out.println("Hay " + Socio.inscritos()+" socios inscritos");
        System.out.println("el socio1 tiene un id " + socio1.getIdSocio());
        System.out.println("el socio3 tiene un id " + socio3.getIdSocio());
    }
}
