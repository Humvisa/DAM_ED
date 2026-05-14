package Tema4.repasoT4;

public class Autobus extends Vehiculo{
    int pasajeros;
    int capacidadMaxima;


    public Autobus(String matricula, int pasajeros) throws Exception {
        super(matricula);
        this.capacidadMaxima = 50;
        this.pasajeros = validarPasajeros(pasajeros);
    }

    @Override
    public void viajar(double distancia) throws Exception{
        double combustible = (distancia *0.08) + (pasajeros * 0.005);
        if (combustible <= combustibleRestante){
            combustibleRestante -= combustible;
            kilometrosRecorridos += distancia;
            System.out.println("viajando autobus, combustible " + combustible);
        } else {
            throw new Exception("llena el tanque");
        }
    }
    private int validarPasajeros(int p) throws Exception{
        if (p > capacidadMaxima){
            throw new Exception("pasajeros se exceden");
        }
        System.out.println("pasajeros valido");
        return p;
    }
}
