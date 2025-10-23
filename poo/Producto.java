package poo;
// 5. Clase Producto: atributos (nombre, precio, cantidad); métodos calcularTotal() y aplicarDescuento().

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return precio * cantidad;
    }

    public double aplicarDescuento(double porcentaje) {
        double total = calcularTotal();
        double descuento = total * (porcentaje / 100);
        return total - descuento;
    }

    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 800.0, 2);
        System.out.println("Total sin descuento: " + producto.calcularTotal());
        System.out.println("Total con 10% de descuento: " + producto.aplicarDescuento(10));
    } 
}
