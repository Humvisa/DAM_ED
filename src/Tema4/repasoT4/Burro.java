package Tema4.repasoT4;

public class Burro implements Transportable{
    String nombre;
    int energiaRestante;
    double cargaActual;


    public Burro(String nombre, double cargaActual) {
        this.nombre = nombre;
        this.energiaRestante = 100;
        this.cargaActual = cargaActual;
    }

    @Override
    public void viajar(double distancia) throws Exception {
        double energia = distancia * 3;
        if (energia <= energiaRestante) {
            energiaRestante -= energia;
            System.out.println("viajando burro, energia " + energiaRestante);
        }else {
            throw new Exception("no hay energia mano");
        }
    }
    public void descansar(){
        this.energiaRestante = 100;
    }
}
