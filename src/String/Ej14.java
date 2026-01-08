package String;
//14.  Implementa un programa que intercale las letras de dos palabras. El programa debe pedir 2 palabras y luego dar otra palabra resultado con las letras de las dos palabras intercaladas.
//
//Introduciendo:               Primera palabra “INTERNET”
//
//Segunda palabra “correo”
//
//Da como salida: “IcNoTrErReNoET”
public class Ej14 {
    public static void main(String[] args) {
        String p1 = "correo";
        String p2 = "INTERNET";
        StringBuilder mezcla =  new StringBuilder();
        int contador = 1;
        boolean p1Mayor = true;
        if(p1.length()<p2.length()){p1Mayor = false;}
        if (p1Mayor) {
            mezcla.append(p1);
            for (int i = 0; i < p2.length(); i++) {
                mezcla.insert(contador++, p2.charAt(i));
                contador++;
            }
        }else {
            mezcla.append(p2);
            for (int i = 0; i < p1.length(); i++) {
                mezcla.insert(contador++, p1.charAt(i));
                contador++;
            }
        }
        System.out.println(mezcla);
    }
}