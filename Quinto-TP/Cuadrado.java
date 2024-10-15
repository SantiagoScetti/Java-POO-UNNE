
/**
 * Write a description of class Cuadrado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cuadrado extends Rectangulo
{

    public Cuadrado(Punto p_origen, double p_lado){
        super(p_origen, p_lado, p_lado);
    }

    //cuadrado
    @Override
    public void caracteristicas() {
        
        // Imprimir la parte personalizada para el cuadrado
        System.out.println("Origen: " + super.getOrigen().coordenadas() + " - Lado: " + super.getAlto());

        // Llamar a la parte que deseas reutilizar de la clase Rectángulo
        System.out.printf("Superficie: %.2f - Perímetro: %.2f%n", super.superficie(), super.perimetro());
    }
}
