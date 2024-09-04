
/**
 * punto 8
 * 
 *   Viene del TP-3
 * 
 * @author Santi & Franco 
 * @version 1.0
 */
public class Localidad
{
    // instance variables
    private String nombre;
    private String provincia;
    /**
     * Constructor for objects of class Localidad
     */
    public Localidad(String p_nombre, String p_provincia) {
        setNombre(p_nombre);
        setProvincia(p_provincia);
    }
    

    //SETTERS
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }

    //GETTERS
    public String getNombre(){
        return this.nombre; 
    }
    public String getProvincia(){
        return this.provincia; 
    }

    public String mostrar()
    {
        return ("Localidad: " + getNombre() + "--" + "Provincia: " + getProvincia());
    }
}
