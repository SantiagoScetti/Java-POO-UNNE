import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestEmpleadoConJefe {

    public static void main(String[] args) {
        // Crear instancias de EmpleadoConJefe
        Calendar fechaIngresoEmpleado1 = new GregorianCalendar(2015, Calendar.JANUARY, 10);
        Calendar fechaIngresoEmpleado2 = new GregorianCalendar(2020, Calendar.FEBRUARY, 15);
        
        EmpleadoConJefe jefe = new EmpleadoConJefe(20304050607L, "Perez", "Juan", 85000, fechaIngresoEmpleado1);
        EmpleadoConJefe empleado1 = new EmpleadoConJefe(10203040506L, "Gomez", "Ana", 60000, fechaIngresoEmpleado2, jefe);
        EmpleadoConJefe empleado2 = new EmpleadoConJefe(40506070809L, "Lopez", "Carlos", 55000, 2022);

        // Mostrar información de los empleados
        System.out.println("Información completa del Jefe:");
        jefe.mostrar();
        System.out.println();
        System.out.println("\nInformación completa del Empleado 1:");
        empleado1.mostrar();
        System.out.println();
        System.out.println("\nInformación completa del Empleado 2:");
        empleado2.mostrar();
        System.out.println();

        // Mostrar líneas resumidas
        System.out.println("\nLíneas resumidas:");
        System.out.println(empleado1.mostrarLinea());
        System.out.println(empleado2.mostrarLinea());
        System.out.println();

        // Emitir permiso de salida firmado por el jefe (si corresponde)
        System.out.println("\nPermiso de salida emitido:");
        emitirPermisoDeSalida(empleado1);
        emitirPermisoDeSalida(empleado2);
    }

    /**
     * Este método emite un permiso de salida para un empleado.
     * Si el empleado tiene un jefe, el permiso estará firmado por el jefe.
     * Si no tiene un jefe, indicará que es el Gerente General.
     */
    public static void emitirPermisoDeSalida(EmpleadoConJefe empleado) {
        System.out.printf("Permiso de salida para: %s\n", empleado.nomYApe());
        System.out.println("Firma:");

        if (empleado.getJefe() != null) {
            System.out.printf("Firmado por: %s\n", empleado.getJefe().nomYApe());
        } else {
            System.out.println("El GERENTE GENERAL");
        }
        System.out.println();
    }
}

