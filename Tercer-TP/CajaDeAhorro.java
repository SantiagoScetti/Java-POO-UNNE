
/**
 * 
 *
 * @author santi
 * @version 1.0
 */
public class CajaDeAhorro {

    // Variables de instancia
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;

    // Constructores
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo) {
        setNroCuenta(p_nroCuenta);
        setTitular(p_titular);
        setSaldo(p_saldo);
        setExtraccionesPosibles(10);
    }

    public CajaDeAhorro(int p_nroCuenta, Persona p_titular) {
        setNroCuenta(p_nroCuenta);
        setTitular(p_titular);
        setSaldo(0.0);
        setExtraccionesPosibles(10);
    }

    // SETTERS
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }
    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }
    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }
    private void setExtraccionesPosibles(int p_extracciones) {
        this.extraccionesPosibles = p_extracciones;
    }

    // GETTERS
    public int getNroCuenta() {
        return this.nroCuenta;
    }
    public double getSaldo() {
        return this.saldo;
    }

    public Persona getTitular() {
        return this.titular;
    }

    public int getExtraccionesPosibles() {
        return this.extraccionesPosibles;
    }

    // MÉTODOS
    private boolean puedeExtraer(double p_importe) {
        return (p_importe <= this.saldo) && (this.extraccionesPosibles > 0);
    }

    private void extraccion(double p_importe) {
        setSaldo(this.saldo - p_importe);
        setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }

    public void extraer(double p_importe) {
        if (this.puedeExtraer(p_importe)) {
            this.extraccion(p_importe);
            System.out.println("Extracción exitosa. Nuevo saldo: $" + this.getSaldo());
            System.out.println("Extracciones restantes: " + this.getExtraccionesPosibles());
        } else {
            if (this.extraccionesPosibles == 0) {
                System.out.println("No tiene habilitadas más extracciones!");
            } else if (p_importe > this.saldo) {
                System.out.println("No puede extraer más que el saldo!");
            }
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
        System.out.println("- Caja de Ahorro -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe()); 
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
}
