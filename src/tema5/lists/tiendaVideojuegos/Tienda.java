package tema5.lists.tiendaVideojuegos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Formattable;
import java.util.List;
import java.util.UUID;
//0 ia usada (emoji de carita con gafas de sol).
public class Tienda {
    static LocalDate hoy = LocalDate.now();
    static List<Videojuegos> videojuegos = new ArrayList<>();
    static List<Clientes> clientes = new ArrayList<>();
    static List<Ventas> ventas = new ArrayList<>();
    public static void main(String[] args) {
        Videojuegos minecraft = new Videojuegos("Minecraft", "Todas", "Sandbox", 20.00,30);
        Clientes cliente1 = new Clientes("Humberto", "Villegas", "MiKasa", "humvisa@gmail.com", 1);
        Ventas venta1 = new Ventas(cliente1, minecraft, hoy);

        addToInventary(minecraft);
        System.out.println(inventario().toString());
        consultaTitulo("Minecraft");
        consultaTituloStock("Minecraft");
        clientes.add(cliente1);
        System.out.println(buscarCliente("Humberto"));
        System.out.println(buscarCliente1("Villegas"));
        System.out.println(buscarCliente2("humvisa@gmail.com"));
        registrarVenta(venta1);
        System.out.println(historialVentas());
        ventasFecha(hoy);



    }
    public static void addToInventary(Videojuegos juego){
        videojuegos.add(juego);
    }
    public static List inventario(){
        return videojuegos;
    }
    public static String consultaTitulo(UUID cod){
        for (Videojuegos juego : videojuegos){
            if (juego.id.equals(cod)){
             return juego.toString();
            }
        }
        return "No se encuentra el UUID en la BBDD";
    }
    public static String consultaTitulo(String titulo){
        for (Videojuegos juego : videojuegos){
            if (juego.titulo.equals(titulo)){
                return juego.toString();
            }
        }
        return "No se encuentra el titulo en la BBDD";
    }
    public static void consultaTituloStock(String titulo){
        boolean esta = false;
        for (Videojuegos juego : videojuegos){
            if (juego.titulo.equals(titulo)){
                System.out.println("el stock de "+ titulo + " es de: " + juego.stock);
                esta = true;
            }
        }
        if (!esta){
            System.out.println("el titulo " + titulo + "no esta");
        }
    }
    public static Clientes buscarCliente(String nombre){
        for (Clientes cliente : clientes){
            if (cliente.nombre.equals(nombre)){
                return cliente;
            }
        }
        return null;
    }
    public static Clientes buscarCliente1(String apellido){
        for (Clientes cliente : clientes){
            if (cliente.apellido.equals(apellido)){
                return cliente;
            }
        }
        return null;
    }
    public static Clientes buscarCliente2(String email){
        for (Clientes cliente : clientes){
            if (cliente.email.equals(email)){
                return cliente;
            }
        }
        return null;
    }
    public static void registrarVenta(Ventas venta){
        ventas.add(venta);
        for (Videojuegos juego: videojuegos){
            if (venta.juegos.equals(juego)){
                juego.stock -= 1;
            }
        }
    }
    public static List historialVentas(){
        return ventas;
    }
    public static void ventasFecha(LocalDate fecha){
        for (Ventas venta: ventas){
            if (venta.fechaVenta.equals(fecha)){
                System.out.println(venta.toString());
            }
        }
    }
    //Extras -------------------------------------------------------------------------------------------------------------
    public static List ventasPlataforma(String plataforma){
        for (Videojuegos juego : videojuegos){
            if (juego.plataforma.equals(plataforma)){

            }
        }
        return null;
    }

}
