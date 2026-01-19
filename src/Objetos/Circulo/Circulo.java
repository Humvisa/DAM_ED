package Objetos.Circulo;

public class Circulo {
    private double radio;

    public static double area(double radio) {
    return (3.14159265359*radio*radio);
    }

    public static double perimetro(double radio) {
    return (2*3.14159265359*radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}