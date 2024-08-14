
/**
 * Ejercicio 2
 * 
 * @author Santiago
 * @version 1.0
 */

public class Multiplo {
    public static void main(String[] args) {
        // Mostrar múltiplos de 4 desde 42 hasta 150 inclusive
        for (int i = 42; i <= 150; i++) {
            // Cada vez que el valor sea divisible por 4
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
