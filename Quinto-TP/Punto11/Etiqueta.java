package Punto11;

/**
 *
 * @author franco
 * @version 1.0
 */
public abstract class Etiqueta {

    private double costo;

    public Etiqueta(double p_costo) {
        this.setCosto(p_costo);
    }
    //GETTER
    public double getCosto() {
        return this.costo;
    }
    //SETTER
    private void setCosto(double p_costo) {
        this.costo = p_costo;
    }

    //metodos
    public abstract double precio(int q);

    @Override
    public String toString() {
        return "tipo " + tipo() + " - Costo: $" + costo;
    }

    public abstract String tipo();
}
