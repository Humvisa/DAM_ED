package Tema3.PruebaExamen;

public class Persona {
    String nombre;
    int edad;
    boolean esFumador;
    String estadoSalud; //excelente, bueno, regular, malo.

    public Persona(String nombre, int edad, boolean esFumador, String estadoSalud){
        this.nombre = nombre;
        this.edad = edad;
        this.esFumador = esFumador;
        this.estadoSalud = estadoSalud;
    }
    public double calcularImporteSeguro(){
        double importeBase = 500;
        double importeFinal = importeBase;
        if (this.edad < 25){
            importeFinal += (importeBase*0.20);
        } else if (this.edad > 40) {
            importeFinal += (importeBase*0.10);
        }
        return importeFinal;
    }
}
