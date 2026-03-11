package tema5.lists.tiendaVideojuegos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
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
        Videojuegos fortnite = new Videojuegos("Fortnite", "PS", "TPS", 0, 1000);
        addToInventary(minecraft);
        addToInventary(fortnite);
        System.out.println(inventario().toString());
        consultaTitulo("Minecraft");
        consultaTituloStock("Minecraft");
        clientes.add(cliente1);
        System.out.println(buscarCliente("Humberto"));
        System.out.println(buscarCliente1("Villegas"));
        System.out.println(buscarCliente2("humvisa@gmail.com"));
        registrarVenta(venta1);
        registrarVenta(new Ventas(cliente1,  fortnite,  hoy));
        registrarVenta(new Ventas(cliente1, minecraft, hoy));
        registrarVenta(new Ventas(cliente1, minecraft, hoy));
        System.out.println(historialVentas());
        ventasFecha(hoy);
        titMasVendido();
        ventasPlataforma();
        ventasGenero();


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
    //Listar el acumulado de ventas por plataforma.
    //Listar el acumulado de ventas por género.
    //Mostrar el título más vendido.
    //Mostrar el mejor día de ventas.
    public static void ventasPlataforma(){
        System.out.println("Ventas por plataforma ------------------------");
        int contador = 0;
        HashSet<String> plataformas = new HashSet<>();
        for (Ventas actual : ventas){
            plataformas.add(actual.juegos.plataforma);
        }
        for (String actual : plataformas){
            for (Ventas vactual : ventas){
                if (actual.equals(vactual.juegos.plataforma)){
                    contador++;
                }
            }
            System.out.println(actual +": " +contador);
            contador = 0;
        }
    }
    public static void ventasGenero(){
        System.out.println("Ventas por Genero -------------------------------");
        int contador = 0;
        HashSet<String> generos = new HashSet<>();
        for (Videojuegos actual : videojuegos){
            generos.add(actual.genero);
        }
        for (String actual : generos){
            for (Ventas vactual : ventas){
                if (actual.equals(vactual.juegos.genero)){
                    contador++;
                }
            }
            System.out.println(actual + ": " + contador);
            contador = 0;
        }
    }
    public static void titMasVendido(){
        System.out.println("Titulo mas vendido ----------------------------------");
        int contador = 0;
        HashSet<String> titulo = new HashSet<>();
        for (Videojuegos actual : videojuegos){
            titulo.add(actual.titulo);
        }
        List<String> titulosOrdenados = new ArrayList<>();
        for (String actual : titulo){
            titulosOrdenados.add(actual);
        }
        for (int i = 0; i < titulosOrdenados.size(); i++){

        }


    }

}
