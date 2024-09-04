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
        
        // Mostrar la información del banco y los sueldos
        banco.mostrar();
    }
}
