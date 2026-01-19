package repasoExamen;
//Dado que es navidad, escribe un programa que, introducido un número por teclado, dibuje la siguiente figura, por ejemplo, con el 5 tendrá 5 alturas:
//
//         *
//        ***
//       *****
//      *******
//     *********
//         |
//El tronco tiene un palo de tronco por cada 5 niveles.
public class Ej1 {
    public static void main(String[] args) {
        int altura = 30;
        int contadorEspacios = altura * 2;
        int contadorA = 1;
        for (int i = 0; i < altura; i++) {
            for (int j = contadorEspacios; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = contadorA; j > 0; j--) {
                System.out.print("^");
            }
            contadorA+=2;
            contadorEspacios--;
            System.out.println(" ");
        }
        for (int i = contadorEspacios + altura; i > 0; i--) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}