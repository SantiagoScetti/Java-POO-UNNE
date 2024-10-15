
/**
 * @author santi
 * @version 1.0
 */
public class Triangulo extends FiguraGeometrica {
    // instance variables
    private double base;
    private double altura;

    /**
     * Constructor for objects of class Triangulo
     */
    public Triangulo(double p_base, double p_altura, Punto p_origen) {
        super(p_origen);
        setBase(p_base);
        setAltura(p_altura);
    }

    public Triangulo(double p_base, double p_altura) {
        super(new Punto(0, 0));
        setBase(p_base);
        setAltura(p_altura);
    }

    // SETTERS
    private void setBase(double p_base) {
        this.base = p_base;
    }

    private void setAltura(double p_altura) {
        this.altura = p_altura;
    }
    // GETTERS
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    // METODOS
    public String nombreFigura() {
        return "*** " + this.getClass().getName() + " ***";
    }

    public double superficie() {
        return (base * altura) / 2;
    }
}
