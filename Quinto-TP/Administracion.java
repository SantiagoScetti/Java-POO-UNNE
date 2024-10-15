import java.util.ArrayList;
/**
 * Ejecutable de la clase jardín
 * 
 * @author santi
 * @version 1.0
 */
public class Administracion
{
     public static void main(String[] args) {
        // Crear figuras geométricas
        FiguraGeometrica circulo = new Circulo(5);  // Círculo con radio 5
        FiguraGeometrica elipse = new Elipse(4, 2); // Elipse con semiejes 4 y 2
        FiguraGeometrica triangulo = new Triangulo(3, 6); // Triángulo con base 3 y altura 6
        FiguraGeometrica rectangulo = new Rectangulo(4, 8); // Rectángulo de 4x8
        FiguraGeometrica cuadrado = new Cuadrado(new Punto(1, 1), 5); // Cuadrado con lado 5

        // Crear un ArrayList de figuras geométricas
        ArrayList<FiguraGeometrica> listaFiguras = new ArrayList<>();
        listaFiguras.add(circulo);
        listaFiguras.add(elipse);
        listaFiguras.add(triangulo);
        listaFiguras.add(rectangulo);
        listaFiguras.add(cuadrado);

        // Crear un jardín con la lista de figuras
        Jardin miJardin = new Jardin("Mi Jardín", listaFiguras);

        // Mostrar los detalles del jardín y de las figuras
        miJardin.detalleFiguras();
    }
}
