import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * La clase {@code Empleado} representa a un empleado en una empresa. Permite
 * calcular el sueldo neto del empleado, incluyendo adicionales y descuentos.
 *
 *  Viene del tp3
 *
 * @author Santiago
 * @version 1.0
 */

public class Empleado extends Persona {

    // instance variable
    private long cuil;
    private double sueldoBasico;
    private Calendar fechaIngreso;

    /**
     * Constructor de la clase {@code Empleado}.
     * 
     * @param p_cuil El número de CUIL del empleado.
     * @param p_importe El sueldo básico del empleado.
     * @param p_anio El año de ingreso del empleado a la empresa.
     */
    public Empleado(long p_cuil, int p_dni, String p_apellido, String p_nombre, double p_importe, int p_anioNacimiento, int p_anioIngreso) {
        // initialise instance variables
        super(p_dni, p_nombre, p_apellido, p_anioNacimiento);
        this.setCuil(p_cuil);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anioIngreso);
        
    }
     public Empleado(long p_cuil, int p_dni, String p_apellido, String p_nombre, double p_importe, Calendar p_fechaNacimiento, Calendar p_fechaIngreso) {
        // initialise instance variables
        super(p_dni, p_nombre, p_apellido, p_fechaNacimiento);
        this.setCuil(p_cuil);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fechaIngreso);
    }

    //SETTERS
    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }
    private void setSueldoBasico(double p_importe) {
        this.sueldoBasico = p_importe;
    }
    private void setAnioIngreso(int p_anioIngreso){
        fechaIngreso = new GregorianCalendar();
        this.fechaIngreso.set(1, p_anioIngreso); 
    }
    private void setFechaIngreso(Calendar p_fechaIngreso) {
        this.fechaIngreso = p_fechaIngreso;
    }
    //GETTERS
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }
    public long getCuil() {
        return this.cuil;
    }
    public int getAnioIngreso() {
        return this.getFechaIngreso().get(Calendar.YEAR);
    }
    public Calendar getFechaIngreso() {
        return this.fechaIngreso;
    }

    //MÉTODOS

    /**
    * Calcula la antigüedad del empleado en años.
    * 
    * @return La cantidad de años desde el ingreso del empleado a la empresa.
    */
    public int antiguedad() {
        Calendar fechahoy = new GregorianCalendar();
        int aniohoy = fechahoy.get(Calendar.YEAR);
        return aniohoy - this.getAnioIngreso();
    }

    private double descuento() {
        return ((this.getSueldoBasico() * 0.02) + 1500);
    }

    private double adicional() {
        if (this.antiguedad() < 2) {
            return this.getSueldoBasico() * 0.02;
        } else if (this.antiguedad() >= 2 && antiguedad() < 10) {
            return this.getSueldoBasico() * 0.04;
        } else {
            return this.getSueldoBasico() * 0.06;
        }
    }


    /**
     * Calcula el sueldo neto del empleado.
     * 
     * @return El sueldo neto después de aplicar el adicional y el descuento.
     */
    public double getSueldoNeto() {
        return this.getSueldoBasico() + this.adicional() - this.descuento();
    }

    /**
     * Genera una cadena con la información completa del empleado.
     */
    public void mostrar() {
        System.out.printf("Nombre y Apellido: %s\n", super.nomYApe());
        System.out.printf("CUIL: %d Antigüedad: %d años de servicio\n",this.getCuil(), this.antiguedad());
        System.out.printf("Sueldo Neto: $%.2f\n", this.getSueldoNeto());
    }

    /**
     * Genera una cadena con una línea resumida de la información del empleado.
     * 
     * @return La cadena con el formato de resumen.
     */
    public String mostrarLinea() {
        return String.format("%14d %15s \t............. $%16.2f", this.getCuil(), super.apeYNom(), this.getSueldoNeto());
    }
}