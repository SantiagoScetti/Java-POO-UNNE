import java.util.Scanner;

/**
 * Write a description of class EjecutableFiguras here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EjecutableFiguras
{
    public static void main(String[] args) {
        // Crear puntos de origen para los rectángulos y cuadrados
        Punto origenRectangulo = new Punto(0, 0);
        Punto origenCuadrado = new Punto(5, 5);

        // Crear un rectángulo con dimensiones específicas
        Rectangulo rectangulo1 = new Rectangulo(origenRectangulo, 10, 5);
        System.out.println("Características del Rectángulo:");
        rectangulo1.caracteristicas(); // Mostrar características del rectángulo
        
        System.out.println(); // Separador entre figuras
        
        // Crear un cuadrado con lado específico
        Cuadrado cuadrado1 = new Cuadrado(origenCuadrado, 72.99);
        System.out.println("Características del Cuadrado:");
        cuadrado1.caracteristicas(); // Mostrar características del cuadrado

        // Desplazar el cuadrado
        System.out.println("\nDesplazando el cuadrado...");
        cuadrado1.desplazar(3, 4);
        cuadrado1.caracteristicas(); // Mostrar las características después de desplazar

        //---------------------------------------//

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
        System.out.println("Centro: " + circulo1.getOrigen().coordenadas());
        System.out.println("Radio: " + circulo1.getRadio());
        System.out.println("Perímetro: " + circulo1.perimetro());
        System.out.println("Superficie: " + circulo1.superficie());

        System.out.println("\nCaracterísticas del Segundo Círculo:");
        System.out.println("Centro: " + circulo2.getOrigen().coordenadas());
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
