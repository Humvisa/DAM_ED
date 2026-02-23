package Tema4.excepcion;

public class Producto {
    public static void main(String[] args) {
        try{
            establecerPrecio(3);
        }catch (Exception e){
        }
    }
    public static void establecerPrecio(double precio){
        if (precio < 0){
            throw new IllegalArgumentException();
        }
    }
}
