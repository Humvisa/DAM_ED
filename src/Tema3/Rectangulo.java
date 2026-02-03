package Tema3;

public class Rectangulo {
    private int alto;
    private int ancho;

    public Rectangulo() {
        alto = 5;
        ancho = 10;
    }
    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public Rectangulo(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
        if (ancho < 0 && alto < 0){
            alto = 5;
            ancho = 10;
        }
    }

    public static void area(int alto, int ancho) {

    }
}