
import java.util.Scanner;


/**
 * Ejecutable del punto 1
 *
 * @author santi
 * @version 1.0
 */
public class ArrayDePuntos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Punto[] puntos = new Punto[6];  // Array para almacenar 6 puntos

        // Ciclo para pedir las coordenadas de los 6 puntos
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Ingrese las coordenadas del punto " + (i + 1) + " (X Y) 2 int separados por un espacio:");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            puntos[i] = new Punto(x, y);  // Crear un nuevo punto y almacenarlo en el array
        }

        // Mostrar las coordenadas de los puntos ingresados
        System.out.println("\nCoordenadas de los puntos ingresados:");
        for (int i = 0; i < puntos.length; i++) {
            puntos[i].mostrar();
        }

        // Mostrar las distancias cada 2 elementos
        System.out.println("\nlista de distancias:  ");
        for (int i = 0; i < (puntos.length - 1); i++) {
            System.out.println("Distancia de p" + i + 1 + " a p" + (i+2) + "  =  " + puntos[i].distanciaA(puntos[i + 1]));
        }

        scanner.close(); 
    }
}
