import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Write a description of class EmpleadoCom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmpleadoCom
{
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
    public EmpleadoCom(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio) {
        // initialise instance variables
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setCuil(p_cuil);
        this.setSueldoBasico(p_importe);
        this.setAnio(p_anio);
    }
     public EmpleadoCom(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha) {
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
        return aniohoy - this.getFechaIngreso().get(Calendar.YEAR);
    }

    private double descuento() {
        return ((this.getSueldoBasico() * 0.02) + 1500);
    }

    private double adicional() {
        if (this.antiguedad() < 2) {
            return this.getSueldoBasico() * 0.02;
        } else if (this.antiguedad() >= 2 && this.antiguedad() < 10) {
            return this.getSueldoBasico() * 0.04;
        } else {
            return this.getSueldoBasico() * 0.06;
        }
    }

    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    public String apeYNom() {
        return this.getApellido() + ", " + this.getNombre();
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
        System.out.printf("Nombre y Apellido: %s\n", this.nomYApe());
        System.out.printf("CUIL: %d Antigüedad: %d años de servicio\n", this.getCuil(), this.antiguedad());
        System.out.printf("Sueldo Neto: $%.2f\n", this.getSueldoNeto());
    }

    /**
     * Genera una cadena con una línea resumida de la información del empleado.
     * 
     * @return La cadena con el formato de resumen.
     */
    public String mostrarLinea() {
        return String.format("%20d %20s \t............. $20%.2f", this.getCuil(), this.apeYNom(), this.getSueldoNeto());
    }
}
