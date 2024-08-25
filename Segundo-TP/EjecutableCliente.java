
/**
 * La clase {@code EjecutableCliente} contiene el método {@code main} que
 * demuestra el uso de la clase {@code Cliente}. Los datos de los clientes se
 * ingresan como argumentos del método {@code main}.
 *
 * @author Santi
 * @version 1.0
 */

public class EjecutableCliente {

    /**
     * El método principal que se ejecuta al iniciar el programa. Los datos de
     * los clientes se toman de los argumentos de línea de comandos.
     *
     * @param args Argumentos de línea de comandos donde cada cliente se define
     * con: DNI, nombre, apellido, saldo inicial.
     */
    public static void main(String[] args) {

        if (args.length < 8) {
            System.out.println("Uso: java EjecutableCliente <DNI1> <Nombre1> <Apellido1> <SaldoInicial1> <DNI2> <Nombre2> <Apellido2> <SaldoInicial2>");
            return;
        }

        // Leer datos del primer cliente
        int dni1 = Integer.parseInt(args[0]);
        String nombre1 = args[1];
        String apellido1 = args[2];
        double saldoInicial1 = Double.parseDouble(args[3]);

        // Crear el primer cliente
        Cliente c1 = new Cliente(dni1, nombre1, apellido1, saldoInicial1);

        // Mostrar la información del primer cliente
        c1.mostrar();
        // Agregar saldo al primer cliente
        c1.agregaSaldo(1000.00);
        // Asignar un nuevo saldo al primer cliente
        c1.nuevoSaldo(500000.00);
        // Mostrar la información actualizada del primer cliente
        c1.mostrar();

        // Separar los dos clientes
        System.out.println();
        System.out.println();

        // Leer datos del segundo cliente
        int dni2 = Integer.parseInt(args[4]);
        String nombre2 = args[5];
        String apellido2 = args[6];
        double saldoInicial2 = Double.parseDouble(args[7]);

        // Crear el segundo cliente
        Cliente c2 = new Cliente(dni2, nombre2, apellido2, saldoInicial2);

        // Mostrar la información del segundo cliente
        c2.mostrar();
        c2.agregaSaldo(2500.00);
        c2.nuevoSaldo(120000.00);
        c2.mostrar();

    }
}

//java EjecutableCliente 44280211 Varela Franco 100000.50 43752065 Scetti Santiago 75000.00
