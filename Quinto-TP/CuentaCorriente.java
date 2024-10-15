
/**
 * Write a description of class CuentaCorriente here.
 *
 * @author Santi
 * @version 1.0
 */
public class CuentaCorriente extends CuentaBancaria{

    // instance variables
    private double limiteDescubierto;

    // Contructores
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo) {
        super(p_nroCuenta, p_titular, p_saldo);
        setLimiteDescubierto(500.0);
    }

    public CuentaCorriente(int p_nroCuenta, Persona p_titular) {
        super(p_nroCuenta, p_titular, 0.0);
        setLimiteDescubierto(500.0);
        this.setSaldo(0);
    }

    // SETTER
    private void setLimiteDescubierto(double p_limite) {
        this.limiteDescubierto = p_limite;
    }

    // GETTERS
    public double getLimiteDescubierto() {
        return this.limiteDescubierto;
    }

    // MÉTODOS

    public boolean puedeExtraer(double p_importe) {
        return ((this.getSaldo() >= p_importe) && (this.getLimiteDescubierto()) >= p_importe);
    }

    public boolean extraer(double p_importe) {
        if (this.puedeExtraer(p_importe)) {
            this.setSaldo(this.getSaldo() - p_importe);
            System.out.println("Extracción exitosa. Nuevo saldo: $" + this.getSaldo());
        } else {
           xQNoPuedoExtraer(p_importe);
           return false;
        }
        return true;
    }

    public void mostrar() {
        System.out.println("- Cuenta Corriente -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().getNombre());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }

    @Override
    public String xQNoPuedoExtraer(double p_importe){
        return super.xQNoPuedoExtraer(p_importe) + " porque se ha superado el limite Descubierto";
    }
}
