import java.util.ArrayList;
/**
 * Clase Ejecutable para el Punto 3 del TP-4
 * 
 * @author santi
 * @version 1.0
 */
public class AplicacionBanco {
    public static void main(String[] args) {
        // Crear empleados
        Empleado empleado1 = new Empleado(27267504235L, "Perez", "Lorena", 121200.0, 2020);
        Empleado empleado2 = new Empleado(20159462638L, "Dominguez", "Pedro", 265000.4, 2018);
        
        // Crear una lista de empleados
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        
        // Crear la localidad
        Localidad localidad = new Localidad("Corrientes", "Corrientes");
        
        // Crear el banco
        Banco banco = new Banco("RIO", localidad, 3, listaEmpleados);
        
        // Crear personas
        Persona persona1 = new Persona(4445558, "santi","scetti", 2001);
        Persona persona2 = new Persona(4588756, "franco","varela", 2002);
        
        // Crear cuentas bancarias
        CuentaBancaria cuenta1 = new CuentaBancaria(12387, persona1,15000);
        CuentaBancaria cuenta2 = new CuentaBancaria(23196, persona2);
        
        // Agregar cuentas bancarias al banco
        banco.agregarCuentaBancaria(cuenta1);
        banco.agregarCuentaBancaria(cuenta2);
        
        // Mostrar la información del banco y los sueldos
        banco.mostrarResumen();
        
        ArrayList<CuentaBancaria> cuentasBc = new ArrayList<>();
        cuentasBc.add(cuenta1);
        cuentasBc.add(cuenta2);
        
        Banco banco2 = new Banco("Laguna", localidad, 1, listaEmpleados, cuentasBc);
        banco2.mostrarResumen();
    }
}
