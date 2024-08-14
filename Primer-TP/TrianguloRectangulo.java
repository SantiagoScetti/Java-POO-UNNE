
/**
 * Ejercicio 6
 * 
 * @author Santiago
 * @version 1.0
 */

public class TrianguloRectangulo {
    public static void main(String[] args) {
        // Verificar que se ingresen tres argumentos
        if (args.length == 3) {
            // Convertir los argumentos de String a double
            double lado1 = Double.parseDouble(args[0]);
            double lado2 = Double.parseDouble(args[1]);
            double lado3 = Double.parseDouble(args[2]);

            // Determinar cuál es el mayor para considerarlo como la hipotenusa
            double hipotenusa;
            double cateto1;
            double cateto2;

            if (lado1 > lado2 && lado1 > lado3) {
                hipotenusa = lado1;
                cateto1 = lado2;
                cateto2 = lado3;
            } else if (lado2 > lado1 && lado2 > lado3) {
                hipotenusa = lado2;
                cateto1 = lado1;
                cateto2 = lado3;
            } else {
                hipotenusa = lado3;
                cateto1 = lado1;
                cateto2 = lado2;
            }

            // Verificar si es un triángulo rectángulo utilizando el Teorema de Pitágoras
            if (Math.pow(hipotenusa, 2) == Math.pow(cateto1, 2) + Math.pow(cateto2, 2)) {
                System.out.println("El triángulo es rectángulo.");
            } else {
                System.out.println("El triángulo NO es rectángulo.");
            }
        } else {
            System.out.println("Por favor, ingresa exactamente tres argumentos para los lados del triángulo.");
        }
    }
}
    