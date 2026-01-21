package Tema3.BatallaDeRobots;

import java.util.Random;
//Crea la clase Robot.
//Requisitos de la Clase:
//Atributos (Privados):
//nombre (String).
//modelo (String).
//vida (double): Empieza en 100.0 (tope máximo).
//potenciaAtaque (double): Valor entre 10 y 20.
//blindaje (double): Valor entre 0 y 10 (reduce el daño recibido).
//Constructores:
//Constructor principal que recibe nombre y modelo. La vida se fija a 100.
//La potenciaAtaque y el blindaje deben generarse aleatoriamente dentro del constructor respetando los rangos indicados.
//Métodos:
//mostrarEstadisticas(): Imprime nombre, vida, ataque y defensa con formato bonito (puedes usar printf ).
//recibirDano(double cantidad):
//El daño real es cantidad - blindaje.
//Si el daño real es menor que 0, no pierde vida (el blindaje lo paró todo).
//Restar daño real a la vida. Si la vida baja de 0, se queda en 0.
//atacar(Robot enemigo):
//Este método recibe otro objeto Robot como parámetro.
//Si el robot atacante tiene 0 de vida, imprime "El robot X está destruido y no puede atacar".
//Si el enemigo ya tiene 0 de vida, imprime "El enemigo ya está vencido".
//Si ambos pueden luchar: Llama al método recibirDano del objeto enemigo pasándole la potenciaAtaque del atacante.
//estaVivo(): Devuelve true si vida > 0.
//Crea la clase Torneo y sitúa un main:
//Instancia dos Robots: "Mazinger" y "Optimus".
//Muestra sus estadísticas iniciales.
//Usa un bucle while que se repita mientras ambos estén vivos.
//En cada vuelta, el Robot 1 ataca al Robot 2.
//Si el Robot 2 sigue vivo, ataca al Robot 1.
//Muestra la vida restante de ambos tras cada asalto.
//Al final, imprime quién ha ganado.
public class Robot {
    private String nombre;
    private String modelo;
    private double vida;
    private double potenciaAtaque;
    private double blindaje;
    public Robot(String nombre, String modelo){
        Random r = new Random();
        this.nombre = nombre;
        this.modelo = modelo;
        this.vida = 100.0;
        this.potenciaAtaque = r.nextDouble(10.00,20.00);
        this.blindaje = r.nextDouble(0.00,10.00);
    }
    public void mostrarEstadisticas(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Vida: " + this.vida);
        System.out.println("Potencia Ataque: " + this.potenciaAtaque);
        System.out.println("Blindaje: " + this.blindaje);
    }
    public void recibirDano(double cantidad){
        double danoReal = cantidad - this.blindaje;
        if(danoReal <= 0){
            System.out.println("el blindaje lo paró todo");
        }
        this.vida -= danoReal;
        if(this.vida < 0){
            this.vida = 0;
        }
    }
    public void atacar(Robot enemigo){
    if (this.vida <= 0){
        System.out.println("el robot " + this.nombre + " esta destruido y no puede atacar");
        }
    if (enemigo.vida <= 0){
        System.out.println("el enemigo " + enemigo.nombre + " ya esta vencido");
        }
    if (this.vida > 0 && enemigo.vida > 0){
        enemigo.recibirDano(this.potenciaAtaque);
        }
    }
    public boolean estaVivo(){
        if (this.vida>0){
            return true;
        }else {
            return false;
        }
    }
    public double getVida(){
        return this.vida;
    }
    public String getNombre(){
        return this.nombre;
    }
}