package Tema3.PruebaExamen.Gestion;

public class MainProducto {
    public static void main(String[] args) {
        Producto pan = new Producto("pan", 1, 20);
        pan.mostrarInfo();
        pan.vender(4);
        pan.mostrarInfo();
        pan.reponer(20);
        pan.mostrarInfo();
        pan.vender(15);
        pan.mostrarInfo();
    }
}