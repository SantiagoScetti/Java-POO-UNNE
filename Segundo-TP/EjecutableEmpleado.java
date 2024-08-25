
import java.util.Scanner;

public class EjecutableEmpleado {

    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el CUIL\n");
        long nroCuil = scan.nextLong();
        System.out.println("Ingrese el Apellido\n");
        String apellido = scan.next();
        System.out.println("Ingrese el Nombre\n");
        String nombre = scan.next();
        System.out.println("Ingrese el sueldo\n");
        double sueldo = scan.nextDouble();
        System.out.println("Ingrese el año\n");
        int year = scan.nextInt();
        Empleado e1 = new Empleado(nroCuil, apellido, nombre, sueldo, year);
        e1.mostrar();
        System.out.println("-----------------");
        System.out.println("" + e1.mostrarLinea());
        System.out.println("-----------------");
        System.out.println("" + e1.getSueldoBasico());
    }
}