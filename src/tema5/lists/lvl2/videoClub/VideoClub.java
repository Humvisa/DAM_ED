package tema5.lists.lvl2.videoClub;
import java.util.ArrayList;
import java.util.List;
//Realiza un programa para la gestión de un Videoclub. Se debe almacenar la información de los clientes, películas y los préstamos que hemos llevado a cabo.
//Clase Cliente. Contiene la información de cada cliente.
// Debe contener:
//numeroCarnet: int
//nombre: String
//Constructores.
//Métodos get y set necesarios.
//Clase Película.
// Contiene la información de cada película.
// Debe contener:
//código: int
//titulo: String
//Constructores.
//Métodos get y set necesarios.
//Clase Préstamo. Se crea uno de estos objetos cada vez que un cliente alquila una película. Contiene la película, el cliente y la fecha en la que se lleva el préstamo.
// La fecha de devolución es por defecto de 2 días, salvo que se indique lo contrario. Debe contener:
//Constructores.
//Métodos get y set necesarios.
//Clase Videoclub. Contiene tres listas con todos los clientes, películas y préstamos.
// Debemos programar todos los métodos siguientes, además de un constructor vacío que inicialice las listas:
//añadirCliente(Cliente): void
//añadirPelicula(Película): void
//añadirPrestamo(Prestamo): void
//buscarPelícula(codigo): Pelicula
//buscarCliente(numeroCarnet): Cliente
//getPrestamos(): ArrayList
//getPrestamos(numeroCarnet): ArrayList
//devolucion(codigoPelicula, numeroCarnet): boolean
//prestamosMorosos(): ArrayList
public class VideoClub {
    static List<Cliente> clientes = new ArrayList<>();
    static List<Pelicula> peliculas = new ArrayList<>();
    static List<Prestamo> prestamos = new ArrayList<>();
    public VideoClub() {
    }
    public static void main(String[] args) {
        Cliente juan = new Cliente(1,"juan");
        Pelicula peli1 = new Pelicula(1, "titanic");
        Prestamo p1 = new Prestamo(peli1,juan);

        añadirCliente(juan);
        añadirPelicula(peli1);
        añdirPrestamo(p1);

        System.out.println(buscarPelicula(1).getTitulo());
        System.out.println(buscarCliente(1).getNombre());
        System.out.println(getPrestamos().toString());
        System.out.println(getPrestamos(1).fecha);
    }
    public static void añadirCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public static void añadirPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    public static void añdirPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }
    public static Pelicula buscarPelicula(int codigo){
        for (int i = 0; i< peliculas.size(); i++){
            Pelicula actual = peliculas.get(i);
            if (actual.codigo == codigo){
                return actual;
            }
        }return null;
    }
    public static Cliente buscarCliente (int carnet){
        for (int i = 0; i< clientes.size(); i++){
            Cliente actual = clientes.get(i);
            if (actual.carnet == carnet){
                return actual;
            }
        }return null;
    }
    public static List getPrestamos(){
        return prestamos;
    }
    public static Prestamo getPrestamos(int numeroCarnet){
        for (int i = 0; i< prestamos.size(); i++){
            Prestamo actual = prestamos.get(i);
            if (actual.cliente.getCarnet() == numeroCarnet){
                return actual;
            }
        }return null;
    }
    public static boolean devolucion(int codigoPelicula, int numeroCarnet){
        for (int i = 0; i< prestamos.size(); i++){
            Prestamo actual = prestamos.get(i);
            if (actual.getCliente().carnet == numeroCarnet && actual.getPelicula().getCodigo() == codigoPelicula){
                return false;
            }
        }
        return true;
    }
}
