import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Punto 2 TP4
 * 
 * @author Santiago y Franco
 * @version 1.0
 */
public class Pedido
{
    // instance variables
    private Calendar fecha;
    private ArrayList<Producto> productos;
    private Cliente cliente;

    /**
     * Constructores
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Producto> p_productos){
      this.setFecha(p_fecha);
      this.setCliente(p_cliente);
      this.setProductos(p_productos);
    }

    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProducto(p_producto);
        
    }
    public Pedido(Calendar p_fecha, Cliente p_cliente){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList<Producto>());
    }

    //SETTERS
    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    private void setCliente(Cliente p_cliente){
        this.cliente = p_cliente;
    }
    private void setProductos(ArrayList<Producto> p_productos) {
        this.productos = p_productos;
    }
    private void setProducto(Producto p_producto){
        this.productos = new ArrayList<Producto>();
        this.productos.add(p_producto);
    }
    
    
    //GETTES
    public  Calendar getFecha(){
        return this.fecha;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public ArrayList<Producto> getProductos() {
        return this.productos;
    }
    
    // Método para agregar un producto
    public boolean agregarProducto(Producto p_producto) {
            return getProductos().add(p_producto);
    }
    // Método para quitar un producto
    public boolean quitarProducto(Producto p_producto) {
        return getProductos().remove(p_producto);  
    }

    //METODOS

    public double totalAlContado(){
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).precioContado();
        }
        return total;
    }

    public  double totalFinanciado(){
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).precioLista(); 
        }
        return total;
    }

    

    

    public void mostrarPedido() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        String fechaStr = sdf.format(getFecha().getTime());

        System.out.println("****** Detalle del pedido ****** Fecha: " + fechaStr);
        System.out.printf("%-25s %-15s %-15s%n", "Producto", "Precio Lista", "Precio Contado");
        System.out.println("---------------------------------------------------------------");

        for (Producto producto : productos) {
            System.out.printf("%-25s %-15.2f %-15.2f%n",
                    producto.getDescripcion(),
                    producto.precioLista(),
                    producto.precioContado());
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-25s %-15.2f %-15.2f%n",
                "***TOTAL-----",
                this.totalFinanciado(),
                this.totalAlContado());
    }
}
