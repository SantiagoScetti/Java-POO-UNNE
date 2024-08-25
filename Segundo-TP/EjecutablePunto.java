
/**
 * Write a description of class EjecutablePunto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class EjecutablePunto
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor de X\n");
        
        double valor1 = scan.nextDouble();
         System.out.println("Ingrese el valor de Y\n");
        double valor2 = scan.nextDouble();
        Punto p1 = new Punto (valor1, valor2);
        p1.mostrar();
        
        System.out.println("Ingrese el valor para desplazar X \n");
        valor1 = scan.nextDouble();
        System.out.println("Ingrese el valor para desplazar Y \n");
        valor2 = scan.nextDouble();
        p1.desplazar(valor1, valor2);
        p1.mostrar();
    }
}

