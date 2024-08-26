/**
 * La clase {@code EjecutableLaboratorio} contiene el método principal que crea instancias de la clase {@code Laboratorio}
 * y demuestra cómo utilizar sus métodos para gestionar información sobre laboratorios farmacéuticos.
 * 
 * @author Santi & Franco
 * @version 1.0
 */
public class EjecutableLaboratorio {
    public static void main(String[] args) {
        // Creación de un laboratorio con todos los atributos
        Laboratorio lab1 = new Laboratorio("Farmacia Central", "Calle Falsa 123", "123-456-789", 5000, 3);
        System.out.println(lab1.mostrar());
        System.out.println("Compra mínima: $" + lab1.getCompraMinima());
        System.out.println("Día de entrega: " + lab1.getDiaDeEntrega());

        System.out.println();

        // Creación de un laboratorio sin definir compra mínima ni día de entrega
        Laboratorio lab2 = new Laboratorio("Laboratorios ABC", "Av. Siempre Viva 742", "987-654-321");
        System.out.println(lab2.mostrar());
        System.out.println("Compra mínima: $" + lab2.getCompraMinima()); // Será 0 por defecto
        System.out.println("Día de entrega: " + lab2.getDiaDeEntrega()); // Será 0 por defecto

        System.out.println();

        // Actualizando compra mínima y día de entrega del segundo laboratorio
        lab2.nuevaCompraMinima(3000);
        lab2.nuevoDiaEntrega(5);
        System.out.println("Actualización de datos para " + lab2.getNombre());
        System.out.println("Nueva compra mínima: $" + lab2.getCompraMinima());
        System.out.println("Nuevo día de entrega: " + lab2.getDiaDeEntrega());
    }
}

