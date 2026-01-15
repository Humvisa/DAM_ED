package Tema3.Ej4;

import java.lang.reflect.Array;

public class ControlarFlota {
    public static void main(String[] args) {
        NaveEspacial[] almacen = new NaveEspacial[3];
        NaveEspacial nave1 = new NaveEspacial("nave1", 4);
        NaveEspacial nave2 = new NaveEspacial("nave2", 8);
        NaveEspacial nave3 = new NaveEspacial("nave3", 16);
        almacen[0] = nave1;
        almacen[1] = nave2;
        almacen[2] = nave3;
        nave1.viajar(30);
        nave2.viajar(60);
        for (int i = 0; i < almacen.length; i++) {
            almacen[i].mostrarEstado();
        }
        nave1.repostar();
        nave1.mostrarEstado();
        if (almacen[0].combustible() > almacen[1].combustible() && almacen[0].combustible() > almacen[2].combustible()) {
            System.out.println("la nave que mas combustible tiene es " + almacen[0].nombre() + " con " + almacen[0].combustible());
        }if (almacen[1].combustible() > almacen[2].combustible()){
            System.out.println("la nave que mas combustible tiene es " + almacen[1].nombre() + " con " + almacen[1].combustible());
        }else {
            System.out.println("la nave que mas combustible tiene es " + almacen[2].nombre() + " con " + almacen[2].combustible());
        }
    }
}