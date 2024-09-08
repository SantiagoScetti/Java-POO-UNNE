
/**
 * Reutilizada del TP-3
 * @author Santi
 * @version 1.0
 */
public class CuentaBancaria{

    // Variables de instancia
    private int nroCuenta;
    private double saldo;
    private Persona titular;

    /**
     * Constructor for objects of class CuentaBancaria
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo) {
        setNroCuenta(p_nroCuenta);
        setSaldo(p_saldo);
        setTitular(p_titular);
    }

    public CuentaBancaria(int p_nroCuenta, Persona p_titular) {
        setNroCuenta(p_nroCuenta);
        setTitular(p_titular);
        setSaldo(0);
    }

    //SETTERS
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }

    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }

    //GETTERS
    public int getNroCuenta() {
        return this.nroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Persona getTitular() {
        return this.titular;
    }

    //METODOS
    /**
     * Método para depositar dinero en la cuenta. No permite depósitos con
     * importe negativo.
     *
     * @param p_importe El importe a depositar.
     * @return El saldo después del depósito.
     */
    public double depositar(double p_importe) {
        if (p_importe > 0) {
            setSaldo(getSaldo() + p_importe);
        } else {
            System.out.println("Error: El importe a depositar debe ser positivo.");
        }
        return getSaldo();
    }

    /**
     * Método para extraer dinero de la cuenta. No permite extracciones con
     * importe negativo o si el saldo es insuficiente.
     *
     * @param p_importe El importe a extraer.
     * @return El saldo después de la extracción.
     */
    public double extraer(double p_importe) {
        if (p_importe > 0) {
            if (getSaldo() >= p_importe) {
                setSaldo(getSaldo() - p_importe);
            } else {
                System.out.println("Error: Saldo insuficiente.");
            }
        } else {
            System.out.println("Error: El importe a extraer debe ser positivo.");
        }
        return getSaldo();
    }

    /**
     * Método mostrar() Imprime los detalles de la cuenta bancaria en el formato
     * especificado.
     */
    public void mostrar() {
        System.out.println("- Cuenta Bancaria -");
        System.out.println("Titular: " + getTitular().getNombre() + " (" + getTitular().edad() + " años)");
        System.out.println("Saldo: " + getSaldo());
    }

    /**
     * Método toString() Devuelve una cadena con los datos de la cuenta (número,
     * titular, saldo) tabulados.
     */
    public String toString() {
        return getNroCuenta() + "\t" + getTitular().getNombre() + "\t" + getSaldo();
    }
}
