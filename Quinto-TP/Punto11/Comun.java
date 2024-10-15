package Punto11;

/**
 * Write a description of class Comun here.
 *
 * @author franco
 * @version 1.0
 */
public class Comun extends Etiqueta {

    private double plus;

    public Comun(double p_costo, int p_Plus) {
        super(p_costo);
        this.setPlus(p_Plus);
    }

    public double getPlus() {
        return this.plus;
    }

    private void setPlus(double p_plus) {
        this.plus = p_plus;
    }

    private double descuento(int q) {

        if (q >= 12 && q < 50) {
            return this.getCosto() * q * 0.98; // 2% de descuento
        } else if (q >= 50 && q < 100) {
            return this.getCosto() * q * 0.95; // 5% de descuento
        } else if (q >= 100) {
            return this.getCosto() * q * 0.9; // 10% de descuento
        }
        return this.getCosto() * q;

    }

    @Override
    public double precio(int q) {
        return this.descuento(q) + this.getPlus(); //ocupo el metodo de descuento para obtener el total directamnte más plus
    }

    @Override
    public String toString() {
        return "tipo Común - Costo: $" + this.getCosto() + " - Diseño: $" + this.getPlus();
    }

    @Override
    public String tipo() {
        return "Común";
    }

}
