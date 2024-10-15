package Punto9;

import java.util.ArrayList;

/**
 * Write a description of class Gerencia here.
 *
 * @author santi
 * @version 1.0
 */
public class Gerencia {

    // instance variables
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados; 

    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_aloamientos) {
        setNombre(p_nombre);
        setAlojamientos(p_aloamientos);
    }
    public Gerencia(String p_nombre, Alojamiento p_aloamiento) {
        setNombre(p_nombre);
        setAlojamientos(new ArrayList<>());
        agregarAlojamiento(p_aloamiento);
    }
    public Gerencia(String p_nombre) {
        setNombre(p_nombre);
        setAlojamientos(new ArrayList<>());
    }
    
    //SETTERS
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setAlojamientos(ArrayList<Alojamiento> p_aloamientos){
        this.alojamientosAlquilados = p_aloamientos;
    }
    //GETTERS
    public String getNombre() {
        return this.nombre;
    }
    public ArrayList<Alojamiento> getAlojamientos(){
        return this.alojamientosAlquilados;
    }

    //ADDS
    public boolean agregarAlojamiento( Alojamiento p_aloamiento){
        return this.getAlojamientos().add(p_aloamiento);
    }
    public boolean quitarAlojamiento(Alojamiento p_aloamiento){
        return this.getAlojamientos().remove(p_aloamiento);
    }

    //METODOS
    public int contarAlojamiento(String tipoAlojamiento) {
        int total = 0;
        for (Alojamiento unAlojamiento : this.getAlojamientos()) {
            total += unAlojamiento.contar(tipoAlojamiento);  // Llamada al método contar de cada alojamiento
        }
        return total;
    }
    // Método para liquidar cada alojamiento alquilado
    public void liquidar() {
        for (Alojamiento unAlojamiento : this.getAlojamientos()) {
        unAlojamiento.liquidar();  // Llamada a liquidar en cada alojamiento
        }
    }

    public void mostrarLiquidacion() {
        System.out.println(" ");
        System.out.println("Gerencia " + this.nombre);
        System.out.println("Liquidación-------------------");
        for (Alojamiento unAlojamiento : this.getAlojamientos()) {
            unAlojamiento.liquidar();  // Mostramos la liquidación de cada alojamiento
        }
        System.out.println("Alojamiento tipo Cabaña ---->" + contarAlojamiento("Cabaña"));
        System.out.println("Alojamiento tipo Hotel ------->" + contarAlojamiento("Hotel"));
    }


}
