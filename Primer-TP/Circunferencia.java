
/**
 * Ejercicio 3
 * 
 * @author Santiago
 * @version 1.0
 */
public class Circunferencia {
    
    public static void main(String[] args) {
        // Verificar si se ingresó un argumento
        if (args.length > 0) {
            try {
                // Convertir el argumento de String a int
                int radio = Integer.parseInt(args[0]);

                // Calcular el perímetro de la circunferencia
                double perimetro = 2 * Math.PI * radio;

                // Mostrar el resultado
                System.out.println("El perímetro de la circunferencia con radio " + radio + " es: " + perimetro);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un valor numérico válido para el radio.");
            }
        } else {
            System.out.println("Por favor, ingresa el radio de la circunferencia como argumento.");
        }
    }
}
