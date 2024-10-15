package Punto5;


/**
 * Write a description of class Exclusivo here.
 * 
 * @author Santi
 * @version 1.0
 */
public class Exclusivo extends Cargo
{
    // instance variables
    private int horasDeInvestigacion;
    private int horasDeExtension;

    //Constructor
    public Exclusivo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDocencia, int p_horasDeInvestigacion, int p_horasDeExtension)
    {
        super(p_nombreCargo, p_sueldoBasico, p_anioIngreso, p_horasDocencia);
        setHorasDeInvestigacion(p_horasDeInvestigacion);
        setHorasDeExtension(p_horasDeExtension);
       
    }
    //SETTERS
    private void setHorasDeInvestigacion(int p_horasDeInvestigacion){
        this.horasDeInvestigacion = p_horasDeInvestigacion;
    }
    private void setHorasDeExtension( int p_horasDeExtension){
        this.horasDeExtension = p_horasDeExtension;
    }
    //GETTERS
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    public int getHorasDeExtension(){
        return this.horasDeExtension;
    }
    

    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter Exclusivo---- " + "\n" + 
        "Horas investigación: " + getHorasDeInvestigacion() + "\n" +  
        "Horas extension: " + getHorasDeExtension());
    } 
    
}
