package Punto9;

/**
 * 
 * @author Santi
 * @version 1.0
 *
 **/
public class Servicio {

    // instance variables
    private String descripcion;
    private double precio;

    public Servicio(String p_descripcion,  double p_precio) {
        setDescripcion(p_descripcion);
        setPrecio(p_precio);
    }

    //GETTERS
    private void setDescripcion(String p_descripcion) {
        this.descripcion = p_descripcion;
    }
    private void setPrecio(double p_precio) {
        this.precio = p_precio;
    }
    //SETTERS
    public String getDescripcion() {
        return this.descripcion;
    }
    public double getPrecio() {
        return this.precio;
    }
}