/**
 * Clase ejecutable para probar las clases Producto y Laboratorio.
 * 
 * @author Santi & Franco
 * @version 1.0
 */
public class ProductoEjecutable {
    public static void main(String[] args) {
        // Crear un objeto Laboratorio
        Laboratorio lab1 = new Laboratorio("Colgate S.A.", "San Lorenzo 1990", "54-11-4239-8447");

        // Crear un objeto Producto utilizando el laboratorio creado
        Producto prod1 = new Producto(101, "Perfumería", "Jabón Deluxe", 5.25, 20.0, 100, lab1);

        // Mostrar la información del producto y su laboratorio asociado
        System.out.println("Información del Producto:");
        prod1.mostrar();
        
        // Ajustar el stock del producto y mostrar el stock valorizado
        prod1.ajuste(500);
        System.out.println("\nStock actualizado: " + prod1.getStock());
        System.out.println("Stock valorizado: $" + prod1.stockValorizado());
        
        // Mostrar una línea de producto con su precio de lista y precio contado
        System.out.println("\nLínea de Producto:");
        System.out.println(prod1.mostrarLinea());

        // Ajustar el punto de reposición y la existencia mínima
        prod1.ajustarPtoRepo(25.0);
        prod1.ajustarExistMin(120);
        
        // Mostrar de nuevo la información del producto después de los ajustes
        System.out.println("\nInformación actualizada del Producto:");
        prod1.mostrar();
    }
}
