
/**
 * Write a description of class PuntoTP3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto
{
    // instance variables 
    private double x;
    private double y;

    /**
     * Constructores de la clase Punto
     */
    public Punto(){
        setX(0.0);
        setY(0.0);
    }
    public Punto(double p_x, double p_y){
        // initialise instance variables
        setX(p_x);
        setY(p_y);
    }
    
    //Setters
    private void setX(double p_x)
    {
        this.x = p_x;
    }
    private void setY(double p_y)
    {
         this.y = p_y;
    }
    
    //Getters
    public double getX()
    {
        return x;        
    }
    public double getY()
    {
         return y;   
    }

    /**
     * METODOS
     */
    public void desplazar(double p_dx, double p_dy)
    {
        setX(p_dx);
        setY(p_dy);
    }
    public void mostrar(){
        System.out.println("Punto. X: " + getX() + " Y: " + getY() );
    }
    public String coordenadas(){
        return ("(" + getX() + " , "+ getY() +  ")"); 
    }
    
    public double distanciaA(Punto p_ptoDistante){
        return Math.sqrt(Math.pow(this.getX()- p_ptoDistante.getX(), 2) + Math.pow(this.getY() - p_ptoDistante.getY(), 2) );
    }
    
    public double distanciaAA(Punto p_ptoDistante){
        double x1 = this.getX();
        double x2 = p_ptoDistante.getX();
        double y1 = this.getY();
        double y2 = p_ptoDistante.getY();
        
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) );
    }
    
    
    
    
}
