
/**
 * @author Franco
 * @version 1.0
 */
public class Cliente
{
    // Atributos de la clase
    private int nroDni;
    private String apellido;
    private String nombre;
    private double saldo;
    
    /**
     * Constructor de clase Cliente
     */
    public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe)
    {
        this.nroDni = p_dni;
        this.apellido = p_apellido;
        this.nombre = p_nombre;
        this.saldo = p_importe;
    }

    public void agregaSaldo(double p_importe)
    {
        this.saldo += p_importe;     
        System.out.println("Saldo: $" + saldo);
    }
    
    public void nuevoSaldo(double p_importe)
    {
        this.saldo = p_importe;  
        System.out.println("Saldo: $" + saldo);
    }
    
    public void mostrar()
    {
        System.out.println("Nombre y Apellido: " + nombre + apellido + "(" + nroDni + ")");
        System.out.println("Saldo: $" + saldo);
    }
}
