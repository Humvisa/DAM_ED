package Objetos.Cuenta;
//Se desea llevar un control del estado de una cuenta corriente.
// La cuenta corriente está caracterizada por su saldo y sobre ella se pueden realizar tres tipos de operaciones:
//saldo: devuelve el saldo de la cuenta (puede ser negativo).
//imposición (cantidad): ingresa en la cuenta una cantidad de dinero.
//reintegro (cantidad): saca de la cuenta una determinada cantidad de dinero.
//Supón que la cuenta corriente tiene inicialmente un saldo de un euro y cree una clase CuentaCorriente con toda la funcionalidad necesaria.
//Escriba una clase con un método main que pruebe la funcionalidad descrita.
public class Cuenta {
    int saldo;
    public Cuenta(int saldo) {
        this.saldo = 1;
    }
    public int saldo () {
        return saldo;
    }
    public void imposicion(int cantidad){
        saldo += cantidad;
    }
    public void reintegro(int cantidad){
        saldo -= cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta " +
                "saldo = " + saldo + "€";
    }
}