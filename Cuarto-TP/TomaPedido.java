
/**
 * Ejecutable del punto 2 del TP4
 * 
 * @author santi
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Calendar;

public class TomaPedido {

    public static void main(String[] args) {
        // Crear instancias de Laboratorio
        Laboratorio lab1 = new Laboratorio("Lab A", "Calle Falsa 123", "123-456");
        Laboratorio lab2 = new Laboratorio("Lab B", "Avenida Siempre Viva 456", "789-012");

        // Crear instancias de Productos
        Producto prod1 = new Producto(1, "Electrónica", "Pendrive", 10000, 10.0, 5, lab1);
        Producto prod2 = new Producto(2, "Libros", "Libro-POO", 9500, 8.0, 10, lab2);
        Producto prod3 = new Producto(3, "Revistas", "Revista-user", 5500, 5.0, 20, lab1);

        // Crear instancia de Cliente
        Cliente cliente = new Cliente(44587744, "Juan", "Pérez", 1500);

        // Crear una lista de productos y agregar productos
        ArrayList<Producto> productosIniciales = new ArrayList<>();
        productosIniciales.add(prod1);
        productosIniciales.add(prod2);
        productosIniciales.add(prod3);

        // Crear instancia de Pedido
        Pedido pedido = new Pedido(Calendar.getInstance(), cliente, productosIniciales);

        // Listar totales iniciales
        System.out.println("Totales iniciales:");
        System.out.printf("Total Financiado: %.2f%n", pedido.totalFinanciado());
        System.out.printf("Total Al Contado: %.2f%n", pedido.totalAlContado());

        // Quitar un producto
        pedido.quitarProducto(prod2);

        // Listar totales después de quitar el producto
        System.out.println("\nTotales después de quitar un producto:");
        System.out.printf("Total Financiado: %.2f%n", pedido.totalFinanciado());
        System.out.printf("Total Al Contado: %.2f%n", pedido.totalAlContado());

        // Emitir el detalle del pedido
        System.out.println("\nDetalle del pedido:");
        pedido.mostrarPedido();
    }
}

