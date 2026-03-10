package tema5.lists.tiendaVideojuegos;

public class Clientes extends Tienda{
    String nombre;
    String apellido;
    String direccion;
    String email;
    int codCliente;

    public Clientes(String nombre, String apellido, String direccion, String email, int codCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.codCliente = codCliente;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", codCliente=" + codCliente +
                '}';
    }
}
