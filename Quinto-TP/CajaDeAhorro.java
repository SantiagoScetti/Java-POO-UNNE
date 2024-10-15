
/**
 * 
 *
 * @author santi
 * @version 1.0
 */
public class CajaDeAhorro extends CuentaBancaria{

    // Variables de instancia
    private int extraccionesPosibles;
 

    // Constructores
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo) {
        super(p_nroCuenta, p_titular, p_saldo);
        setExtraccionesPosibles(10);
    }

    public CajaDeAhorro(int p_nroCuenta, Persona p_titular) {
        super(p_nroCuenta, p_titular, 0);
        setExtraccionesPosibles(10);
    }

    // SETTERS
    private void setExtraccionesPosibles(int p_extracciones) {
        this.extraccionesPosibles = p_extracciones;
    }

    // GETTERS

    public int getExtraccionesPosibles() {
        return this.extraccionesPosibles;
    }

    // MÉTODOS
    @Override
    public boolean puedeExtraer(double p_importe) {
        return (p_importe <= this.getSaldo()) && (this.extraccionesPosibles > 0);
    }

    public boolean extraer(double p_importe) {
        if (this.puedeExtraer(p_importe)) {
            System.out.println("Extracción exitosa. Nuevo saldo: $" + this.getSaldo());
            System.out.println("Extracciones restantes: " + this.getExtraccionesPosibles());
        } else {
            if (this.extraccionesPosibles == 0) {
                System.out.println("No tiene habilitadas más extracciones!");
                return false;
            } else if (p_importe > this.getSaldo()) {
                System.out.println("No puede extraer más que el saldo!");
                return false;
            }
        }
        return true;
    }

    public void mostrar() {
        System.out.println("- Caja de Ahorro -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe()); 
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
}
