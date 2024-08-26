
/**
 * Clase ejecutable para probar la clase Punto.
 * 
 * @author Santi
 * @version 1.0
 */
public class PuntoEjecutable {
    public static void main(String[] args) {
        // Verificar que se pasen los argumentos necesarios
        if (args.length != 4) {
            System.out.println("Debe ingresar cuatro argumentos: x1, y1, x2, y2");
            return;
        }

        // Convertir los argumentos de String a double
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        // Crear los puntos utilizando los valores ingresados
        Punto punto1 = new Punto(x1, y1);
        Punto punto2 = new Punto(x2, y2);

        // Mostrar las coordenadas de los puntos
        System.out.println("Coordenadas del Punto 1: " + punto1.coordenadas());
        System.out.println("Coordenadas del Punto 2: " + punto2.coordenadas());

        // Calcular y mostrar la distancia entre los dos puntos
        double distancia = punto1.distanciaA(punto2);
        System.out.println("La distancia entre el Punto 1 y el Punto 2 es: " + distancia);
    }
}

