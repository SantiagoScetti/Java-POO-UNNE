
/**
 * Write a description of class AplicacionBanco here.
 * 
 * @author Santi
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AplicacionBanco
{
    public static void main(String[] args) {

        // Creación de Localidad
        Localidad localidad = new Localidad("Corrientes", "Corrientes");

        // Creación de empleados
        Calendar fechaNacimiento1 = new GregorianCalendar(1985, Calendar.MARCH, 20);
        Calendar fechaIngreso1 = new GregorianCalendar(2010, Calendar.JANUARY, 10);
        Empleado empleado1 = new Empleado(20123456789L, 12345678, "Gonzalez", "Juan", 50000, fechaNacimiento1, fechaIngreso1);

        Calendar fechaNacimiento2 = new GregorianCalendar(1990, Calendar.JUNE, 15);
        Calendar fechaIngreso2 = new GregorianCalendar(2015, Calendar.MARCH, 5);
        Empleado empleado2 = new Empleado(20234567890L, 23456789, "Perez", "Ana", 60000, fechaNacimiento2, fechaIngreso2);

        // Creación de la lista de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);

        // Creación del Banco
        Banco banco = new Banco("Banco Nacional", localidad, 123, empleados);

        // Mostrar información del banco y sus empleados
        banco.mostrar();

        // Creación de cuentas bancarias (Caja de Ahorro, Cuenta Corriente)
        CuentaBancaria cuenta1 = new CajaDeAhorro(1001, empleado1, 10000); // Ejemplo de Caja de Ahorro
        CuentaBancaria cuenta2 = new CuentaCorriente(1002, empleado2, 5000); // Ejemplo de Cuenta Corriente

        // Agregar cuentas al banco
        banco.agregarCuentaBancaria(cuenta1);
        banco.agregarCuentaBancaria(cuenta2);

        // Mostrar resumen del banco (cuentas activas, saldo cero, etc.)
        banco.mostrarResumen();

        // Listar cuentas con saldo cero
        banco.listarCuentasConSaldoCero();
    }
}
