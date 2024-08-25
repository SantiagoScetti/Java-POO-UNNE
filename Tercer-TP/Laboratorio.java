
/**Punto2 del tp 2
 * 
 * @author Santi & Franco
 * @version 1.0
 */
public class Laboratorio {

    
    private String nombre;
    private String domicilio; 
    private String telefono; 
    private int compraMinima;
    private int diaDeEntrega;



    public Laboratorio(String p_nombre, String p_domicilio , String p_telefono ,  int p_compraMin, int p_diaEnt ){
        this.nombre = p_nombre;
        this.domicilio = p_domicilio;
        this.telefono = p_telefono;
        this.compraMinima = p_compraMin;
        this.diaDeEntrega = p_diaEnt;
    }
    
    public Laboratorio(String p_nombre,String p_domicilio, String p_telefono){
        this.nombre = p_nombre;
        this.domicilio = p_domicilio;
        this.telefono = p_telefono;
    }
    public void nuevaCompraMinima(int p_compraMin){
        this.compraMinima = p_compraMin;
    } 
    public void nuevoDiaEntrega(int p_diaEnt){
        this.diaDeEntrega = p_diaEnt;
    } 

    public String mostrar(){
        return "Laboratorio:" + nombre + "Domicilio: " + domicilio + "Telefono: " + telefono;
    } 

}
