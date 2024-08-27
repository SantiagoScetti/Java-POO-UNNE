
/**
 * Ejercicio 7
 * 
 * @author Santiago
 * @version 1.0
 */

import java.util.Scanner;

public class Circunferenciamodificada
{
       public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        String continuar = "s"; // Variable para controlar si el usuario quiere continuar

        while (continuar.equals("s")) { // Mientras el usuario ingrese "s"
            System.out.print("Ingrese el radio de la circunferencia: ");
            double radio = teclado.nextDouble(); // Leer el radio como un double

            // Calcular el perímetro (2 * π * radio)
            double perimetro = 2 * Math.PI * radio;

            // Mostrar el resultado
            System.out.println("El perímetro de la circunferencia es: " + perimetro);

            // Preguntar al usuario si desea calcular otro perímetro
            System.out.print("¿Desea calcular el perímetro de otra circunferencia? (s/n): ");
            continuar = teclado.next(); // Leer la respuesta del usuario
        }

        System.out.println("Finalizando...");
        teclado.close(); // Cerrar el Scanner
    } 
}
