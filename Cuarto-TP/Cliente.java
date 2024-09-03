
/**
 * Punto 2 TP4
 * 
 * @author santi
 * @version 1.0
 */
public class Cliente
{
    // instance variables
    private String nombre;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String p_nombre)
    {
        this.setNombre(p_nombre);
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    

}
