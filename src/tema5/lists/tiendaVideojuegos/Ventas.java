package tema5.lists.tiendaVideojuegos;

import java.time.LocalDate;

public class Ventas extends Tienda{
    Clientes cliente;
    Videojuegos juegos;
    LocalDate fechaVenta;

    public Ventas(Clientes cliente, Videojuegos juegos, LocalDate fechaVenta) {
        this.cliente = cliente;
        this.juegos = juegos;
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        return "Ventas{" +
                "cliente=" + cliente +
                ", juegos=" + juegos +
                ", fechaVenta=" + fechaVenta +
                '}';
    }
}
