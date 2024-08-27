import java.util.Scanner;
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear un objeto Persona (titular de las cuentas)
        Persona titular = new Persona(43752065, "Santaigo Adrian", "Scetti", 2001); 
        
        // Crear una Caja de Ahorro y una Cuenta Corriente para el mismo titular
        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(2135, titular);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(1735, titular);
        
        // Realizar operaciones en la Caja de Ahorro
        System.out.println("Depósito en Caja de Ahorro: $1000");
        cajaDeAhorro.depositar(1000);
        
        System.out.println("Extracción en Caja de Ahorro: $500");
        cajaDeAhorro.extraer(500);
        
        System.out.println("Extracción en Caja de Ahorro: $600");
        cajaDeAhorro.extraer(600); // Debería fallar porque el saldo es insuficiente
        
        System.out.println("Extracción en Caja de Ahorro: $400");
        cajaDeAhorro.extraer(400); // Debería funcionar
        
        // Mostrar estado final de la Caja de Ahorro
        cajaDeAhorro.mostrar();
        
        // Realizar operaciones en la Cuenta Corriente
        System.out.println("\nDepósito en Cuenta Corriente: $2000");
        cuentaCorriente.depositar(2000);
        
        System.out.println("Extracción en Cuenta Corriente: $2500");
        cuentaCorriente.extraer(2500); // Debería funcionar porque tiene descubierto
        
        System.out.println("Extracción en Cuenta Corriente: $100");
        cuentaCorriente.extraer(100);
        
        // Mostrar estado final de la Cuenta Corriente
        cuentaCorriente.mostrar();
        
        scanner.close();
    }
}

