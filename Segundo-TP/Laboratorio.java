
/**
 * La clase {@code Laboratorio} representa un laboratorio farmacéutico con información
 * relevante como nombre, domicilio, teléfono, compra mínima y día de entrega.
 * Proporciona métodos para modificar los datos de compra mínima y día de entrega, 
 * así como para mostrar la información del laboratorio.
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

    /**
     * Constructor de la clase {@code Laboratorio} con todos los atributos.
     * 
     * @param p_nombre El nombre del laboratorio.
     * @param p_domicilio El domicilio del laboratorio.
     * @param p_telefono El teléfono del laboratorio.
     * @param p_compraMin La compra mínima requerida.
     * @param p_diaEnt El día de entrega.
     */
     public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMin);
        this.setDiaDeEntrega(p_diaEnt);
    }

    /**
     * Constructor de la clase {@code Laboratorio} sin los atributos de compra mínima y día de entrega.
     * 
     * @param p_nombre El nombre del laboratorio.
     * @param p_domicilio El domicilio del laboratorio.
     * @param p_telefono El teléfono del laboratorio.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono) {
        this(p_nombre, p_domicilio, p_telefono, 0, 0); // Valores predeterminados para compra mínima y día de entrega.
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

    //METODOS

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

