
/**
 * La clase {@code Cliente} representa un cliente de un sistema bancario.
 * Permite gestionar los datos personales y el saldo de un cliente.
 *
 * @author Santi
 * @version 1.0
 */
public class Cliente {

    // Atributos de la clase
    private int nroDni;
    private String apellido;
    private String nombre;
    private double saldo;

    /**
     * Constructor de clase Cliente con los datos proporcionados.
     *
     * @param p_dni El número de DNI del cliente.
     * @param p_apellido El apellido del cliente.
     * @param p_nombre El nombre del cliente.
     * @param p_importe El saldo inicial del cliente.
     */
    public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe) {
        setNroDni(p_dni);
        setApellido(p_apellido);
        setNombre(p_nombre);
        setSaldo(p_importe);
    }

    // SETTERS (no necesitan Javadoc porque son privados)
    private void setNroDni(int p_dni) {
        this.nroDni = p_dni;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setSaldo(double p_importe) {
        this.saldo = p_importe;
    }

    // GETTERS
    /**
     * @return El número de DNI del cliente.
     */
    public int getNroDni() {
        return this.nroDni;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el saldo actual del cliente.
     * 
     * @return El saldo actual.
     */
    public double getSaldo() {
        return this.saldo;
    }


    // Otros métodos de la clase
    /**
     *  El método {@code agregaSaldo()} añade o resta saldo al cliente.
     * @param p_importe La cantidad a agregar o restar al saldo.
     */
    public void agregaSaldo(double p_importe) {
        this.saldo += p_importe;
        System.out.println("Saldo: $" + saldo);
    }

    /**
     * @param p_importe La cantidad nueva que se asignará a saldo.
     */
    public void nuevoSaldo(double p_importe) {
        this.saldo = p_importe;
        System.out.println("Saldo: $" + saldo);
    }

    /**
     * Muestra la información completa del cliente, incluyendo nombre, apellido,
     * DNI y saldo.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + nombre + apellido + "(" + nroDni + ")");
        System.out.println("Saldo: $" + saldo);
    }
}
