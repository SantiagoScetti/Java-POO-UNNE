package Punto11;

import java.util.ArrayList;

public class Ejecutable11 {

    public static void main(String[] args) {
        // Crear etiquetas
        Etiqueta premiumEtiqueta1 = new Premium(200.0, 10); // 10 colores
        Etiqueta comunEtiqueta = new Comun(100.0, 100); // Diseño de $100
        Etiqueta premiumEtiqueta2 = new Premium(200.0, 7); // 7 colores

        // Crear renglones
        Renglon renglon1 = new Renglon(7, premiumEtiqueta1.precio(7), premiumEtiqueta1);
        Renglon renglon2 = new Renglon(57, comunEtiqueta.precio(57), comunEtiqueta);
        Renglon renglon3 = new Renglon(94, premiumEtiqueta2.precio(94), premiumEtiqueta2);

        // Crear pedido con los renglones
        ArrayList<Renglon> listaRenglones = new ArrayList<>();
        listaRenglones.add(renglon1);
        listaRenglones.add(renglon2);
        listaRenglones.add(renglon3);

        Pedido pedido = new Pedido(listaRenglones);

        // Mostrar el pedido
        pedido.mostrar();
    }

}
