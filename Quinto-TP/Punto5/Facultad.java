package Punto5;

import java.util.ArrayList;

/**
 * Write a description of class Facultad here.
 * 
 * @author Franco
 * @version 1.0
 */
public class Facultad{
 
    private String nombre;
    private ArrayList<Profesor> profesores;

    public Facultad(String p_nombre, ArrayList<Profesor> p_profesores){
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
    }
    public Facultad(String p_nombre, Profesor p_profesor){
        setNombre(p_nombre);
        this.setProfesores(new ArrayList<Profesor>());
        this.agregarProfesor(p_profesor);
    }
   

 //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setProfesores(ArrayList<Profesor> p_profesores){
        this.profesores = p_profesores;
    }
 //getters
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Profesor> getProfesores() {
        return profesores;
    } 

    public void nominaProfesores(){
        
        System.out.println("*********Nomina Facultad: FaCENA*********");
        System.out.println("-----------------------------------------");

        for (Profesor unProfe : profesores){
           unProfe.mostrarLinea();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total a pagar: $" + this.totalAPagar());

         System.out.println("Hay " + this.getProfesores().size() +  " Profesores");

    }
    
    public double totalAPagar(){
        double pago = 0;
        for (Profesor unProfesor : profesores){
            pago+= unProfesor.sueldoTotal();
        }
        return pago;
    }
    public void listarProfesorCargos(){

        System.out.println("-***** Cargos Asignados *****-");
        System.out.println("-----------------------------------------");
        for (Profesor unProfe : this.getProfesores()) {
            unProfe.listarCargos();
        }

        System.out.println("-----------------------------------------");
        System.out.println("Total a pagar: $" + this.totalAPagar());

    }
    
    public boolean agregarProfesor(Profesor p_Profesor){
        return this.getProfesores().add(p_Profesor);
    }

    public boolean quitarProfesor(Profesor p_Profesor){
        if (this.getProfesores().size() > 1) {
            return this.getProfesores().remove(p_Profesor);
        }
        return false;
    }
}
