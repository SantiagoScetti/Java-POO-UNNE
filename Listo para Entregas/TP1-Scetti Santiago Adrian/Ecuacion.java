
/**
 * Ejercicio 5
 * 
 * @author Santiago
 * @version 1.1
 */
public class Ecuacion {
    public static void main(String[] args) {
        // Verificar que se ingresen tres argumentos
        if (args.length == 3) {
    
            // Convertir los argumentos de String a double
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);

            // Calcular el discriminante
            double discriminante = Math.pow(b, 2) - 4 * a * c; // Math.pow(b, 2); significa b elevado a la 2ª potencia

            // Evaluar el discriminante para determinar las raíces
            if (discriminante > 0) {
                // Dos raíces reales diferentes
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a); // Math.sqrt(discriminante) significa: La raíz cuadrada de la discriminante 
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Las raíces son reales y diferentes:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
                } else if (discriminante == 0) {
                    // Una raíz real doble
                    double x = -b / (2 * a);
                    System.out.println("Las raíces son reales e iguales:");
                    System.out.println("x1 = x2 = " + x);
                } else {
                    // Solución compleja
                    System.out.println("El discriminante es negativo, las soluciones son números imaginarios.");
                }
           
        } else {
            System.out.println("Por favor, ingresa exactamente tres argumentos para los coeficientes a, b, y c.");
        }
    }
}
