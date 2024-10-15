package Punto11;

/**
 * Write a description of class Premium here.
 *
 * @author santi
 * @version 1.0
 */
public class Premium extends Etiqueta {

    private int colores;

    public Premium(double p_costo, int p_colores) {
        super(p_costo);
        this.setColores(p_colores);
    }

    public int getColores() {
        return this.colores;
    }

    private void setColores(int p_colores) {
        this.colores = p_colores;
    }

    @Override
    public double precio(int q) {
        // Costo base más el adicional por colores, multiplicado por la cantidad
        double total = (this.getCosto() + this.adicional()) * q;
        return total;
    }

    public double adicional() {
        // Devuelve solo el valor adicional según los colores
        if (this.getColores() == 2) {
            return this.getCosto() * 0.05; // 5% adicional
        } else if (this.getColores() == 3) {
            return this.getCosto() * 0.07; // 7% adicional
        } else if (this.getColores() > 3) {
            return this.getCosto() * 0.03 * this.getColores(); // 3% adicional por cada color
        }
        return 0;
    }

    @Override
    public String toString() {
        return "tipo Premium - Costo: $" + this.getCosto() + " - Colores: " + this.getColores();
    }

    @Override
    public String tipo() {
        return "Premium";
    }

}
