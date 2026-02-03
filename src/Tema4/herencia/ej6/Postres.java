package Tema4.herencia.ej6;

public class Postres extends Plato{
    private boolean conAzucar;

    public Postres(String nombre, double precio, boolean conAzucar){
        super(nombre, precio);
        this.conAzucar = conAzucar;
    }

    public boolean isConAzucar() {
        return conAzucar;
    }

    @Override
    public String toString() {
        return super.toString() + (conAzucar ? " Con azucar" : " Sin azucar");
    }
}
