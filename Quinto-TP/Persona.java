 

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * La clase {@code Persona} se reutiliza del TP2
 * 
 * @author Santi
 * @version 2.0
 */
public class Persona {

    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;

    /**
     * Constructor de la clase {@code Persona}.
     *
     * @param p_dni El número de DNI de la persona.
     * @param p_nombre El nombre de la persona.
     * @param p_apellido El apellido de la persona.
     * @param p_anio El año de nacimiento de la persona.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio) {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_anio) {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_anio);
    }


    //Setters
    private void setDNI(int p_dni) {
        this.nroDni = p_dni;
    }
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }
    private void setAnioNacimiento(int p_anio) {
        fechaNacimiento = new GregorianCalendar();
        this.fechaNacimiento.set(1, p_anio); 
    }
    private void setFechaNacimiento(Calendar calendario) {
        this.fechaNacimiento = calendario;
    }
    //Getters
    public int getDNI() {
        return this.nroDni;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public Calendar getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    public int getAnioNacimiento() {
        return this.getFechaNacimiento().get(Calendar.YEAR);
    }
    
    /**
     * Calcula la edad de la persona en años considerando la diferencia entre
     * años.
     *
     * @return La edad de la persona en años.
     */
    public int edad() {
        // Obtener la fecha actual
        Calendar fechaActual = Calendar.getInstance();
        
        int anioActual = fechaActual.get(Calendar.YEAR);
        int mesActual = fechaActual.get(Calendar.MONTH);
        int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);
    
        
        int anioNacimiento = this.getFechaNacimiento().get(Calendar.YEAR);
        int mesNacimiento = this.getFechaNacimiento().get(Calendar.MONTH);
        int diaNacimiento = this.getFechaNacimiento().get(Calendar.DAY_OF_MONTH);
    
        // Calcular la edad inicial (solo en base al año)
        int edad = anioActual - anioNacimiento;
    
        // Ajustar la edad si el cumpleaños aún no ha ocurrido este año
        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }
    
        return edad;
    }

    public String nomYApe() {
        return this.getNombre() + ", " +  this.getApellido();
    }

    public String apeYNom() {
        return this.getApellido() + ", " + this.getNombre();
    }

    /**
     * Muestra la información completa de la persona, incluyendo nombre,
     * apellido, DNI y edad.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido " + this.nomYApe());
        System.out.println("DNI: " + this.getDNI());
        System.out.println("Edad: " + this.edad());
    }

}
