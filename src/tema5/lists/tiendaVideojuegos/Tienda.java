package tema5.lists.tiendaVideojuegos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
//0 ia usada (emoji de carita con gafas de sol).
public class Tienda {
    static LocalDate fecha1 = LocalDate.of(2020, 03,14);
    static LocalDate fecha2 = LocalDate.of(2022, 5,24);
    static LocalDate fecha3 = LocalDate.of(2025, 8,9);

    static List<Videojuegos> videojuegos = new ArrayList<>();
    static List<Clientes> clientes = new ArrayList<>();
    static List<Ventas> ventas = new ArrayList<>();
    public static void main(String[] args) {
        Videojuegos minecraft = new Videojuegos("Minecraft", "Todas", "Sandbox", 20.00,30);
        Clientes cliente1 = new Clientes("Humberto", "Villegas", "MiKasa", "humvisa@gmail.com", 1);
        Ventas venta1 = new Ventas(cliente1, minecraft, fecha1);
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
        registrarVenta(new Ventas(cliente1,  fortnite,  fecha1));
        registrarVenta(new Ventas(cliente1, fortnite, fecha2));
        registrarVenta(new Ventas(cliente1, fortnite, fecha3));
        System.out.println(historialVentas());
        ventasFecha(fecha1);

        ventasPlataforma();
        ventasGenero();
        titMasVendido();
        diaVentas();


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
        System.out.println("Buscando cliente por nombre -----------------------------------");
        for (Clientes cliente : clientes){
            if (cliente.nombre.equals(nombre)){
                return cliente;
            }
        }
        return null;
    }
    public static Clientes buscarCliente1(String apellido){
        System.out.println("Buscando cliente por apellido -----------------------------------");

        for (Clientes cliente : clientes){
            if (cliente.apellido.equals(apellido)){
                return cliente;
            }
        }
        return null;
    }
    public static Clientes buscarCliente2(String email){
        System.out.println("Buscando cliente por correo -----------------------------------");

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
        System.out.println("Historial de Ventas -------------------------------------------");
        return ventas;
    }
    public static void ventasFecha(LocalDate fecha){
        System.out.println("enseñando las ventas del dia: " + fecha + "-----------------------------------");
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
        System.out.println("Ventas por plataforma --------------------------------------------------------");
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
        System.out.println("Ventas por Genero ---------------------------------------------------");
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
        System.out.println("Titulo mas vendido -----------------------------------------------------");
        int contador = 0;
        int indice = 0;
        List<String> titulo = new ArrayList<>();
        List<Integer> titulo2 = new ArrayList<>();
        for (Ventas actual : ventas){
            titulo.add(actual.juegos.titulo);
        }
        for (String actual : titulo){
            for (Ventas actual2 : ventas){
                if (actual.equals(actual2.juegos.titulo)){
                    contador++;
                }
            }
            titulo2.add(contador);
            contador = 0;
        }
        for (int i = 0; i < titulo2.size(); i++){
            contador = titulo2.get(0);
            if (contador <= titulo2.get(i)){
                contador = titulo2.get(i);
                indice = i;
            }
        }
        System.out.println(titulo.get(indice)+ " con: " +titulo2.get(indice) + " ventas");
    }

    public static void diaVentas(){
        System.out.println("Dia con mas Ventas --------------------------------------------------");
        int contador = 0;
        int indice = 0;
        List<LocalDate> venta = new ArrayList<>();
        List<Integer> venta2 = new ArrayList<>();
        for (Ventas actual : ventas){
            venta.add(actual.fechaVenta);
        }
        for (LocalDate actual : venta){
            for (Ventas actual2 : ventas){
                if (actual.equals(actual2.fechaVenta)){
                    contador++;
                }
            }
            venta2.add(contador);
            contador = 0;
        }
        for (int i = 0; i < venta2.size(); i++){
            contador = venta2.get(0);
            if (contador <= venta2.get(i)){
                contador = venta2.get(i);
                indice = i;
            }
        }
        System.out.println(venta.get(indice)+ " con: " +venta2.get(indice) + " ventas");
    }
}