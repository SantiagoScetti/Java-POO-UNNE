/**
 * TP3 Punto 6
 *
 * @author santi
 * @version 1.0
 */

public class Escuela {

    // Variables de instancia
    private String nombre;
    private String domicilio;
    private String director;

    // Constructor
    public Escuela(String p_nombre, String p_domicilio, String p_director) {
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setDirector(p_director);
    }

    // Setters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }
    private void setDirector(String p_director) {
        this.director = p_director;
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    public String getDirector() {
        return this.director;
    }

    // Método para imprimir el recibo del docente
    public void imprimirRecibo(Docente p_docente) {
        System.out.println("Escuela: " + getNombre() + " Domicilio: " + getDomicilio() + " Director: " + getDirector());
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("Docente: " + p_docente.getNombre());
        System.out.println("Sueldo:…………………………… $" + p_docente.calcularSueldo());
        System.out.println("Sueldo Básico………………… $" + p_docente.getSueldoBasico());
        System.out.println("Asignación familiar………… $ " + p_docente.getAsignacionFamiliar());
    }
}
