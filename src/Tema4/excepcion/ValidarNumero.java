package Tema4.excepcion;

public class ValidarNumero {
    public static void main(String[] args) {
        validarPositivo(8);
        validarPositivo(-1);
    }

    public static void validarPositivo (int a){
            if (a<0){
                throw new IllegalArgumentException("el numero "+ a +" no debe ser menor que cero");
            }
        System.out.println("el numero " + a + " es correcto");
        }
    }
