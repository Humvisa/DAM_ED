package Tema4.herencia.ej6;

public class Primeros extends Plato{
    private boolean paraCompartir;

    public Primeros(String nombre, double precio,boolean paraCompartir){
        super(nombre, precio);
        this.paraCompartir = paraCompartir;
    }

    @Override
    public String toString() {
        return super.toString() + " | paraCompartir " + this.paraCompartir;
    }
}
