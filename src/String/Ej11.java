package String;
// Desarrolla una solución que elimine todas las vocales de una frase.
//
//Introduciendo: “Hola a Todos”
//
//Da como salida: “Hl Tds”
public class Ej11 {
    public static void main(String[] args) {
        String frase = "Hola a Todos";
        StringBuilder sinVocal = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != 'a' && frase.charAt(i) != 'e' && frase.charAt(i) != 'i' && frase.charAt(i) != 'o' && frase.charAt(i) != 'u') {
                sinVocal.append(frase.charAt(i));
            }
        }
        System.out.println(sinVocal);
    }
}
