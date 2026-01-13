package Tema3.Biblioteca;

public class Libro {
    private String titulo;
    private Autor escritor;
    private boolean prestado = false;

    public Libro(String titulo, Autor escritor) {
        this.titulo = titulo;
        this.escritor = escritor;
    }
    public void prestar() {
        if ( prestado == false) {
            prestado = true;
            System.out.println("has prestado " + titulo);
        }else{
            System.out.println("Error: el titulo " +  titulo +  " no esta disponible");
        }
    }
    public void devolver() {
        prestado = false;
    }
    public void informacion(){
        System.out.println(titulo + " " + escritor.MostrarAutor());
    }
}