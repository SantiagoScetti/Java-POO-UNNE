
/**
 * Write a description of class CuentaCorriente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CuentaCorriente {

    // instance variables 
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;

    //Contructores
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo) {
        setNroCuenta(p_nroCuenta);
        setTitular(p_titular);
        setSaldo(p_saldo);
        setLimiteDescubierto(500.0);
    }

    public CuentaCorriente(int p_nroCuenta, Persona p_titular) {
        setNroCuenta(p_nroCuenta);
        setTitular(p_titular);
        setSaldo(0.0); // Si no se especifica saldo, este será 0
        setLimiteDescubierto(500.0);
    }

    // SETTERS
    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }
    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }
    private void setLimiteDescubierto(double p_limite) {
        this.limiteDescubierto = p_limite;
    }

    // GETTERS
    public int getNroCuenta() {
        return this.nroCuenta;
    }
    public Persona getTitular() {
        return this.titular;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public double getLimiteDescubierto() {
        return this.limiteDescubierto;
    }

    // MÉTODOS

    private boolean puedeExtraer(double p_importe) {
        return ((this.getSaldo() + this.getLimiteDescubierto()) >= p_importe);
    }

    private void extraccion(double p_importe) {
        setSaldo(this.getSaldo() - p_importe);
    }

    public void extraer(double p_importe) {
        if (this.puedeExtraer(p_importe)) {
            this.extraccion(p_importe);
            System.out.println("Extracción exitosa. Nuevo saldo: $" + this.getSaldo());
        } else {
            System.out.println("No se puede realizar la extracción. Motivo: el importe excede el saldo más el límite de descubierto.");
        }
    }

    public void depositar(double p_importe) {
        if (p_importe > 0) {
            this.setSaldo(this.getSaldo() + p_importe);
            System.out.println("Depósito exitoso. Nuevo saldo: $" + this.getSaldo());
        } else {
            System.out.println("No se puede depositar un importe negativo o cero.");
        }
    }

    public void mostrar() {
        System.out.println("- Cuenta Corriente -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().getNombre());  
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }
}
