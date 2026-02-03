package Tema4.herencia.ej6;

public class Carnes extends Plato {
    public Carnes(String nombre, double precio, Coccion grado) {
        super(nombre, precio);
        this.grado = grado;
    }

    public enum Coccion {
        PocoHecho, AlPunto, MuyHecho, Carbonizado
    }
    private Coccion grado;

    @Override
    public String toString() {
        return super.toString() + " | gradoCoccion " + this.grado;
    }
}
