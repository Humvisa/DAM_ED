package Tema3.PruebaExamen.Videojuego;

public class MainPersonaje {
    public static void main(String[] args) {
        Personaje personaje = new Personaje("yamcha", false);

        personaje.recibirDanio(5);
        personaje.recibirDanio(80);
        personaje.curar();
        personaje.recibirDanio(24);
    }
}
