/**
 * TP3 Punto 12
 * 
 * @author Santiago
 * @version 1.0
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class EmpleadoConJefe {  
    // Variables de instancia
    private long cuil; 
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;
    /**
     * Constructor for objects of class EmpleadoConJefe
     */
     // Constructores
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe) {
        setCuil(p_cuil);
        setApellido(p_apellido);
        setNombre(p_nombre);
        setSueldoBasico(p_importe);
        setAnioIngreso(p_fecha.get(Calendar.YEAR)); 
        setJefe(p_jefe);
        
    }
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha) {
        setCuil(p_cuil);
        setApellido(p_apellido);
        setNombre(p_nombre);
        setSueldoBasico(p_importe);
        setAnioIngreso(p_fecha.get(Calendar.YEAR)); 
        setJefe(null);
    }

    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio) {
        setCuil(p_cuil);
        setApellido(p_apellido);
        setNombre(p_nombre);
        setSueldoBasico(p_importe);
        setAnioIngreso(p_anio);
        setJefe(null);
        
    }


    // Setters
    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }
    private void setSueldoBasico(double p_importe) {
        this.sueldoBasico = p_importe;
    }
    private void setAnioIngreso(int p_anio) {
        this.fechaIngreso = new GregorianCalendar();
        this.fechaIngreso.set(Calendar.YEAR, p_anio);
    }
    private void setJefe(EmpleadoConJefe p_jefe) {
        this.jefe = p_jefe;
    }
    
    //GETTERS
    public long getCuil() {
        return this.cuil;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }
    public int getAnioIngreso() {
        return this.fechaIngreso.get(Calendar.YEAR);
    }
    public EmpleadoConJefe getJefe() {
        return this.jefe;
    }
    
    //METODOS

    public int antiguedad(){
        Calendar fechahoy = new GregorianCalendar();
        int aniohoy = fechahoy.get(Calendar.YEAR);
        return aniohoy - getAnioIngreso();
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
     /**
     * Calcula el sueldo neto del empleado.
     * 
     * @return El sueldo neto después de sumar el adicional y restar el descuento.
     */
    public double getSueldoNeto() {
        return getSueldoBasico() + adicional() - descuento();
    }

    public String nomYApe() {
        return getNombre() + " " + getApellido();
    }

    public String apeYNom() {
        return getApellido() + ", " + getNombre();
    }

    /**
     * Genera una cadena con la información completa del empleado.
     */
    public void mostrar() {
        System.out.printf("Nombre y Apellido: " + nomYApe());
        System.out.printf("CUIL: %d  Antigüedad: %d años de servicio", getCuil(), antiguedad());
        System.out.printf("Sueldo Neto: $%.2f\n", getSueldoNeto());

        if(this.getJefe() != null){
            System.out.printf("Responde a: " + getJefe().apeYNom() + "\n");
        }else{
            System.out.printf("El GERENTE GENERAL\n");
        }
        
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
