package repasoExamen;
//Tenemos que calcular en una función la lógica de negocio de una biblioteca.
//Parámetros:
//Nombre libro
//Plazo de préstamo: días iniciales para hacer el cálculo
//Categoría: ficción (sí/no), referencia o infantil
//Novedad: sí/no
//Bestseller: sí/no
//Lenguaje: texto corto, ES para español, EN para inglés, FR para francés...
//Función para calcular el plazo de préstamo:
//El plazo base del préstamo es de 12 días, pero personalizable.
//Si la categoría es referencia o infantil, el plazo aumenta en 5 días.
//Si es una novedad, el plazo máximo es de 10 días.
//Si es un bestseller, el plazo disminuye en 4 días.
//Si el lenguaje no es español el plazo aumenta en 3 días.
//Si el lenguaje es inglés y la categoría es ficción, el plazo disminuye 2 días.
//Las reducciones y aumentos son acumulativos.
//El plazo nunca puede ser menor de 3 días, independientemente de las reducciones.
//El plazo nunca puede ser mayor de 20 días, independientemente de los aumentos.
//Función para calcular la multa. Una vez calculado el plazo de préstamo, se crea una nueva función con todos los mismos parámetros,
// más dos, uno es un entero con los días máximos de préstamo (calculado en la función previa), el otro es el precio de compra del libro.
// La función devolverá un número que será el precio de la multa.
//La multa base es de 0.50€ por cada día de retraso.
//Si la categoría es referencia, aumenta la multa en 0.50€ por cada día de retraso.
//Si la categoría es infantil, aumenta la multa en 0.25€ por cada día de retraso.
//Si es una novedad, aumenta la multa en 0.40€ por cada día de retraso.
//Si es un bestseller, aumenta la multa en 0.75€ por cada día de retraso.
//La multa no puede ser mayor que el precio del libro.
public class Ej4 {
    public static void main(String[] args) {
        String nombreLibro = "Cancion de Hielo y Fuego";
        int plazoBase = 12;
        String categoria = "infantil";
        boolean novedad = true;
        boolean bestseller = true;
        String lenguaje = "ES";
        int precioLibro = 10;
        int diasRetraso = 1;
        int plazoPrestamo = calculoPlazo(plazoBase, categoria,novedad, bestseller,  lenguaje);
        double multa = calculoMulta(plazoPrestamo,categoria,novedad, bestseller,  lenguaje, precioLibro, diasRetraso);
        System.out.println("el plazo del prestamo es de "+ plazoPrestamo + " dias");
        System.out.println("la multa es de " + multa + "€");
    }

    public static int calculoPlazo(int plazo, String categoria,boolean novedad, boolean bestseller, String lenguaje) {
            if (categoria == "referencia" || categoria == "infantil") {
                plazo += 5;
            }
            if (bestseller) {
                plazo -= 4;
            }
            if (lenguaje != "ES"){
                plazo += 3;
                if (lenguaje == "EN" && categoria == "ficcion") {
                    plazo -= 2;
                }
            }
            if (plazo < 3) {
                plazo = 3;
            }
            if (novedad && plazo > 10) {
                plazo = 10;
            }
            if (plazo > 20) {
                plazo = 20;
            }
        return plazo;
    }

    public static double calculoMulta(int plazoPrestamo, String categoria,boolean novedad, boolean bestseller, String lenguaje, int precioLibro, int diasRetraso) {
        double multaBase = 0.50;
        double multa = 0;
        if (diasRetraso > 0){
            multa = multaBase * diasRetraso;
            if (categoria == "referencia") {
                multa += 0.50 * diasRetraso;
            }
            if (categoria == "infantil") {
                multa += 0.25 * diasRetraso;
            }
            if (novedad) {
                multa += 0.40 * diasRetraso;
            }
            if (bestseller) {
                multa += 0.75 * diasRetraso;
            }
            if (multa > precioLibro) {
                multa = precioLibro;
            }
        }
        return multa;
    }
}
