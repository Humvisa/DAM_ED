package Tema4.repasoT4;

public class MainTransportes {
    static void main() {
        try {
            Camion camion = new Camion("1234", 2000);
            camion.viajar(35);
        }catch (Exception e){
            System.out.println("error:"+e.getMessage());
        }

        try {
            Burro burro = new Burro("pedro", 180);
            burro.viajar(20);
        }catch (Exception e){
            System.out.println("error:"+e.getMessage());
        }

        try {
            Autobus autobus = new Autobus("5678", 20);
            autobus.viajar(35);
        }catch (Exception e){
            System.out.println("error:"+e.getMessage());
        }

    }
}
