package Tema3.PruebaExamen.Gestion;
//Gestión de Inventario
//
//Crea una clase Producto con:
//
//Atributos: nombre (String), precio (double) y stock (int).
//Un constructor que reciba los tres parámetros.
//Métodos: vender(int cantidad) que reduzca el stock solo si hay suficiente, y reponer(int cantidad) que lo aumente.
//Un método mostrarInfo() que imprima los datos formateados con printf.
public class Producto {
    private String nombre;
    private double precio;
    private int stock;
 public Producto(String nombre, double precio, int stock){
     this.nombre = nombre;
     this.precio = precio;
     this.stock = stock;
 }
 public void vender(int cantidad){
     if (this.stock >= cantidad){
         this.stock -= cantidad;
     }
 }
 public void reponer(int cantidad){
     this.stock += cantidad;
 }
 public void mostrarInfo(){
     System.out.printf("Nombre: %s | Precio: %.2f € | Stock: %d%n", //use chatgpt para hacer esta parte
     nombre, precio, stock);
 }
}
