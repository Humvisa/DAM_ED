package tema5.lists.electroAvila;

import java.util.Comparator;
import java.util.Objects;

public class Producto implements Comparable<Producto> {
    private String id;
    private String modelo;
    private double precioBase;
    private int stock;

    public Producto(String id, String modelo, double precioBase, int stock) {
        this.id = id;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    // Getters y Setters básicos
    public String getId() { return id; }
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precio) { this.precioBase = precio; }
    public int getStock() { return stock; }

    @Override
    public String toString() {
        return String.format("ID: %-10s | Modelo: %-15s | Precio: %8.2f€ | Stock: %d",
                id, modelo, precioBase, stock);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Producto p) {
        return this.stock - p.getStock();
    }


    // TODO: TAREA DEL ALUMNO
    // Implementar equals y hashCode basándose ÚNICAMENTE en el 'id'.
    // Recordad que sin esto, el Set no detectará duplicados.
}