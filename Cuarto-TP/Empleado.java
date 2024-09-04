
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

public class Empleado {



    // instance variable
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;

    /**
     * Constructor de la clase {@code Empleado}.
     * 
     * @param p_cuil El número de CUIL del empleado.
     * @param p_apellido El apellido del empleado.
     * @param p_nombre El nombre del empleado.
     * @param p_importe El sueldo básico del empleado.
     * @param p_anio El año de ingreso del empleado a la empresa.
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio) {
        // initialise instance variables
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setCuil(p_cuil);
        this.setSueldoBasico(p_importe);
        this.setAnio(p_anio);
    }
     public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha) {
        // initialise instance variables
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setCuil(p_cuil);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
    }

    //SETTERS
    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setSueldoBasico(double p_importe) {
        this.sueldoBasico = p_importe;
    }
  
    private void setFechaIngreso(Calendar p_fecha) {
        this.fechaIngreso = p_fecha;
    }
    private void setAnio(int p_anio){
        fechaIngreso = new GregorianCalendar();
        this.fechaIngreso.set(1, p_anio);
    }

    //GETTERS
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public long getCuil() {
        return this.cuil;
    }
    public int getAnioIngreso() {
        return this.fechaIngreso.get(Calendar.YEAR);
    }
    public Calendar getFechaIngreso() {
        return this.fechaIngreso;
    }
    /**
    * Métodos
    */

    /**
    * Calcula la antigüedad del empleado en años.
    * 
    * @return La cantidad de años desde el ingreso del empleado a la empresa.
    */
    public int antiguedad() {
        Calendar fechahoy = new GregorianCalendar();
        int aniohoy = fechahoy.get(Calendar.YEAR);
        return aniohoy - getFechaIngreso().get(Calendar.YEAR);
    }

    private double descuento() {
        return ((getSueldoBasico() * 0.02) + 1500);
    }

    private double adicional() {
        if (antiguedad() < 2) {
            return getSueldoBasico() * 0.02;
        } else if (antiguedad() >= 2 && antiguedad() < 10) {
            return getSueldoBasico() * 0.04;
        } else {
            return getSueldoBasico() * 0.06;
        }
    }

    public String nomYApe() {
        return getNombre() + " " + getApellido();
    }

    public String apeYNom() {
        return getApellido() + ", " + getNombre();
    }

    /**
     * Calcula el sueldo neto del empleado.
     * 
     * @return El sueldo neto después de aplicar el adicional y el descuento.
     */
    public double getSueldoNeto() {
        return getSueldoBasico() + adicional() - descuento();
    }

    /**
     * Genera una cadena con la información completa del empleado.
     */
    public void mostrar() {
        System.out.printf("Nombre y Apellido: %s\n", nomYApe());
        System.out.printf("CUIL: %d Antigüedad: %d años de servicio\n", getCuil(), antiguedad());
        System.out.printf("Sueldo Neto: $%.2f\n", getSueldoNeto());
    }

    /**
     * Genera una cadena con una línea resumida de la información del empleado.
     * 
     * @return La cadena con el formato de resumen.
     */
    public String mostrarLinea() {
        return String.format("%d %s \t............. $%.2f", getCuil(), apeYNom(), getSueldoNeto());
    }
}

