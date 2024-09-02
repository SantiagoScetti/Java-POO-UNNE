import java.util.Scanner;

/**
 * Clase ejecutable para probar la clase Empleado
 * 
 * @author SANTI Y FRANCO
 * @version 1.1
 */
public class Empresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar los datos del empleado por teclado
        System.out.print("Ingrese el número de CUIL: ");
        long cuil = scanner.nextLong();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del empleado: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el sueldo básico: ");
        double sueldoBasico = scanner.nextDouble();

        System.out.print("Ingrese el año de ingreso: ");
        int anioIngreso = scanner.nextInt();

        // Crear una instancia de Empleado con los datos ingresados
        Empleado empleado = new Empleado(cuil, apellido, nombre, sueldoBasico, anioIngreso);
        empleado.getSueldoBasico();
        empleado.apeYNom();
        // Mostrar la información del empleado
        empleado.mostrar();
        empleado.mostrarLinea();

        scanner.close(); // Cerrar el Scanner al final
    }
}
