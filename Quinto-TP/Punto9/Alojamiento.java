package Punto9;
import java.util.ArrayList;

/**
 * Write a description of class Alojamiento here.
 *
 * @author Santi
 * @version 1.0
 */
public abstract class Alojamiento {

    // instance variables
    private String nombre;
    private double precioBase; //precio a abonar por cada día
    private int diasAlquiler;
    private ArrayList<Servicio> servicios; 

    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_servicios) {
        setNombre(p_nombre);
        setPrecio(p_precioBase);
        setDiasAlquiler(p_diasAlquiler);
        setServicios(p_servicios);
    }
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler, Servicio p_servicio) {
        setNombre(p_nombre);
        setPrecio(p_precioBase);
        setDiasAlquiler(p_diasAlquiler);
        setServicios(new ArrayList<>());
        agregarServicio(p_servicio);
    }
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler) {
        setNombre(p_nombre);
        setPrecio(p_precioBase);
        setDiasAlquiler(p_diasAlquiler);
       setServicios(new ArrayList<>());
    }

    //SETTERS
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setPrecio(double p_precioBase) {
        this.precioBase = p_precioBase;
    }
    private void setDiasAlquiler(int p_diasAlquiler) {
        this.diasAlquiler = p_diasAlquiler;
    }
    private void setServicios(ArrayList<Servicio> p_servicios){
        this.servicios = p_servicios;
    }
    //GETTERS
    public String getNombre() {
        return this.nombre;
    }
    public double getPrecio() {
        return this.precioBase;
    }
    public int getDiasAlquiler() {
        return this.diasAlquiler;
    }
    public ArrayList<Servicio> getServicios(){
        return this.servicios;
    }
    //ADDS
    public boolean agregarServicio(Servicio p_servicio){
        return this.getServicios().add(p_servicio);
    }
    public boolean quitarServicio(Servicio p_servicio){
        return this.getServicios().remove(p_servicio);
    }


    //METODOS
    abstract public  int  contar(String p_alojamiento);

    public double costo(){ //El costo del alojamiento se calcula en función del precio base y la cantidad de días de alquiler
        return this.getPrecio() * this.getDiasAlquiler();
    }

    public double costoServicios(){
        double total = 0;
        for (Servicio unServi : this.getServicios()) {
            total += unServi.getPrecio();
        }
        return total;
    }

    public void listarServicios(){
        for (Servicio unServi : this.getServicios()) {
            System.out.println(unServi.getDescripcion() + ": $" + unServi.getPrecio());
        }
    }
    
    public void liquidar(){
        System.out.println(" ");
        System.out.println("Alojamiento: " + this.getNombre());
        System.out.println("Costo por " + this.getDiasAlquiler() +" días de alquiler" + ": $" + this.costo());
        this.listarServicios();
    }

}
