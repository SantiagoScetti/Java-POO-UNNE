
/**
 * Write a description of class FiguraGeometrica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class FiguraGeometrica 
{
    // instance variables
    private Punto origen;

    //CONTRUCTORES
    public FiguraGeometrica(Punto p_origen)
    {
       setOrigen(p_origen);
    }
    
    // setters
    protected void setOrigen(Punto p_origen){
        origen = p_origen;
    }

    //getters
    public Punto getOrigen(){
        return this.origen;
    }

    //METODOS
    public abstract String nombreFigura();
    public abstract double superficie();

    public void mostrarSuperficie(){
    }
}
