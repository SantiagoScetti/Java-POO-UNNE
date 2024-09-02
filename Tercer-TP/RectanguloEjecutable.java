import java.util.Scanner;

/**
 * Ejecutable de Rectángulo
 * 
 * @author Santi
 * @version 1.0
 */
public class RectanguloEjecutable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos para el primer rectángulo
        System.out.println("Ingrese los datos del primer rectángulo:");
        System.out.print("Ingrese el origen (x y) separado por un espacio: ");
        double origenX1 = scanner.nextDouble();
        double origenY1 = scanner.nextDouble();
        Punto origen1 = new Punto(origenX1, origenY1);

        System.out.print("Ingrese el ancho: ");
        double ancho1 = scanner.nextDouble();

        System.out.print("Ingrese el alto: ");
        double alto1 = scanner.nextDouble();

        // Crear el primer rectángulo
        Rectangulo rectangulo1 = new Rectangulo(origen1, ancho1, alto1);

        // Ingreso de datos para el segundo rectángulo
        System.out.println("\nIngrese los datos del segundo rectángulo:");
        System.out.print("Ingrese el origen (x y) separado por un espacio: ");
        double origenX2 = scanner.nextDouble();
        double origenY2 = scanner.nextDouble();
        Punto origen2 = new Punto(origenX2, origenY2);

        System.out.print("Ingrese el ancho: ");
        double ancho2 = scanner.nextDouble();

        System.out.print("Ingrese el alto: ");
        double alto2 = scanner.nextDouble();

        // Crear el segundo rectángulo
        Rectangulo rectangulo2 = new Rectangulo(origen2, ancho2, alto2);

        // Mostrar las características de ambos rectángulos
        System.out.println("\nCaracterísticas del primer rectángulo:");
        rectangulo1.caracteristicas();

        System.out.println("\nCaracterísticas del segundo rectángulo:");
        rectangulo2.caracteristicas();

        // Calcular y mostrar la distancia entre los orígenes de los dos rectángulos
        double distancia = rectangulo1.distanciaA(rectangulo2);
        System.out.printf("\nDistancia entre los orígenes de los rectángulos: %.2f\n", distancia);

        // Determinar y mostrar cuál de los dos rectángulos tiene mayor superficie
        Rectangulo mayorRectangulo = rectangulo1.elMayor(rectangulo2);
        System.out.println("\nEl rectángulo con mayor superficie es:");
        mayorRectangulo.caracteristicas();

        scanner.close(); // Cerrar el Scanner al final
    }
}

