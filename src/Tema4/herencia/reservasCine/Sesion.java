package Tema4.herencia.reservasCine;

public class Sesion {
    String hora;
    int entradasDisponibles;
    Peliculas pelicula;

    public Sesion(String hora, int entradasDisponibles,  Peliculas pelicula) {
        this.hora = hora;
        this.entradasDisponibles = entradasDisponibles;
        this.pelicula = pelicula;
    }

    public void reservarEntrada(int entradas) throws Exception{
        if (this.entradasDisponibles >= entradas){
            this.entradasDisponibles -= entradas;
            System.out.println("entradas restantes: " +  this.entradasDisponibles);
        }else {
            throw new Exception("no hay entradas");
        }
    }

    @Override
    public String toString() {
        return "Sesion{" +
                "hora='" + hora + '\'' +
                ", entradasDisponibles=" + entradasDisponibles +
                ", pelicula=" + pelicula +
                '}';
    }
}
