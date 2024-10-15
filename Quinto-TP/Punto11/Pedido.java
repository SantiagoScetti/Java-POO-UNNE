package Punto11;

import java.util.ArrayList;

/**
 * Write a description of class Pedido here.
 *
 * @author Santi
 * @version
 */
public class Pedido {

    private ArrayList<Renglon> renglones;

    /**
     * Constructor for objects of class Pedido
     */
    public Pedido(ArrayList<Renglon> p_renglones) {
        this.setRenglones(p_renglones);
    }

    public Pedido(Renglon p_renglon) {
        this.setRenglones(new ArrayList<>());
        this.agregarRenglon(p_renglon);
    }

    //SETTERS
    private void setRenglones(ArrayList<Renglon> p_renglones) {
        this.renglones = p_renglones;
    }

    //GETTERS
    public ArrayList<Renglon> getRenglones() {
        return this.renglones;
    }

    //ADDS
    public boolean agregarRenglon(Renglon p_renglon) {
        return this.getRenglones().add(p_renglon);
    }

    public boolean quitarRenglon(Renglon p_renglon) {
        if (this.getRenglones().size() == 1) {
            return false;
        }
        return this.getRenglones().remove(p_renglon);
    }

    public void mostrar() {
        System.out.println("Pedido:");
        System.out.println("Cantidad de items: " + this.getRenglones().size());
        int contador = 1;
        double totalAPagar = 0;
        int etiquetas = 0;
        for (Renglon unRenglon : this.getRenglones()) {
            System.out.print("Item " + contador + ": ");
            unRenglon.mostrar();
            etiquetas += unRenglon.getCantidad();
            totalAPagar += unRenglon.getImporte();
            contador++;
        }
        System.out.println("--- Total pedido: " + etiquetas + " Etiquetas por un importe total de: $" + totalAPagar);
    }

}
