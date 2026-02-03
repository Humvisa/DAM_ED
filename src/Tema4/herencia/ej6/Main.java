package Tema4.herencia.ej6;

public class Main {
    public static void main(String[] args) {
        Comanda c1 = new Comanda(1,3,5);
        c1.addPlato(new Primeros("Papas", 5, true));
        c1.addPlato(new Carnes("carne1", 10, Carnes.Coccion.PocoHecho));
        c1.addPlato(new Pescado("pescado", 6));
        c1.addPlato(new Carnes("crne2",8, Carnes.Coccion.Carbonizado));
        c1.addPlato(new Postres("Helado", 5, false));
    if (c1.hayDiabeticosEnLaMesa()){
        System.out.println("hay diabeticos");
    }else {
        System.out.println("no hay diabeticos");
    }

        System.out.println(c1);
    }
}
