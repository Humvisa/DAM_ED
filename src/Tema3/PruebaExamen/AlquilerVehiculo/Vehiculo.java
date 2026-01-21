package Tema3.PruebaExamen.AlquilerVehiculo;
//Alquiler de Vehículos
//Escribe una clase Vehiculo con los atributos: modelo, tarifaBase (diaria), esElectrico (boolean) y diasAlquiler.
//Crea un método calcularPrecioFinal() que aplique las siguientes reglas:
//
//Precio inicial: tarifaBase * diasAlquiler.
//Descuento por duración: * Si se alquila más de 7 días, se aplica un 10% de descuento sobre el total.
//Si se alquila más de 15 días, el descuento es del 20%.
//Bono Ecológico: Si esElectrico es true, se restan 15€ al total final (siempre que el total sea mayor a 15€).
//Tasa Joven: El método debe recibir la edad del conductor. Si es menor de 25 años, se suma un recargo de 50€ por concepto de seguro de riesgo.
public class Vehiculo {
    private String modelo;
    private double tarifaBase;
    private boolean esElectrico;
    private int diasAlquiler;

    public Vehiculo(String modelo, double tarifaBase, boolean esElectrico, int diasAlquiler) {
        this.modelo = modelo;
        this.tarifaBase = tarifaBase;
        this.esElectrico = esElectrico;
        this.diasAlquiler = diasAlquiler;
    }

    public double calcularPrecioFinal(int edad) {
        double precioInicial = this.tarifaBase * this.diasAlquiler;
        if (this.diasAlquiler > 15) {
            precioInicial *= 0.8;
        }else if (this.diasAlquiler > 7) {
            precioInicial *= 0.9;
        }
        if (this.esElectrico) {
            if (precioInicial > 15){
                precioInicial -= 15;
            }
        }
        if (edad < 25){
            precioInicial += 50;
        }
        return precioInicial;
    }
}
