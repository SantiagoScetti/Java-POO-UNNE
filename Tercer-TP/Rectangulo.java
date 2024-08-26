/**
 * Clase Rectangulo que representa un rectángulo en un plano cartesiano.
 * 
 * @author Santi
 * @version 1.0
 */
public class Rectangulo
{
    // Variables de instancia
    private Punto origen; // esquina inferior izquierda
    private double ancho;
    private double alto;

     /**
     * Constructor que crea un rectángulo en una posición específica.
     * 
     * @param p_origen El punto que representa el origen (esquina inferior izquierda) del rectángulo.
     * @param p_ancho El ancho del rectángulo.
     * @param p_alto El alto del rectángulo.
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto) {
        setOrigen(p_origen);
        setAncho(p_ancho);
        setAlto(p_alto);
    }

     /**
     * Constructor que crea un rectángulo en el origen (0,0) con las dimensiones dadas.
     * 
     * @param p_ancho El ancho del rectángulo.
     * @param p_alto El alto del rectángulo.
     */
    public Rectangulo(double p_ancho, double p_alto) {
        this(new Punto(0, 0), p_ancho, p_alto);
    }


   // setters
    private void setOrigen(Punto p_origen){
        origen = p_origen;
    }
    private void setAncho(double p_ancho){
        ancho = p_ancho;
    }
    private void setAlto(double p_alto){
        alto = p_alto;
    }

    //getters
    public Punto getOrigen(){
        return this.origen;
    }
    public double getAncho(){
         return this.ancho;
    } 
    public double getAlto(){
         return this.alto;
    }


    public void desplazar(double p_dx, double p_dy){
        this.origen.desplazar(p_dx, p_dy);
    }

    /**
     * Muestra las características del rectángulo.
     */
    public void caracteristicas() {
        System.out.println("****** Rectangulo ******");
        System.out.println("Origen: " + this.origen.coordenadas() + " - Alto: " + this.alto + " - Ancho: " + this.ancho);
        System.out.println("Superficie: " + this.superficie() + " - Perímetro: " + this.perimetro());
    }

    /**
     * Calcula el perímetro
     * 
     * @return El perímetro del rectángulo.
     */
    public double perimetro() {
        return 2 * (this.ancho + this.alto);
    }
    /**
     * Calcula 
     * 
     * @return La superficie del rectángulo.
     */
    public double superficie() {
        return this.ancho * this.alto;
    }
    
    /**
     * Calcula la distancia entre los orígenes de dos rectángulos.
     * 
     * @param otroRectangulo El otro rectángulo para calcular la distancia.
     * @return La distancia entre los orígenes de los dos rectángulos.
     */
    public double distanciaA(Rectangulo otroRectangulo) {
        return this.origen.distanciaA(otroRectangulo.origen);
    }

    /**
     * Determina cuál de los dos rectángulos tiene mayor superficie.
     * 
     * @param otroRectangulo El otro rectángulo con el que se compara.
     * @return El rectángulo con mayor superficie.
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo) {
        if (this.superficie() > otroRectangulo.superficie()) {
            return this;
        } else {
            return otroRectangulo;
        }
    }

}
