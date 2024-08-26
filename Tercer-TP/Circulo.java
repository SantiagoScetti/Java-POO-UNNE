
/**
 * Punto 3
 *
 * @author Santi y Franco
 * @version 1.0
 */
public class Circulo {

    // variables de instancia
    private double radio;
    private Punto centro;

    /**
     * Constructores
     */
    public Circulo(double p_radio, Punto p_centro) {
        // inicializar variables de instancia
        setRadio(p_radio);
        setCentro(p_centro);
    }

    public Circulo() {
        setCirculo0();
    }

    //settes
    private void setCentro(Punto p_centro) {
        this.centro = p_centro;
    }

    private void setRadio(double p_radio) {
        this.radio = p_radio;
    }

    private void setCirculo0() {
        this.radio = 0;
        this.centro = new Punto(0, 0);
    }

    /**
     * getters
     */
    public Punto getCentro() {
        return this.centro;
    }

    public double getRadio() {
        return this.radio;
    }

    /**
     * Métodos
     */
    public void desplazar(double p_dx, double p_dy) {
        Punto newCentro = new Punto(p_dx, p_dy);
        this.centro = newCentro;
    }

    public void caracteristicas() {
        System.out.println("");
    }

    public double perimetro() {
        return 2 * 3.14 * radio;
    }

    public double superficie() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double distanciaA(Circulo otroCirculo) {
        return this.centro.distanciaA(otroCirculo.centro);
    }

    public Circulo elMayor(Circulo otroCirculo) {
        if (this.superficie() < otroCirculo.superficie()) {
            return otroCirculo;
        }
        return this;
    }

}
