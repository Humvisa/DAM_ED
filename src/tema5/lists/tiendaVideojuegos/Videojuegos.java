package tema5.lists.tiendaVideojuegos;

import java.util.UUID;

public class Videojuegos extends Tienda{
    String titulo;
    String plataforma;
    String genero;
    double precio;
    int stock;
    UUID id = UUID.randomUUID();

    public Videojuegos(String titulo, String plataforma, String genero, double precio, int stock) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Videojuegos{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", genero='" + genero + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", id=" + id +
                '}';
    }
}
