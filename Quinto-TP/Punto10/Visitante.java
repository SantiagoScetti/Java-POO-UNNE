package Punto10;

import java.util.Calendar;
import java.util.HashSet;

/**
 * 
 * @author Franco
 * @version 1.0
 */

public abstract  class Visitante{
    private String nombre;
    private Calendar fechaVisita;

    public Visitante(String p_nombre, Calendar p_fecha){
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fecha);
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaVisita() {
        return this.fechaVisita;
    }

    private void setFechaVisita(Calendar p_fechaVisita) {
        this.fechaVisita = p_fechaVisita;
    }

    //metodos
    public abstract void mostrar();
    public abstract double entrada();
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);
    public abstract String tipoVisitante();
    public abstract HashSet<Persona> listarPersonas();

}
