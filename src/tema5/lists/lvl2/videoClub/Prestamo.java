package tema5.lists.lvl2.videoClub;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Prestamo {
    Pelicula pelicula;
    Cliente cliente;
    LocalDate fecha;
    int fechaDev = 2;

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

    public int getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(int fechaDev) {
        this.fechaDev = fechaDev;
    }
}
