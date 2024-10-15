/**
 * Ejecutable del Punto 2
 *
 * @author Santi
 * @version 1.0
 */
public class Empresa {
    public static void main(String[] args) {
        // Instanciar una Persona
        Persona persona1 = new Persona(25365902, "Maria", "Lopez", 1982);
        // Instanciar un Empleado
        Empleado empleado1 = new Empleado(27135498678L, 13549867, "Perez", "Darío", 150000.00, 1974, 2001);
        

        // Llamar a mostrar() para ambos objetos
        System.out.println("Detalles de Persona:");
        persona1.mostrar();

        System.out.println("\nDetalles de Empleado:");
        empleado1.mostrar();
    }
}