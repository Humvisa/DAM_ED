package Tema4.herencia.ej4;

public class Circulo extends Figura{
    int radio;
    public Circulo(int radio){
        this.radio = radio;

    }
    public double areaCirculo(){
        return (3.1416 * (radio *radio));
    }
}
