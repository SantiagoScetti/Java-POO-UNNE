package Punto11;

/**
 * Write a description of class Renglon here.
 *
 * @author santi y franco
 * @version (a version number or a date) 1.0
 */
public class Renglon {

    // instance variables - replace the example below with your own
    private int cantidad;
    private double importe;
    private Etiqueta item;

    /**
     * Constructor for objects of class Renglon
     */
    public Renglon(int p_cantidad, double p_importe, Etiqueta p_etiqueta) {
        this.setImporte(p_importe);
        this.setCantidad(p_cantidad);
        this.setEtiqueta(p_etiqueta);
    }

    //SETTERS
    private void setImporte(double p_importe) {
        this.importe = p_importe;
    }

    private void setCantidad(int p_cantidad) {
        this.cantidad = p_cantidad;
    }

    private void setEtiqueta(Etiqueta p_etiqueta) {
        this.item = p_etiqueta;
    }

    //GETTERS
    public int getCantidad() {
        return this.cantidad;
    }

    public double getImporte() {
        return this.importe;
    }

    public Etiqueta getItem() {
        return this.item;
    }

    //METODOS
    public void mostrar() {
        System.out.println(this.getCantidad() + " Etiquetas de " + this.getItem().toString());
        System.out.println("Precio: $ " + this.getImporte());
    }
}
