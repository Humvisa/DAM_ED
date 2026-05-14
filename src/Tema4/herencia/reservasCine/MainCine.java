package Tema4.herencia.reservasCine;

public class MainCine {
    static void main() throws Exception {
        Peliculas p1 = new Peliculas("interestellar", "sci-fi", "169");
        Sesion sesion = new Sesion("18:05", 23, p1);


        try {
            sesion.reservarEntrada(23);
            sesion.reservarEntrada(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
