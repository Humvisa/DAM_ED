package tema5.lists.lvl2.videoClub;

public class Cliente {
    int carnet;
    String nombre;

    public Cliente(int carnet, String nombre) {
        this.carnet = carnet;
        this.nombre = nombre;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
