import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Ejecurable para el punto "7" del TP 3
 * 
 * @author Santiago
 * @version 1.0
 */

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos para la clase Persona
        System.out.print("Ingrese el número de DNI: ");
        int dni = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el dia de nacimiento: ");
        int dia = scanner.nextInt();
         System.out.print("Ingrese el mes de nacimiento: ");
        int mes = scanner.nextInt();
         System.out.print("Ingrese el año de nacimiento: ");
        int anio = scanner.nextInt();
    
        Calendar anioNacimiento = new GregorianCalendar(anio, mes-1, dia);
        //anioNacimiento.set(dia, mes, anio);
       
        // Ingreso de datos para la clase CuentaBancaria
        System.out.print("Ingrese el número de cuenta: ");
        int nroCuenta = scanner.nextInt();

        System.out.print("Ingrese el saldo inicial: ");
        double saldo = scanner.nextDouble();
        
         // Crear objeto Persona
        Persona titular = new Persona(dni, nombre, apellido, anioNacimiento);
        // Crear objeto CuentaBancaria
        CuentaBancaria cuentaBancaria = new CuentaBancaria(nroCuenta, titular, saldo);
        
        
        if (titular.esCumpleaños()){
            System.out.println("Feliz cumpleaños. Banco siempre con vos :)");
        }
        // Mostrar información de la cuenta bancaria
        cuentaBancaria.mostrar();

        scanner.close();
    }
}

