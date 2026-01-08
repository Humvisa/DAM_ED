package String;
//13.  Crea un programa que averigüe cuál es la palabra que más letras tiene de un String. El String solo contendrá letras y espacios de separación, nada más.
//
//En el ejemplo: “Este Mp3 lo conecto al puerto usb”
//
//El método debe retornar la palabra “conecto” que es la que más letras tiene.
public class Ej13 {
    public static void main(String[] args) {
            String frase = "Este Mp3 lo conecto al puerto usb";
            String[] arrayFrase = frase.split(" ");
            int mayor = arrayFrase[0].length();
            String mayorString = arrayFrase[0];
            for (int i = 1; i < arrayFrase.length; i++){
                if(arrayFrase[i].length() > mayor){
                    mayor = arrayFrase[i].length();
                    mayorString = arrayFrase[i];
                }
            }
            System.out.println(mayorString);
    }
}
