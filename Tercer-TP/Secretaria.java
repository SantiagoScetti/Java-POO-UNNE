import java.util.Scanner;
/**
 * TP3 Punto 6
 * 
 * @author santi
 * @version 1.0
 */

public class Secretaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos de la escuela
        System.out.print("Ingrese el nombre de la escuela: ");
        String nombreEscuela = scanner.nextLine();

        System.out.print("Ingrese el domicilio de la escuela: ");
        String domicilioEscuela = scanner.nextLine();

        System.out.print("Ingrese el nombre del director: ");
        String nombreDirector = scanner.nextLine();

        // Crear una instancia de Escuela
        Escuela escuela = new Escuela(nombreEscuela, domicilioEscuela, nombreDirector);

        // Ingresar datos del docente
        System.out.print("Ingrese el nombre del docente: ");
        String nombreDocente = scanner.nextLine();

        System.out.print("Ingrese el grado del docente: ");
        String gradoDocente = scanner.nextLine();

        System.out.print("Ingrese el sueldo básico del docente: ");
        double sueldoBasico = scanner.nextDouble();

        System.out.print("Ingrese la asignación familiar del docente: ");
        double asignacionFamiliar = scanner.nextDouble();

        // Crear una instancia de Docente
        Docente docente = new Docente(nombreDocente, gradoDocente, sueldoBasico, asignacionFamiliar);

        // Emitir el recibo
        escuela.imprimirRecibo(docente);
    }
}

