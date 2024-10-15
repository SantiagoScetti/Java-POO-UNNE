package Punto10;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

/**
 *
 * @author Santi
 * @version 1.0
 */
public class Zoolgico {

    // instance variables
    private String nombre;
    private ArrayList<Visitante> visitantes;

    /**
     * Constructors
     */
    public Zoolgico(String p_nombre, ArrayList<Visitante> p_visitantes) {
        setNombre(p_nombre);
        setVisitantes(p_visitantes);

    }

    public Zoolgico(String p_nombre, Visitante p_visitante) {
        setNombre(p_nombre);
        setVisitantes(new ArrayList<>());
    }

    public Zoolgico(String p_nombre) {
        setNombre(p_nombre);
        setVisitantes(new ArrayList<>());
    }

    //SETTERS
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setVisitantes(ArrayList<Visitante> p_visitantes) {
        this.visitantes = p_visitantes;
    }

    //GETTERS
    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Visitante> getVisitantes() {
        return this.visitantes;
    }

    //ADDS
    public void nuevoVisitante(Visitante p_visitante) {
        this.getVisitantes().add(p_visitante); // Agregar el visitante a la lista
    }

    public boolean quitarVisitante(Visitante p_visitante) {
        return this.getVisitantes().remove(p_visitante);
    }

    //METODOS
    public void listarTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante) {
        for (Visitante unVisitante : this.getVisitantes()) {
            
            if (unVisitante.tipoVisitante().equalsIgnoreCase(p_tipoVisitante) && unVisitante.getFechaVisita().compareTo(p_fecha) == 0) {
                unVisitante.mostrar();
            }
        }
    }

    public void listarVisitantePorFecha(Calendar p_fecha) {
        for (Visitante unVisitante : this.getVisitantes()) {
            if (unVisitante.getFechaVisita().compareTo(p_fecha) == 0) {
                unVisitante.mostrar();
            }
        }
    }

    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta) {
        double total = 0;
        for (Visitante unVisitante : this.getVisitantes()) {
            if (!unVisitante.getFechaVisita().before(p_fechaDesde) && !unVisitante.getFechaVisita().after(p_fechaHasta)) {
                total += unVisitante.entrada();
            }
        }
        return total;
    }

    public HashSet<Punto10.Persona> listarPersonasQueVisitaronElZoo() {

        HashSet<Punto10.Persona> listado = new HashSet<>();

        // Verifica si la lista de visitantes no es null
        if (this.getVisitantes() != null) {
            for (Visitante unVisitante : this.getVisitantes()) {
                // Agrega el conjunto de personas de cada visitante
                listado.addAll(unVisitante.listarPersonas());
            }
        }
        return listado;
    }
}
