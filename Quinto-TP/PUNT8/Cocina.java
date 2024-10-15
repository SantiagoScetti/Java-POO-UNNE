package PUNT8;

/**
 * 
 * 
 * @author santi
 * @version 1.0
 */
public class Cocina extends ArtefactoHogar
{
    // instance variables - replace the example below with your own
    private int hornallas;
    private int calorias;
    private String dimensiones;

    //CONTRUCTOR
    public Cocina(String p_marca,float p_precio,int p_stock, int p_hornallas, int p_calorias, String p_dimensiones)
    {
        super(p_marca, p_precio, p_stock);
        setHornallas(p_hornallas);
        setCalorias(p_calorias);
        setDimensiones(p_dimensiones);
    }

    //SETTERS
    private void setHornallas(int p_hornallas){
        this.hornallas = p_hornallas;
    }
    private void setCalorias(int p_calorias){
        this.calorias = p_calorias;
    }
    private void setDimensiones(String p_dimensiones){
        this.dimensiones = p_dimensiones;
    }
    
    //GETTERS
    public int getHornallas(){
        return this.hornallas;
    }
    public int getCalorias(){
        return this.calorias;
    }
    public String getDimensiones(){
        return this.dimensiones;
    }

    

    //METODOS
    public void imprimir(){
        super.imprimir();
        System.out.println("Hornallas: " + this.getHornallas());
        System.out.println("Calorías: " + this.getCalorias());
        System.out.println("Dimensiones: " + this.getDimensiones());
    }
    
    public float creditoConAdicional(int p_cuotas, float p_interes){
        return this.cuotaCredito(p_cuotas, p_interes);
    }
}
