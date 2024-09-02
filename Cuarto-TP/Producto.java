/**
 * Ejercicio 1 del Tp3
 *
 * @author Santiago & Franco
 *
 */
public class Producto {

    // instance variables 
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock = 0;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;

    /**
     * Constructor for object of class Producto tipo 1
     */
    public Producto(int p_codigo, String p_rubro, String p_descripcion, double p_costo, double p_porcPtoRepo, int p_existMinima,
            Laboratorio p_laboratorio) {
        // initialise instance variables
        setCodigo(p_codigo);
        setRubro(p_rubro);
        setDescripcion(p_descripcion);
        setCosto(p_costo);
        setPorcPtoRepo(p_porcPtoRepo);
        setExistMinima(p_existMinima);
        setLaboratorio(p_laboratorio);
    }

    /**
     * Constructor for object of class Producto tipo 2
     */
    public Producto(int p_codigo, String p_rubro, String p_descripcion, double p_costo, Laboratorio p_laboratorio) {
        setCodigo(p_codigo);
        setRubro(p_rubro);
        setDescripcion(p_descripcion);
        setCosto(p_costo);
        setLaboratorio(p_laboratorio);
    }

    //setters 
    private void setCodigo(int p_codigo) {
        codigo = p_codigo;
    }

    private void setRubro(String p_rubro) {
        rubro = p_rubro;
    }

    private void setDescripcion(String p_descripcion) {
        descripcion = p_descripcion;
    }

    private void setCosto(double p_costo) {
        costo = p_costo;
    }

    private void setStock(int p_stock) {
        stock = p_stock;
    }

    private void setPorcPtoRepo(double p_porcPtoRepo) {
        porcPtoRepo = p_porcPtoRepo;
    }

    private void setExistMinima(int p_existMinima) {
        existMinima = p_existMinima;
    }

    private void setLaboratorio(Laboratorio p_laboratorio) {
        laboratorio = p_laboratorio;
    }
//getters

    public int getCodigo() {
        return codigo;
    }

    public String getRubro() {
        return rubro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public int getStock() {
        return stock;
    }

    public double getPorcPtoRepo() {
        return porcPtoRepo;
    }

    public int getExistMinima() {
        return existMinima;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

//otros metodos
    public void ajustarPtoRepo(double p_porce) {
        setPorcPtoRepo(p_porce);
    }

    public void ajustarExistMin(int p_cantidad) {
        setExistMinima(p_cantidad);
    }

    public String mostrarLinea() {
        return getDescripcion() + "\t" + precioLista() + "\t"
                + precioContado();
    }

    public double precioContado() {
        return precioLista() - (precioLista() / 100) * 5;
    }

    public double precioLista() {
        return getCosto() + (getCosto() / 100) * 12;
    }

    public double stockValorizado() {
        return getStock() * getCosto();
    }

    public void ajuste(int p_cantidad) {
        setStock(getStock() + p_cantidad);
    }

    /**
     * Muestra la información completa del producto, incluyendo el laboratorio,
     * domicilio, teléfono, rubro, descripción, costo, stock, y stock
     * valorizado.
     */
    public void mostrar() {
        System.out.println("Laboratorio: " + laboratorio.getNombre());
        System.out.println("Domicilio: " + laboratorio.getDomicilio() + " - Teléfono: " + laboratorio.getTelefono());
        System.out.println("Rubro: " + getRubro());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Precio Costo: " + getCosto());
        System.out.println("Stock: " + getStock() + " - Stock Valorizado: $" + stockValorizado());
    }
}

