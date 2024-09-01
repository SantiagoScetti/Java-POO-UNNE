
/**
 * Write a description of class Hospital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hospital
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String director;
    
    public Hospital(String p_nombre, String p_director){
        setNombre(p_nombre);
        setDirector(p_director);
    }
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setDirector(String p_director){
        this.director = p_director;
    }
    //getters
    public String getNombre(){
        return this.nombre;
    }
    public String getDirector(){
        return this.director;
    }
    
    public void consultaDatosFiliatorios(Paciente p_paciente)
    {
        System.out.println("Hospital: " + this.getNombre() + " Director: " + this.getDirector());
        p_paciente.mostrarDatosPantalla();
    }
}
