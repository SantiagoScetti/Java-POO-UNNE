
/**
 * Write a description of class Rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangulo
{
    // instance variables
    private Punto origen;
    private double ancho;
    private double alto;

    /**
     * Constructor for objects of class Rectangulo
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        setOrigen(p_origen);
        setAnchoo(p_ancho);
        setAltoo(p_alto);
    }
    public Rectangulo(double p_ancho, double p_alto){

    }


   // getters
    private void setOrigen(Punto p_origen){
        origen = p_origen;
    }
    private void setAnchoo(double p_ancho){
        ancho = p_ancho;
    }
    
    private void setAltoo(double p_alto){
        alto = p_alto;
    }

   /**
     * Setters
     */
}
