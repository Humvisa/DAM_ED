package Objetos.Punto;
//Defina una clase punto que tendrá dos atributos, de tipo real, x e y, que representarán las coordenadas del punto dentro del plano.
//Defina un método que tenga como argumento otro objeto de la clase punto y que calcule la distancia entre los dos puntos.
//
//Para probar esta funcionalidad, escriba un método main en el que se creen dos puntos,
// el primero de los cuales deberá tener las coordenadas (100, 200)
// y el segundo deberá tener las coordenadas (400, 800) y calcule e imprima la distancia entre ambos.
public class Punto {
    private float x;
    private float y;
    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        Punto p1 = new Punto(100,200);
        Punto p2 = new Punto(400,800);
        System.out.println(distancia(p1.x, p1.y, p2.x, p2.y));
    }
    public static float distancia(float x1, float y1, float x2, float y2) {
        return (x1 - x2) + (y1 - y2);
    }
}