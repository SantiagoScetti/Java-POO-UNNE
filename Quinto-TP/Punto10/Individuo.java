package Punto10;

import java.util.Calendar;
import java.util.HashSet;


/**
 * 
 * @author Franco
 * @version 1.0
 */
public class Individuo extends Visitante{
    private Persona persona;

    public Individuo(String p_nombre, Calendar p_fecha, Persona p_persona){
        super(p_nombre, p_fecha);
        this.setPersona(p_persona);
    }

    public Persona getPersona() {
        return this.persona;
    }

    private void setPersona(Persona persona) {
        this.persona = persona;
    }


    //metodosss
    @Override
    public String tipoVisitante(){
        return "Visitante";
    }
   
    @Override
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + persona.getNombre() + "\n" +
        "DNI: " + persona.getDNI() + "Edad: " + persona.edad() + " Años");
    }

    @Override
    public double entrada(){
        return 10;
    }
    
    @Override
    public HashSet<Persona> listarPersonas(){
        HashSet<Persona> listado = new HashSet<>();
        listado.add(this.getPersona());
        return listado;
    }

    @Override
    public void listarPorFecha(Calendar p_fecha, String p_visitante) {
        if(this.getFechaVisita().equals(p_fecha) && this.tipoVisitante().equals(p_visitante)){
                this.mostrar();
        }else{
            System.out.println("No valido");
        }

    }

}
