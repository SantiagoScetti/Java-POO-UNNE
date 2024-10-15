package PUNT8;


/**
 * Write a description of class Lavarropas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lavarropas extends ArtefactoHogar
{
    private int programas;
    private float kilos;
    private boolean automatico;

    public int getProgramas() {
        return this.programas;
    }

    private void setProgramas(int programas) {
        this.programas = programas;
    }

    public float getKilos() {
        return this.kilos;
    }

    private void setKilos(float kilos) {
        this.kilos = kilos;
    }

    public boolean isAutomatico() {
        return this.automatico;
    }

    private void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public Lavarropas(String p_marca, float p_precio, int p_stock)
    {
        super(p_marca, p_precio, p_stock);
        
    }


    //METODOS
    public void imprimir(){
        System.out.println("Cantidad de Programas: " + this.getProgramas());
        System.out.println("Kilos: " + this.getKilos());
        if (this.isAutomatico()) {
            System.out.println("Es Automatico");
        }else{
            System.out.println("No es Automatico");
        }
    }
    
    public float creditoConAdicional(int p_cuotas, float p_interes){
        
        float cuota = this.cuotaCredito(p_cuotas, p_interes);

        if (this.isAutomatico()) {
            return cuota -= cuota * 0.02;
        }
        return cuota;
    }
}
