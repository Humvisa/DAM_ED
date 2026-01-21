package Tema3.BatallaDeRobots;

public class Torneo {
    public static void main(String[] args) {
        Robot mazinger = new Robot("mazinger", "RHDJ3J");
        Robot optimus = new Robot("optimus", "SFOP3D");
        mazinger.mostrarEstadisticas();
        optimus.mostrarEstadisticas();
        while(mazinger.estaVivo() && optimus.estaVivo()){
            mazinger.atacar(optimus);
            optimus.atacar(mazinger);
            System.out.println("vida optimus "+optimus.getVida());
            System.out.println("vida mazinger "+mazinger.getVida());
        }
        if (mazinger.estaVivo()){
            System.out.println("El ganador es " + mazinger.getNombre()+"!!!");
        }else{
            System.out.println("El ganador es " + optimus.getNombre()+"!!!");
        }
    }
}
