package Punto5;

import java.util.ArrayList;
import java.util.Calendar;
/**
 * Write a description of class Profesor here.
 * 
 * @author santi
 * @version 1.0
 */
public class Profesor extends Persona{
    private String titulo;
    private ArrayList<Cargo> cargos;

    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo, ArrayList<Cargo> p_cargos, Cargo p_cargo){
        super(p_dni, p_nombre, p_apellido, p_anio);
        setTitulo(p_titulo);
        setCargos(p_cargos);
    }
    public Profesor(int p_dni, String p_nombre, String p_apellido, Calendar p_anio, String p_titulo, ArrayList<Cargo> p_cargos, Cargo p_cargo){
        super(p_dni, p_nombre, p_apellido, p_anio);
        setTitulo(p_titulo);
        setCargos(p_cargos);

    }
    //setters
    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    private void setCargos(ArrayList<Cargo> p_cargos){
        this.cargos = p_cargos;
    }
    //getters
    public String getTitulo(){
        return this.titulo;
    }
    public ArrayList<Cargo> getCargos(){
        return this.cargos;
    }
    public boolean agregarCargo(Cargo p_cargo){
        if (cargos.size() >= 1 && cargos.size() <= 3){
            return this.getCargos().add(p_cargo);
        }else{
            return false;
        }
    }
    public boolean quitarCargo(Cargo p_cargo){
        if (cargos.size() > 1){
            return this.getCargos().remove(p_cargo);
        }else{
            return false;
        }
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Título: " + this.getTitulo());
        
    }
    public void listarCargos(){
        for (Cargo unCargo : this.getCargos()){
            unCargo.mostrarCargo();
        }

    }
    public double sueldoTotal(){
        double total = 0.0;

        for (Cargo unCargo : this.getCargos()){
            total += unCargo.sueldoDelCargo();
        }
        return total;
    }
    public String mostrarLinea(){
        return ("DNI: " + this.getDNI() + "Nombre: " + this.getNombre() + "Sueldo Total: " + this.sueldoTotal());
    }
}