package tema5.lists.lvl2.videoClub;

import java.time.LocalDate;

public class Prestamo extends VideoClub{
    Pelicula pelicula;
    Cliente cliente;
    LocalDate fecha;
    LocalDate fechaDev = fecha.plusDays(2);

    public Prestamo(Pelicula pelicula, Cliente cliente) {
        this.pelicula = pelicula;
        this.fecha = LocalDate.now();
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }
}
