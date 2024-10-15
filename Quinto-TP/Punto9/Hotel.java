package Punto9;

import java.util.ArrayList;


/**
 * Write a description of class Hotel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hotel extends Alojamiento
{
    // instance variables - replace the example below with your own
    private String tipoHabitacion;

    
    public Hotel(String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_servicios, String p_tipoHabitacion)
    {
        super(p_nombre, p_precioBase, p_diasAlquiler , p_servicios);
        setTipoHabitacion(p_tipoHabitacion);
    }
    public Hotel(String p_nombre, double p_precioBase, int p_diasAlquiler, Servicio p_servicio, String p_tipoHabitacion)
    {
        super(p_nombre, p_precioBase, p_diasAlquiler , p_servicio);
        setTipoHabitacion(p_tipoHabitacion);
    }
    public Hotel(String p_nombre, double p_precioBase, int p_diasAlquiler, String p_tipoHabitacion)
    {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        setTipoHabitacion(p_tipoHabitacion);
    }

    //SETTERS
    private void setTipoHabitacion(String p_tipoHabitacion){
        this.tipoHabitacion = p_tipoHabitacion;
    }
    //GETTERS   
    public String getTipoHabitacion(){
        return this.tipoHabitacion;
    }


    //METODOS
    @Override
    public int contar(String p_alojamiento) {
        if (p_alojamiento.equals("Hotel")) {
            return 1; 
        }
        return 0;  
    }

    @Override
    public double costo(){
        double precioDia = (this.tipoHabitacion.equals("Single") ? 20 : 35) + this.getPrecio();
        return precioDia * this.getDiasAlquiler();
    }

    @Override
    public void liquidar() {
        super.liquidar();
        System.out.println("Habitacion " + this.getTipoHabitacion());
        System.out.println("Total: ------> $" + (this.costo() + this.costoServicios()) );
        System.out.println(" ");
    }

}
