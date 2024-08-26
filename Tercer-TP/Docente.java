/**
 * TP3 Punto 6
 * 
 * @author santi
 * @version 1.0
 */

public class Docente {
    // Variables de instancia
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;

    // Constructor
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asignacionFamiliar) {
        setNombre(p_nombre);
        setGrado(p_grado);
        setSueldoBasico(p_sueldoBasico);
        setAsignacionFamiliar(p_asignacionFamiliar);
    }

    // Setters (privados)
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setGrado(String p_grado) {
        this.grado = p_grado;
    }
    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }
    private void setAsignacionFamiliar(double p_asignacionFamiliar) {
        this.asignacionFamiliar = p_asignacionFamiliar;
    }

    // Getters (públicos)
    public String getNombre() {
        return this.nombre;
    }
    public String getGrado() {
        return this.grado;
    }
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }
    public double getAsignacionFamiliar() {
        return this.asignacionFamiliar;
    }

    // Método para calcular el sueldo total
    public double calcularSueldo() {
        return getSueldoBasico() + getAsignacionFamiliar();
    }
}

