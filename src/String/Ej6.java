package String;
//Crea un programa que descubra si una palabra es o no palíndroma, es decir se lee igual del derecho que del revés.
//
//Introduciendo: “oso”
//
//Da como salida: true
public class Ej6 {
    public static void main(String[] args) {
    String palabra = "reconocer";
        System.out.println("la palabra "+palabra+ " es palindroma? "+palindroma(palabra));
    }

    public static boolean palindroma(String palabra) {
        int contador = palabra.length()-1;
        for (int i = 0; i < palabra.length()/2; i++) {
            if (palabra.charAt(i) != palabra.charAt(contador--)){
                return false;
            }
        }
        return true;
    }
}