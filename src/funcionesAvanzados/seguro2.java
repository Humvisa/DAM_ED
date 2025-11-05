package funcionesAvanzados;
//edad, accidentes, tipo (3eros, todo riesgo), antiguedad, edad coche, color coche
public class seguro2 {
    public static void main(String[] args) {
        System.out.println(calculoSeguro(21, true, "todoRiesgo", 3, 15, "rojo"));
    }

    public static int calculoSeguro(int edad, boolean accidente, String tipoSeguro, int antiguedad, int edadCoche, String colorCoche) {
        int precioBase = 500;
        int precioFinal = 0;
        if (edad >= 18 && edad <= 35){ //edad
            precioFinal = precioFinal + precioBase + precioBase*10/100;
            if (accidente){ //accidentes
                precioFinal = precioFinal + precioBase*30/100;
            }
            else {
                precioFinal = precioFinal;
            }
            if (tipoSeguro == "todoRiesgo"){ //tipo seguro
                precioFinal = precioFinal + precioBase*20/100;
            }
            else {
                precioFinal = precioFinal + precioBase*10/100;
            }
            if (antiguedad > 5){
                precioFinal= precioFinal - precioBase*5/100;
            }
            else {
                precioFinal = precioFinal;
            }
            if (colorCoche == "rojo" || colorCoche == "azul"){ //color coche
                precioFinal = precioFinal + precioBase*15/100;
            } else if (colorCoche == "blanco" || colorCoche == "negro" || colorCoche == "gris") {
                precioFinal = precioFinal + precioBase*5/100;
            } else {
                precioFinal = precioFinal;
            }
        }
        return precioFinal;
    }
}
