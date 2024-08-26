import java.util.Scanner;

/**
 * Clase ejecutable para probar la clase Circulo
 * 
 * @author Santi y Franco
 * @version 1.0
 */
public class CirculoEjecutable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la coordenada x del centro del primer círculo: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y del centro del primer círculo: ");
        double y1 = scanner.nextDouble();
        System.out.print("Ingrese el radio del primer círculo: ");
        double radio1 = scanner.nextDouble();

        // Crear el primer círculo
        Punto centro1 = new Punto(x1, y1);
        Circulo circulo1 = new Circulo(radio1, centro1);

       
        System.out.print("Ingrese la coordenada x del centro del segundo círculo: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y del centro del segundo círculo: ");
        double y2 = scanner.nextDouble();

        System.out.print("Ingrese el radio del segundo círculo: ");
        double radio2 = scanner.nextDouble();

        // Crear el segundo círculo
        Punto centro2 = new Punto(x2, y2);
        Circulo circulo2 = new Circulo(radio2, centro2);

        // Mostrar las características de ambos círculos
        System.out.println("\nCaracterísticas del Primer Círculo:");
        System.out.println("Centro: " + circulo1.getCentro().coordenadas());
        System.out.println("Radio: " + circulo1.getRadio());
        System.out.println("Perímetro: " + circulo1.perimetro());
        System.out.println("Superficie: " + circulo1.superficie());

        System.out.println("\nCaracterísticas del Segundo Círculo:");
        System.out.println("Centro: " + circulo2.getCentro().coordenadas());
        System.out.println("Radio: " + circulo2.getRadio());
        System.out.println("Perímetro: " + circulo2.perimetro());
        System.out.println("Superficie: " + circulo2.superficie());

        // Calcular y mostrar la distancia entre los centros de ambos círculos
        double distancia = circulo1.distanciaA(circulo2);
        System.out.println("\nLa distancia entre los centros de los dos círculos es: " + distancia);

        // Determinar cuál de los dos círculos tiene mayor superficie
        Circulo mayorCirculo = circulo1.elMayor(circulo2);
        System.out.println("El círculo con mayor superficie el que tiene un radio de: " + mayorCirculo.getRadio());

        scanner.close();
    }
}
