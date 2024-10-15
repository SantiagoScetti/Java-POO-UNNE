package Punto9;
import java.util.ArrayList;

/**
 * 
 * @author Santi
 * @version 1.0
 */
public class Cabaña extends Alojamiento
{
    // instance variables 
    private int nroHabitaciones;

    /**
     * Constructor for objects of class Cabaña
     */
    public Cabaña(String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_servicios, int p_nroHabitaciones)
    {
        super(p_nombre, p_precioBase, p_diasAlquiler , p_servicios);
        setNroHabitaciones(p_nroHabitaciones);
    }
    public Cabaña(String p_nombre, double p_precioBase, int p_diasAlquiler, Servicio p_servicio, int p_nroHabitaciones)
    {
        super(p_nombre, p_precioBase, p_diasAlquiler , p_servicio);
        setNroHabitaciones(p_nroHabitaciones);
    }
    public Cabaña(String p_nombre, double p_precioBase, int p_diasAlquiler,  int p_nroHabitaciones)
    {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        setNroHabitaciones(p_nroHabitaciones);
    }

    //SETTERS
    private void setNroHabitaciones(int p_nroHabitaciones){
        this.nroHabitaciones = p_nroHabitaciones;
    }   
    //GETTERS
    public int getNroHabitaciones(){
        return this.nroHabitaciones;
    }

    //METODOS
    @Override
    public int contar(String p_alojamiento) {
        if (p_alojamiento.equals("Cabaña")) {
            return 1;  
        }
        return 0; 
    }


    
    @Override
    public double costo(){ 
        return  this.getDiasAlquiler() * (this.getPrecio() + this.getNroHabitaciones());
    }

    @Override
    public void liquidar(){
        super.liquidar();
        System.out.println("Cabaña con " + this.getNroHabitaciones() + " habitaciones");
        System.out.println("Total: ------> " + (this.costo() + this.costoServicios()));
        System.out.println(" ");

    }
}
