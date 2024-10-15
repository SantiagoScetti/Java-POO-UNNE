import java.util.ArrayList;

/**
 * Write a description of class Jardin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jardin{
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;

    public Jardin(String p_nombre, FiguraGeometrica p_figura){
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<FiguraGeometrica>());
        this.agregarFigura(p_figura);
    }

    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras){
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }
    
    //SETTERS
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setFiguras(ArrayList<FiguraGeometrica> p_figura){
        this.figuras = p_figura;
    }
    //GETTERS
    private ArrayList<FiguraGeometrica> getFiguras(){
        return this.figuras;
    }
    public String getNombre(){
        return this.nombre;
    }

    //METODOS

    public boolean agregarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().add(p_figura);
    }
    public boolean quitarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().remove(p_figura);
    }
    private double cuantosLitros(){
        double mTotales = 0;
        for (FiguraGeometrica unaFig : this.getFiguras()) {
            mTotales += unaFig.superficie();
        }
        return (mTotales * 4) / 20;
    }
    
    public int cuantasLatas() {
        double metros = 0;
        for (FiguraGeometrica unaFig : this.getFiguras()) {
        metros += unaFig.superficie();
        }
        // 1 lata cubre 20 m2, se necesita dividir la superficie entre 20 y redondear hacia arriba
        return (int) Math.ceil(metros / 20);
    }
    
    public void detalleFiguras() {
    System.out.println("Presupuesto: Bichito de luz");
    for (FiguraGeometrica unaFig : this.getFiguras()) {
        unaFig.nombreFigura();
        System.out.printf("Superficie: %.2f%n", unaFig.superficie());
    }
    System.out.printf("Total a cubrir: %.2f%n", this.cuantosLitros());
    System.out.printf("Comprar: %d latas%n", this.cuantasLatas()); 
    }


}
