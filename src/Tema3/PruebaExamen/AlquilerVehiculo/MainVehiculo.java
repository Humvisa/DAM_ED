package Tema3.PruebaExamen.AlquilerVehiculo;
// no se aclara como la clase recibe la tarifa o si es electrico entonces lo declaro como parametro
public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo lamboUrus = new Vehiculo("Lamborghini Urus",150, false, 16);
        System.out.println(lamboUrus.calcularPrecioFinal(18));
    }
}
