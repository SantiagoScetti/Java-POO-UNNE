/**
 * 
 * @author Santiago 
 * @version 10/08/2024
 */
import java.util.Scanner;

public class OrdenVector {
    public static void main(String[] args) {
        
        //Crear un objeto Scanner para leer los valores ingresados por el usuario
        Scanner scanner = new Scanner(System.in);

        //Declarar un array para almacenar los 4 elementos de tipo double
        double[] elementos = new double[4];

        //Leer los 4 elementos desde el teclado
        System.out.println("ingrese 4 elementos:");
        for (int i = 0; i < elementos.length; i++) {
            System.out.print("elemento " + (i + 1) + ": ");
            elementos[i] = scanner.nextDouble();
        }

        //Determinar el menor elemento
        double menor = elementos[0]; //Inicializar con el primer elemento
        for (int i = 1; i < elementos.length; i++) {
            if (elementos[i] < menor) {
                menor = elementos[i];
            }
        }

        //Mostrar el menor elemento
        System.out.println("El menor elemento es: " + menor);

        //Ordenar los elementos utilizando el método de la burbuja
        for (int i = 0; i < elementos.length - 1; i++) {
            for (int j = 0; j < elementos.length - 1 - i; j++) {
                if (elementos[j] > elementos[j + 1]) {
                    //Intercambiar elementos[j] y elementos[j + 1]
                    double temp = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = temp;
                }
            }
        }

        //Mostrar los elementos oredenados y tabeados
        System.out.println("Elementos ordenados de menor a mayor:");
        for (double elemento : elementos) {
            System.out.print(elemento + "\t");
        }

        //Cerrar el objeto Scanner
        scanner.close();
    }
}