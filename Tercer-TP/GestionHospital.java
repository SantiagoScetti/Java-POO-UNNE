/**
 * Clase Ejecutora del punto 8
 *
 * @author Santiago
 * @version 1.0
 */
import java.util.Scanner;

public class GestionHospital {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ingresar datos del Paciente
        System.out.print("Ingrese el ID del paciente: ");
        int idPaciente = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del paciente: ");
        String nombrePaciente = scanner.nextLine();

        System.out.print("Ingrese la dirección del paciente: ");
        String direccionPaciente = scanner.nextLine();

        // Ingresar datos de la Localidad de Nacimiento
        System.out.print("Ingrese la ciudad de nacimiento del paciente: ");
        String ciudadNacimiento = scanner.nextLine();

        System.out.print("Ingrese la provincia de nacimiento del paciente: ");
        String provinciaNacimiento = scanner.nextLine();

        // Ingresar datos de la Localidad donde Vive
        System.out.print("Ingrese la ciudad donde vive el paciente: ");
        String ciudadVive = scanner.nextLine();

        System.out.print("Ingrese la provincia donde vive el paciente: ");
        String provinciaVive = scanner.nextLine();

        // Creando instancias de la clase Localidad
        Localidad localidadNacido = new Localidad(ciudadNacimiento, provinciaNacimiento);
        Localidad localidadVive = new Localidad(ciudadVive, provinciaVive);

        // Creando una instancia de la clase Paciente
        Paciente paciente = new Paciente(idPaciente, nombrePaciente, direccionPaciente, localidadNacido, localidadVive);

        // Ingresar datos del Hospital
        System.out.print("Ingrese el nombre del hospital: ");
        String nombreHospital = scanner.nextLine();

        System.out.print("Ingrese el nombre del director del hospital: ");
        String directorHospital = scanner.nextLine();

        // Creando una instancia de la clase Hospital
        Hospital hospital = new Hospital(nombreHospital, directorHospital);

        // Consultando datos filiatorios del paciente en el hospital
        hospital.consultaDatosFiliatorios(paciente);

        // Mostrando cadena de datos del paciente
        String cadenaDatos = paciente.cadenaDeDatos();
        System.out.println("Cadena de datos del paciente: " + cadenaDatos);
        
        scanner.close(); // Cerrar el Scanner al final
    }
}

