package Tema3.Ej4;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private double capacidadCarga;
    private boolean enMision;

    public NaveEspacial(String nombre, double capacidadCarga) {
        this.nombre = nombre;
        this.capacidadCarga = capacidadCarga;
        combustible = 100;
        enMision = false;
    }

    public NaveEspacial(String nombre) {
        this.nombre = nombre;
        capacidadCarga = 6;
    }
    public void viajar(int distancia){
        if (combustible - distancia*2 > 1) {
            combustible -= distancia * 2;
            enMision = true;
            System.out.println(nombre+" viajando una distancia de " + distancia + " queda " +combustible+ " de combustible");
        }else {
            System.out.println(nombre+" Combustible insuficiente para la mision");

        }
    }
    public void repostar(){
        enMision = false;
        combustible = 100;
        System.out.println(" ");
        System.out.println(nombre+" repostando.... ");
        System.out.println(nombre+ " con " + combustible + " combustible");
    }
    public void mostrarEstado(){
        if (enMision){
            System.out.println("La nave " + nombre + " esta en una mision..."  + " con el combustible al " + combustible+"%" + " y una capacidad de " +  capacidadCarga + " toneladas");
        }else {
            System.out.println("La nave " + nombre + " esta en la base..." + " con el combustible al " + combustible+"%" + " y una capacidad de " +  capacidadCarga + " toneladas");
        }
    }
    public int combustible(){
        return combustible;
    }
    public String nombre(){
        return nombre;
    }
}