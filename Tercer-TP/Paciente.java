
/**
 * PUNTO 8
 * @author Santiago y Franco
 * @version 1.0
 * 
 */
public class Paciente
{
    // instance variables
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    
    /**
     * Constructor 
     */
    public Paciente(int p_historia,String p_nombre, String p_domicilio,Localidad p_localidadNacido, Localidad p_localidadVive)
    {
        setHistoriaClinica(p_historia);
        setHombre(p_nombre);
        setDomicilio(p_domicilio);
        setNacido(p_localidadNacido);
        setVive(p_localidadVive);
    }

    //SETTERS
    private void setHistoriaClinica(int p_historia){
        this.historiaClinica = p_historia;
    }
    private void setHombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    private void setNacido(Localidad p_nacido){
        this.localidadNacido = p_nacido;
    }
    private void setVive(Localidad p_vive){
        this.localidadVive = p_vive;
    }

    //getters
    private int getHistoriaClinica(){
        return this.historiaClinica;
    }
    private String getNombre(){
        return this.nombre;
    }
    private String getDomicilio(){
        return this.domicilio;
    }
    public Localidad getNacido(){
        return this.localidadNacido;
    }
    public Localidad getVive(){
        return this.localidadVive;
    } 
    
    public void mostrarDatosPantalla(){
        System.out.println("Paciente " + this.getNombre() + " Historia Clínica: " + this.getHistoriaClinica() + " Domicilio: " + getDomicilio());
        System.out.println(this.getVive().mostrar());
    }
    public String cadenaDeDatos(){
        return this.getNombre() + "....." + this.getDomicilio() + " - " + getVive().getNombre() + "--" + getVive().getProvincia();
    }
}
