package Tema4.herencia.ej4;

public class Triangulo extends Figura {
    int base;
    int altura;
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public int areaTriangulo(){
        return (this.base*this.altura)/2;
    }
}
