package PUNT8;

import javax.print.DocFlavor.STRING;

/**
 * Write a description of class ArtefactoHogar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public abstract class ArtefactoHogar{
    // instance variables - replace the example below with your own
    private String marca;
    private float precio;
    private int stock;

    /**
     * Constructor for objects of class ArtefactoHogar
     */
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock){
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }

    public String getMarca() {
        return this.marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return this.precio;
    }

    private void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return this.stock;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }
    //metodos 
    public void imprimir(){
    System.out.println("Marca: " + this.getMarca() + " - Precio: " + this.getPrecio() + " - Stock: " + this.getStock());
    }


    public float cuotaCredito(int p_cuotas, float p_interes){
    float interes = this.getPrecio() * (0 + (p_interes / 100));
    float cuotas =  this.getPrecio() / p_cuotas;
    return cuotas + interes;
    }
    
    public abstract float creditoConAdicional(int p_cuotas, float p_interes);
}
