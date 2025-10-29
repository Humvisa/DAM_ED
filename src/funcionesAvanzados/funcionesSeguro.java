package funcionesAvanzados;
//500€ precio base, entre 18 y 25  +20%, entre 35 y 55 y no accidentes -10%, mas de 65 +10%, mas de 65 y accidentes +30%
public class funcionesSeguro {
    public static void main(String[] args) {
        System.out.println(calculoSeguro(66, false, 500));
    }

    public static double calculoSeguro(int edad, boolean accidentes, double precioBase) {
        double precioFinal = 0;
        if (edad > 18 && edad < 25){
            precioFinal = (precioBase * 20/100);
        } else if (edad > 35 && edad < 55 && !accidentes) {
            precioFinal = (precioBase * 10/100);
        } else if (edad > 35 && edad < 55 && accidentes) {
            precioFinal = 0;
        } else if (edad> 65 && !accidentes) {
            precioFinal = (precioBase * 10/100);
        } else if (edad> 65 && accidentes) {
            precioFinal = (precioBase * 30/100);
        }
        return precioBase + precioFinal;
    }
}
