package Punto5;


/**
 * Write a description of class SemiExclusivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SemiExclusivo extends Cargo
{
    // instance variables
    private int horasDeInvestigacion;
    

    //Constructor
    public SemiExclusivo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDocencia, int p_horasDeInvestigacion)
    {
        super(p_nombreCargo, p_sueldoBasico, p_anioIngreso, p_horasDocencia);
        setHorasDeInvestigacion(p_horasDeInvestigacion);
        
       
    }
    //SETTERS
    private void setHorasDeInvestigacion(int p_horasDeInvestigacion){
        this.horasDeInvestigacion = p_horasDeInvestigacion;
    }
   
    //GETTERS
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
  
    

    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter Exclusivo---- " + "\n" + 
        "Horas investigación: " + getHorasDeInvestigacion());
    } 
}
