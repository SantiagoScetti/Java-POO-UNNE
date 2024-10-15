package Punto5;


import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Clase cargo que la imlementa la clase Profesor
 * 
 * @author santi 
 * @version 1.0
 */
public class Cargo
{
    // instance variables
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDocencia;
    //Constructors
    public Cargo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDocencia)
    {
        setNombreCargo(p_nombreCargo);
        setSueldoBasico(p_sueldoBasico);
        setAnioIngreso(p_anioIngreso);
        setHorasDocencia(p_horasDocencia);
    }
    //SETTERS
    private void setNombreCargo(String p_nombreCargo){
        this.nombreCargo = p_nombreCargo;
    }
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    private void setAnioIngreso(int p_anioIngreso){
        this.anioIngreso = p_anioIngreso;
    }
    private void setHorasDocencia(int p_horasDocencia){
        this.horasDocencia = p_horasDocencia;
    }
    //GETTERS
    public String getNombreCargo(){
        return this.nombreCargo;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }

    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    public int getHorasDocencia(){
        return this.horasDocencia;
    }

    //METODOS
    
    public int antiguedad()
    {
        Calendar fechahoy = new GregorianCalendar();
        int aniohoy = fechahoy.get(Calendar.YEAR);
        return aniohoy - this.getAnioIngreso(); 
    }

    private double adicionalXAntiguedad(){
        return 1 + ( 0.01 * this.antiguedad());
    }

    public double sueldoDelCargo(){
        return this.getSueldoBasico() * this.adicionalXAntiguedad();
    }
    public void mostrarCargo(){
        System.out.println(this.getNombreCargo() + "- Sueldo Basico:" + this.getSueldoBasico() + "- Sueldo Cargo:" + this.sueldoDelCargo());
        System.out.println("– Antiguedad: " + antiguedad() +  " años " +  " - Horas Docencia:" +  getHorasDocencia());
    }

}
