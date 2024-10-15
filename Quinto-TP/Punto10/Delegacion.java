package Punto10;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
/**
 * @author Santiago
 * @version 1.0
 */
public class Delegacion extends Visitante
{
    private ArrayList<Individuo> integrantes;
    
    /**
     * Constructor for objects of class Delegacion
     */
    public Delegacion(String p_nombre, Calendar p_fecha,ArrayList<Individuo> p_integrantes )
    {
        super(p_nombre, p_fecha);
        setIntegrantes(p_integrantes); 
    }

    //SETTERS
    private void setIntegrantes(ArrayList<Individuo> p_integrantes) {
        this.integrantes = p_integrantes;
    }
    //GETTERS
    public ArrayList<Individuo> getIntegrantes() {
        return this.integrantes;
    }

    

    @Override
    public String tipoVisitante() {
        return "Delegacion";
    }

    public void inscribirIndividuo(Individuo p_individuo){
        this.getIntegrantes().add(p_individuo);
    }
    public boolean quitarIndividuo(Individuo p_individuo){
        return this.getIntegrantes().remove(p_individuo);
    }

    @Override
    public void mostrar() {
        System.out.println( "\nDelegación: " + this.getNombre() + "\n" +
        "Integrantes: ");
        
        for (Individuo unIntegrante : this.getIntegrantes()) {
            unIntegrante.mostrar();

        }
        System.out.println("Cantidad de integrantes: " +  this.getIntegrantes().size());
    }

    @Override
    public double entrada(){
        double monto = 0;
        
        for (Individuo unIntegrante : this.getIntegrantes()) {
            monto += unIntegrante.entrada();
        }
        
        return monto * 0.90; //10% DE DESCUENTO
    }

    @Override
    public void listarPorFecha(Calendar p_fecha, String p_visitante) {
        
        for (Individuo unIntegrante : this.getIntegrantes()) {
            if(unIntegrante.getFechaVisita().equals(p_fecha)){
                unIntegrante.mostrar();
            }
        }
    }

    
    @Override
    public HashSet<Persona> listarPersonas() {
        
        HashSet<Persona> listado = new HashSet<>();

        for (Individuo unIntegrante : this.getIntegrantes()) {
           listado.add(unIntegrante.getPersona());
        }
        return listado;
    }
}