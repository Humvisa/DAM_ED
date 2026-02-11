package Tema4.herencia.ej6;

public abstract class Plato {
    private String nombre;
    private double precio;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return this.nombre + " precio: " + this.precio +"€";
    }
}   