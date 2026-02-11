package Tema4.herencia.ej4;

public class Cuadrado extends Figura{
    int base;
    int altura;
    public Cuadrado(int base, int altura){
        this.altura = altura;
        this.base = base;
    }
    public int areaCuadrado(){
        return this.base+this.altura;
    }
}
