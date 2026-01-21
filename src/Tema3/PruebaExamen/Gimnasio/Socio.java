package Tema3.PruebaExamen.Gimnasio;
//El Gimnasio
//Crea una clase Socio que tenga un atributo estático contadorSocios para llevar la cuenta de cuántos socios se han dado de alta.
//
//Cada vez que se cree un objeto Socio, el contadorSocios debe aumentar.
//A cada socio se le asignará un id automático basado en ese contador.
//Crea un método estático que devuelva el total de socios inscritos hasta el momento.
public class Socio {
    static int contadorSocios = 0;
    private int idSocio;

    static int inscritos(){
        return contadorSocios;
    }
    public Socio(){
        contadorSocios++;
        this.idSocio = contadorSocios;
    }
    public int getIdSocio() {
        return idSocio;
    }
}
