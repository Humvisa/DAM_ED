package Tema4.Exceptions;

public class Registro {
    public static void main() {
        try {
            registrarEdad(-120);
        }catch (EdadInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
    public static void registrarEdad(int edad) throws EdadInvalidaException{
        if (edad < 0 || edad > 120){
            throw new EdadInvalidaException("Edad invalida");
        }else {
            System.out.println("la edad es correcta");
        }
    }
}
