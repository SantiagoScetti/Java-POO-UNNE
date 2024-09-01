
import java.util.*;

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
        return nroDni;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public Calendar getAnioNacimiento() {
        return fechaNacimiento;
    }
    
    /**
     * Calcula la edad de la persona en años considerando la diferencia entre
     * años.
     *
     * @return La edad de la persona en años.
     */
    public int edad() {
        Calendar fechahoy = new GregorianCalendar();
        int aniohoy = fechahoy.get(Calendar.YEAR);
        return aniohoy - getAnioNacimiento().YEAR;
    }

    public String nomYApe() {
        return nombre + apellido;
    }

    public String apeYNom() {
        return apellido + ", " + nombre;
    }

    /**
     * Muestra la información completa de la persona, incluyendo nombre,
     * apellido, DNI y edad.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido " + nomYApe());
        System.out.println("DNI: " + nroDni);
        System.out.println("Edad: " + edad());
    }

}

