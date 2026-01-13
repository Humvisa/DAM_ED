package Tema3.Biblioteca;
//Gestionar objetos Libro que contienen un objeto Autor, controlando su disponibilidad.
//1. La Clase Autor: Es la clase base que será un atributo de la otra.
//Atributos privados: nombre (String) y nacionalidad (String).
//Constructor: Que inicialice ambos campos.
//Método: mostrarAutor() que devuelva un String con el formato: "Nombre (Nacionalidad)".
//2. La Clase Libro:
//Atributos privados:
//titulo (String)
//escritor (Autor): Aquí aplicamos la composición.
//prestado (boolean): Por defecto será false.
//Constructor: Debe recibir el título y un objeto de tipo Autor.
//Métodos:
//prestar(): Si el libro no está prestado, cambia el estado a true y muestra: "Has alquilado [titulo]". Si ya está prestado, muestra: "Error: [titulo] no está disponible".
//devolver(): Cambia el estado a false.
//informacion(): Imprime el título del libro y usa el método del autor para mostrar quién lo escribió.
//3. El Main en la clase Biblioteca:
//Crear un autor (ej: "Miguel de Cervantes", "Española").
//Crear un libro pasando ese autor y el título "Don Quijote".
//Intentar prestar el libro dos veces seguidas (la segunda debe fallar).
//Llamar al método informacion() del libro para ver cómo imprime los datos de ambos objetos a la vez.
public class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    public String MostrarAutor() {
        return nombre + " (" + nacionalidad + ")";
    }
}