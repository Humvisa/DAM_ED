package Tema3.PruebaExamen.Videojuego;

public class MainPersonaje {
    public static void main(String[] args) {
        Personaje personaje = new Personaje("yamcha", true);

        personaje.recibirDanio(50);
        personaje.curar();


    }
}
