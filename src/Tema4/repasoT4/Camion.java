package Tema4.repasoT4;

public class Camion extends Vehiculo{
    int cargaActual;
    int capacidadMaxima;


    public Camion(String matricula, int cargaActual) throws Exception {
        super(matricula);
        this.capacidadMaxima = 5000;
        this.cargaActual = validarCarga(cargaActual);
    }
    public void viajar(double distancia) throws Exception{
        double combustible = (distancia * 0.1) + (cargaActual * 0.01);
        if (combustible <= capacidadMaxima){
            combustibleRestante -= combustible;
            kilometrosRecorridos += distancia;
            System.out.println("viajando camion, combustible " + combustible);
        }else {
            throw new Exception("Llena el deposito");
        }
    }
    private int validarCarga(int c) throws Exception{
        if (c > capacidadMaxima){
            throw new Exception("carga se excede");
        }
        System.out.println("carga valido");
        return c;
    }
}
