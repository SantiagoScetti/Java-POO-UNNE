/**
 * Clase Rectangulo Reutilizada del 3er TP
 * 
 * @author Santi
 * @version 1.0
 */
public class Rectangulo extends FiguraGeometrica
{
    // Variables de instancia
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
        super(p_origen);
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
        super(new Punto(0, 0));
        setAncho(p_ancho);
        setAlto(p_alto);
    }


   // setters
    
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }

    //getters
    public double getAncho(){
        return this.ancho;
    } 
    public double getAlto(){
        return this.alto;
    }


    public String nombreFigura(){
        return "*** " + this.getClass().getName() + " ***";
    }


    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    }

    /**
     * Muestra las características del rectángulo.
     */
    public void caracteristicas() {
        System.out.println(this.nombreFigura());
        System.out.println("Origen: " + this.getOrigen().coordenadas() + " - Alto: " + this.getAlto() + " - Ancho: " + this.getAncho());
        System.out.printf("Superficie: %.2f - Perímetro: %.2f%n", this.superficie(), this.perimetro());
    }

    /**
     * Calcula el perímetro
     * 
     * @return El perímetro del rectángulo.
     */
    public double perimetro() {
        return 2 * (this.getAncho() + this.getAlto());
    }
    /**
     * Calcula 
     * 
     * @return La superficie del rectángulo.
     */
    @Override
    public double superficie() {
        return this.getAncho() * this.getAlto();
    }
    
    /**
     * Calcula la distancia entre los orígenes de dos rectángulos.
     * 
     * @param otroRectangulo El otro rectángulo para calcular la distancia.
     * @return La distancia entre los orígenes de los dos rectángulos.
     */
    public double distanciaA(Rectangulo otroRectangulo) {
        return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
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
