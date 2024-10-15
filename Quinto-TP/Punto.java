
/**
 * Ejercicio 2 (Punto) DEL TP3
 * 
 * @author Santi
 * @version 3.0
 */
public class Punto {
    // instance variables
    private double x;
    private double y;

    /**
     * Constructores de la clase Punto
     */
    public Punto() {
        setX(0.0);
        setY(0.0);
    }

    public Punto(double p_x, double p_y) {
        // initialise instance variables
        setX(p_x);
        setY(p_y);
    }

    // Setters
    private void setX(double p_x) {
        this.x = p_x;
    }

    private void setY(double p_y) {
        this.y = p_y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /**
     * METODOS
     */
    public void desplazar(double p_dx, double p_dy) {
        this.setX(p_dx);
        this.setY(p_dy);
    }

    public void mostrar() {
        System.out.println("Punto. X: " + this.getX() + " Y: " + this.getY());
    }

    public String coordenadas() {
        return ("(" + this.getX() + " , " + this.getY() + ")");
    }

    public double distanciaA(Punto p_ptoDistante) {
        double x1 = this.getX();
        double x2 = p_ptoDistante.getX();
        double y1 = this.getY();
        double y2 = p_ptoDistante.getY();

        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
