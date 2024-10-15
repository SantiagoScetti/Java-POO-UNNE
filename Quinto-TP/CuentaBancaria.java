
/**
 * Write a description of class Cuenta here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class CuentaBancaria {
    private int nroCuenta;
    private double saldo;
    private Persona titular; // (1)

    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }

    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }

    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }

    protected void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    public int getNroCuenta() {
        return this.nroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Persona getTitular() {
        return this.titular;
    }

    // METODOS
    protected abstract boolean  puedeExtraer(double p_importe);
    public abstract boolean extraer(double p_importe);

    public void depositar(double p_importe) {     //metodo concreto
        if (p_importe > 0) {
            this.setSaldo(this.getSaldo() + p_importe);
            System.out.println("Depósito exitoso. Nuevo saldo: $" + this.getSaldo());
        } else {
            System.out.println("No se puede depositar un importe negativo o cero.");
        }
    }

    public abstract void mostrar();
    
    public String xQNoPuedoExtraer(double p_importe){
        return ("No se puede extraer: " + p_importe + " ");
    }
}