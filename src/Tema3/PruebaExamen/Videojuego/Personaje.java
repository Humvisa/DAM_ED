package Tema3.PruebaExamen.Videojuego;
//Videojuego
//Crea una clase Personaje
//
//Atributos: nombre, nivel (int), puntosVida (int), esMagico (boolean).  ***
//Constructor: Inicializa el nombre y si es mágico. El nivel empieza en 1 y la vida en 100.
//Lógica de Daño: Crea un método recibirDaño(int daño):
//Si el personaje esMagico, el daño recibido se reduce un 20%.
//Si después de recibir daño la vida baja de 0, se debe fijar en 0.
//Lógica de Curación: Crea un método curar():
//Si el nivel es menor de 5, recupera 10 puntos de vida.
//Si el nivel es 5 o superior, recupera 25 puntos.
//La vida nunca puede superar los 100 puntos.
public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosVida;
    private boolean esMagico;

    public Personaje(String nombre, boolean esMagico) {
        this.nombre = nombre;
        this.esMagico = esMagico;
        this.nivel = 1;
        this.puntosVida = 100;
    }
    public void recibirDanio(int danio){
        int danioMagico = ((danio * 20)/100);
        if(this.esMagico) {
            this.puntosVida -= danioMagico;
            System.out.println(" ha recibido " + danioMagico + " de daño");
        }else {
            this.puntosVida -= danio;
            System.out.println(this.nombre + " ha recibido " + danio + " de daño");
        }
        if(this.puntosVida < 1){
            this.puntosVida = 0;
            System.out.println(this.nombre + " ha muerto");
        }
        System.out.println("tienes " +  this.puntosVida + " puntos de vida");
    }
    public void curar(){
        if(this.nivel < 5){
            this.puntosVida += 10;
        } else if (this.nivel >= 5) {
            this.puntosVida += 25;
        }
        if (this.puntosVida > 100) {
            this.puntosVida = 100;
        }
        System.out.println(this.nombre + " se ha curado tiene " +  this.puntosVida + " puntos de vida");
    }
}
