import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Exe del ejercicio seis
 * 
 * @author Santi y Fran 
 * @version first try 😎
 */


public class GestionComercio{
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Comercio comercio = new Comercio("AVANTI SRL");

        while (true) {
            System.out.println("\nMenu de opciones:");
            System.out.println("1- Ingrese un  empleadp del comercio");
            System.out.println("2- Mostrar información de un empleado");
            System.out.println("3- Mostrar sueldo de todos los empleados");
            System.out.println("4- Mostrar antigüedad de un empleado");
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

                    Empleado empleado = new Empleado(cuil, apellido, nombre, sueldoBasico, fechaIngreso);
                    System.out.println("Empleado creado");
                    
                    comercio.altaEmpleadoo(empleado);
                    break;

                case 2:
                    System.out.println("Ingrese el CUIL del empleado a buscar: ");
                    cuil = scanner.nextLong();
                    System.out.format("%15d", comercio.buscarEmpleado(cuil).apeYNom());
                    break;

                case 3:
                    comercio.nomina();
                    break;

                case 4:
                    System.out.println("Ingeese el CUIL del empleado a buscar: ");
                    cuil = scanner.nextLong();
                    System.out.format("%15d", comercio.buscarEmpleado(cuil).antiguedad());
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

