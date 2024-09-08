import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;
/**
 * Clase ejecutable para probar la clase Empleado
 * 
 * @author SANTI Y FRANCO
 * @version 1.1
 */
public class Empresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado empleado = null;

        while (true) {
            System.out.println("\nMenu de opciones:");
            System.out.println("1- Ingresar datos del empleado");
            System.out.println("2- Mostrar información del empleado");
            System.out.println("3- Mostrar sueldo neto del empleado");
            System.out.println("4- Mostrar antigüedad del empleado");
            System.out.println("5- Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el CUIL: ");
                    long cuil = scanner.nextLong();

                    scanner.nextLine();  // Consumir el salto de línea

                    System.out.print("Ingrese el apellido: ");
                    String apellido = scanner.nextLine();

                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese el sueldo básico: ");
                    double sueldoBasico = scanner.nextDouble();

                    System.out.print("Ingrese el año de ingreso: ");
                    int anioIngreso = scanner.nextInt();

                    Calendar fechaIngreso = new GregorianCalendar(anioIngreso, Calendar.JANUARY, 1);

                    empleado = new Empleado(cuil, apellido, nombre, sueldoBasico, fechaIngreso);
                    System.out.println("Empleado creado");
                    break;

                case 2:
                    if (empleado != null) {
                        empleado.mostrar();
                    } else {
                        System.out.println("Debe ingresar los datos del empleado primero.");
                    }
                    break;

                case 3:
                    if (empleado != null) {
                        System.out.printf("El sueldo neto es: $%.2f\n", empleado.getSueldoNeto());
                    } else {
                        System.out.println("Debe ingresar los datos del empleado primero.");
                    }
                    break;

                case 4:
                    if (empleado != null) {
                        System.out.printf("La antigüedad del empleado es: %d años\n", empleado.antiguedad());
                    } else {
                        System.out.println("Debe ingresar los datos del empleado primero.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opcion no valida..");
            }
        }
    }
}