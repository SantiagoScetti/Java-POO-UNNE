
/**
 * Write a description of class Elipse here.
 * 
 * @author franco
 * @version
 */
import java.lang.Math;

public class Elipse extends FiguraGeometrica{
    
    private double sEjeMayor;
    private double sEjeMenor;
    
    public Elipse(double p_sEjeMayor, double p_sEjeMenor, Punto p_centro){
        super(p_centro);
        setSEjeMayor(p_sEjeMayor);
        setSEjeMenor(p_sEjeMenor);
    }
     public Elipse(double p_sEjeMayor, double p_sEjeMenor){
        super(new Punto(0,0));
        setSEjeMayor(p_sEjeMayor);
        setSEjeMenor(p_sEjeMenor);
    }
    
    //setters
    private void setSEjeMayor(double p_ejeMayor){
        this.sEjeMayor = p_ejeMayor;
    }
    private void setSEjeMenor(double p_ejeMenor){
        this.sEjeMenor = p_ejeMenor;
    }

    //getters
    public double getSEjeMayor( ){
        return this.sEjeMayor;
    }
    public double getSEjeMenor( ){
        return this.sEjeMenor;
    }
    

    //metodos
    public String nombreFigura(){
        return ("Elipse\n");
    }
    public void desplazar(double p_dx, double p_dy) {
        Punto newCentro = new Punto(p_dx, p_dy);
        this.setOrigen(newCentro);
    }

    public void caracteristicas() {
        System.out.println(this.getOrigen().coordenadas() + " - Semieje Mayor " + this.getSEjeMayor() + " - Semieje Menor " + this.getSEjeMenor());
        System.out.println("Superficie: "+ this.superficie());
    }


    public double superficie() {
        return Math.PI * this.getSEjeMayor() * this.getSEjeMenor();
    }

    public double distanciaA(Elipse otroElipse) {
        return this.getOrigen().distanciaA(otroElipse.getOrigen());
    }

    public Elipse elMayor(Elipse otroElipse) {
        if (this.superficie() < otroElipse.superficie()) {
            return otroElipse;
        } 
        return this;
    }
    
}