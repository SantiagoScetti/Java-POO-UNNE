package PUNT8;


/**
 * Write a description of class Comercio here.
 * 
 * @author santi
 * @version 1.0
 */
public class Comercio
{
    public static void main(String[] args) {
        // Crear instancias de Cocina, Heladera y Lavarropas
        Cocina cocina = new Cocina("Volcan", 600.0f, 15, 4, 2000, "80*60*60cm");
        Heladera heladera = new Heladera("Gafa", 1200.0f, 8, 11, 2, true);
        
        // Imprimir detalles de la Cocina
        System.out.println("**** Cocina ****");
        cocina.imprimir();
        System.out.println("Cuotas: 6 - Interés: 2.53%");
        float cuotaCocina = cocina.cuotaCredito(6, 2.53f);  
        System.out.println("Valor Cuota: " + cuotaCocina);
        System.out.println("Valor Cuota Con Adicionales: " + cocina.creditoConAdicional(6, 2.53f));
        
        // Imprimir detalles de la Heladera
        System.out.println("\n**** Heladera ****");
        heladera.imprimir();
        System.out.println("Cuotas: 6 - Interés: 2.53%");
        float cuotaHeladera = heladera.cuotaCredito(6, 2.53f);
        System.out.println("Valor Cuota: " + cuotaHeladera);
        System.out.println("Valor Cuota Con Adicionales: " + heladera.creditoConAdicional(6, 2.53f));
    }
}
