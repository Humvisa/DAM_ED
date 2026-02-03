package Tema4.herencia.ej6;

import java.lang.reflect.Array;

public class Comanda{
    private int numMesa;
    private int numComensales;
    private Plato[] lista;
    private int contador;

    public Comanda (int numMesa, int numComensales, int cuantosPlatos) {
        this.numMesa = numMesa;
        this.numComensales = numComensales;
        lista = new Plato[cuantosPlatos];
        contador = 0;
    }

    public void addPlato(Plato plato) {
        lista[contador++] = plato;
    }

    public double Coste() {
        double resultado = 0;
        for (int i = 0; i < lista.length; i++) {
            resultado += lista[i].getPrecio();
        }
        return resultado;
    }

    public boolean hayDiabeticosEnLaMesa() {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof Postres) {
                Postres p = (Postres) lista[i];
                if (p.isConAzucar()){
                    return false;
                }
            }
        }
        return true;

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("el numero de mesa es: " + this.numMesa + " | el numero de comensales: " + this.numComensales);
        for (int i = 0; i< contador; i++){
            sb.append(" | plato:" + lista[i].toString());
        }
        sb.append( " | el coste total: " + Coste());
        String resultado = sb.toString();
        return resultado;
    }
}