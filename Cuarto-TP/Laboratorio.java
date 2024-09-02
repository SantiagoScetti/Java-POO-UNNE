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
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setTelefono(p_telefono);
        setCompraMinima(p_compraMin);
        setDiaDeEntrega(p_diaEnt);
    }
    // Setters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }
    private void setTelefono(String p_telefono) {
        this.telefono = p_telefono;
    }
    private void setCompraMinima(int p_compraMin) {
        this.compraMinima = p_compraMin;
    }
    private void setDiaDeEntrega(int p_diaEnt) {
        this.diaDeEntrega = p_diaEnt;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public String getTelefono() {
        return telefono;
    }
    public int getCompraMinima() {
        return compraMinima;
    }
    public int getDiaDeEntrega() {
        return diaDeEntrega;
    }

    // Otros métodos
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
