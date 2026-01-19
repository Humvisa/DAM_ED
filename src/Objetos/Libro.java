package Objetos;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String editorial;
    private int isbn;

    public Libro(String titulo, String autor, int añoPublicacion, String editorial, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return titulo + " "+ autor + " "+ añoPublicacion +" "+ editorial + " "+ isbn;
    }
}