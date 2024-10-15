package Punto9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejecutable del Punto9
 *
 * @author santi
 * @version 1.0
 */
public class AdministracionGerencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        Gerencia gerencia = new Gerencia("Gerencia Central", alojamientos);  // Instancia de Gerencia

        int opcion = 0;
        do {
            System.out.println("\n----- MENÚ DE GERENCIA -----");
            System.out.println("1. Agregar Alojamiento (Hotel o Cabaña)");
            System.out.println("2. Mostrar Liquidación");
            System.out.println("3. Contar Alojamientos por Tipo");
            System.out.println("4. Quitar Alojamiento");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer

            switch (opcion) {
                case 1:
                    agregarAlojamientoMenu(gerencia, scanner);
                    break;
                case 2:
                    gerencia.mostrarLiquidacion();
                    break;
                case 3:
                    contarAlojamientosMenu(gerencia, scanner);
                    break;
                case 4:
                    quitarAlojamientoMenu(gerencia, scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema de gerencia...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    // Método para agregar un nuevo servicio
    public static Servicio agregarServicio(Scanner scanner) {
        System.out.print("Ingrese la descripción del servicio: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingrese el precio del servicio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();  // Limpiar buffer

        return new Servicio(descripcion, precio);
    }

    // Método para agregar alojamiento (Hotel o Cabaña)
    public static void agregarAlojamientoMenu(Gerencia gerencia, Scanner scanner) {
        System.out.println("Seleccione el tipo de alojamiento a agregar:");
        System.out.println("1. Hotel");
        System.out.println("2. Cabaña");
        int tipo = scanner.nextInt();
        scanner.nextLine();  // Limpiar buffer

        // Lista para almacenar los servicios
        ArrayList<Servicio> servicios = new ArrayList<>();

        // Preguntar si se desea agregar servicios
        System.out.print("¿Desea agregar servicios? (s/n): ");
        String respuesta = scanner.nextLine();
        while (respuesta.equalsIgnoreCase("s")) {
            // Agregar un servicio
            Servicio servicio = agregarServicio(scanner);
            servicios.add(servicio);

            System.out.print("¿Desea agregar otro servicio? (s/n): ");
            respuesta = scanner.nextLine();
        }

        // Crear Hotel o Cabaña dependiendo del tipo seleccionado
        switch (tipo) {
            case 1 -> {
                System.out.print("Ingrese el nombre del Hotel: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el precio base del Hotel: ");
                double precioBase = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Ingrese la cantidad de días de alquiler: ");
                int diasAlquiler = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese el tipo de habitación (Single o Doble): ");
                String tipoHabitacion = scanner.nextLine();
                Hotel hotel = new Hotel(nombre, precioBase, diasAlquiler, servicios, tipoHabitacion);
                gerencia.agregarAlojamiento(hotel);
                System.out.println("Hotel agregado con éxito.");
            }
            case 2 -> {
                System.out.print("Ingrese el nombre de la Cabaña: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el precio base de la Cabaña: ");
                double precioBase = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Ingrese la cantidad de días de alquiler: ");
                int diasAlquiler = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese el número de habitaciones de la Cabaña: ");
                int nroHabitaciones = scanner.nextInt();
                scanner.nextLine();
                Cabaña cabaña = new Cabaña(nombre, precioBase, diasAlquiler, servicios, nroHabitaciones);
                gerencia.agregarAlojamiento(cabaña);
                System.out.println("Cabaña agregada con éxito.");
            }
            default ->
                System.out.println("Tipo de alojamiento no válido.");
        }
    }

    // Método para contar alojamientos por tipo
    public static void contarAlojamientosMenu(Gerencia gerencia, Scanner scanner) {
        System.out.println("Seleccione el tipo de alojamiento a contar:");
        System.out.println("1. Hotel");
        System.out.println("2. Cabaña");
        int tipo = scanner.nextInt();

        if (tipo == 1) {
            int totalHoteles = gerencia.contarAlojamiento("Hotel");
            System.out.println("Total de Hoteles: " + totalHoteles);
        } else if (tipo == 2) {
            int totalCabañas = gerencia.contarAlojamiento("Cabaña");
            System.out.println("Total de Cabañas: " + totalCabañas);
        } else {
            System.out.println("Tipo de alojamiento no válido.");
        }
    }

    // Método para quitar alojamiento
    public static void quitarAlojamientoMenu(Gerencia gerencia, Scanner scanner) {
        System.out.print("Ingrese el nombre del alojamiento a eliminar: ");
        String nombreAlojamiento = scanner.nextLine();

        // Buscar el alojamiento por su nombre
        Alojamiento alojamientoAEliminar = null;
        for (Alojamiento alojamiento : gerencia.getAlojamientos()) {
            if (alojamiento.getNombre().equalsIgnoreCase(nombreAlojamiento)) {
                alojamientoAEliminar = alojamiento;
                break;
            }
        }

        // Si se encontró el alojamiento, proceder a eliminarlo
        if (alojamientoAEliminar != null) {
            boolean eliminado = gerencia.quitarAlojamiento(alojamientoAEliminar);
            if (eliminado) {
                System.out.println("Alojamiento '" + nombreAlojamiento + "' eliminado con éxito.");
            } else {
                System.out.println("Hubo un problema al intentar eliminar el alojamiento.");
            }
        } else {
            // Si no se encuentra el alojamiento, mostrar un mensaje de error
            System.out.println("No se encontró ningún alojamiento con el nombre '" + nombreAlojamiento + "'.");
        }
    }

}
