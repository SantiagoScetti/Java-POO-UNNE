
/**
 * 
 * @author Scetti Santiago Adrain
 * @version 10/08/2024
 */

import java.util.Scanner;
public class OperarVector {
    public static void main(String[] args){
        
        //Crear un objeto Scanner para leer los valores ingresados por el usuario
        Scanner scanner = new Scanner(System.in);

        //Declarar un array para almacenar las 5 notas
        int[] notas = new int[5];

        //Leer las 5 notas desde el teclado
        System.out.println("Ingrese 5 notas de alumnos:");
        
            for (int i = 0; i < notas.length; i++) {
                System.out.print("Nota nro" + (i + 1) + ": ");
                notas[i] = scanner.nextInt();
            }

        //Calcular el promedio
        int suma = 0;
        int mayorNota = notas[0]; //Inicializar mayorNota con el primer elemento

            for (int nota : notas){ //Foreach para iterar por cada objeto de una coleccion
                suma += nota;
                if (nota > mayorNota) {
                    mayorNota = nota; //Actualizar mayorNota si se encuentra una nota mayor
                }
            }

        double promedio = (double) suma / notas.length;

        //Mostrar las notas pero tabeadas
        System.out.println("\nNotas ingresadas:");
        for (int nota : notas) {
            System.out.print(nota + "\t");
        }

        //Mostrar el promedio y la mayor nota
        System.out.println("\n\nPromedio de las notas: " + promedio);
        System.out.println("Mayor nota: " + mayorNota);

        //Cerrar el objeto Scanner
        scanner.close();
    }
}
