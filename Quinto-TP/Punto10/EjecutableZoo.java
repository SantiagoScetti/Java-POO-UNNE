package Punto10;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 * @author Santi y Franco
 * @version 1.0
 */
public class EjecutableZoo {

    public static void main(String[] args) {
        // a) Instanciar un zoológico con el nombre “El Caribú”
        Zoolgico zoo = new Zoolgico("El Caribú");

        // b) Instanciar tres individuos que asistieron al zoológico, uno de ellos en forma independiente y los otros dos formando parte de la delegación “PAMI”, el día 22/09/2024
        Calendar fechaVisita = new GregorianCalendar(2024, Calendar.SEPTEMBER, 22);

        Persona persona1 = new Persona(12345678, "Juan", "Pérez", 1985);
        Individuo individuo1 = new Individuo("Juan Pérez", fechaVisita, persona1);

        Persona persona2 = new Persona(23456789, "María", "González", 1990);
        Individuo individuo2 = new Individuo("María González", fechaVisita, persona2);

        Persona persona3 = new Persona(34567890, "Carlos", "López", 1987);
        Individuo individuo3 = new Individuo("Carlos López", fechaVisita, persona3);

        // c) Crear la delegación “PAMI”, que asistió el día indicado, e inscribir a los dos individuos
        ArrayList<Individuo> integrantesPAMI = new ArrayList<>();
        integrantesPAMI.add(individuo2);
        integrantesPAMI.add(individuo3);

        Delegacion pami = new Delegacion("PAMI", fechaVisita, integrantesPAMI);

        // Agregar los visitantes al zoológico
        zoo.nuevoVisitante(individuo1); // individuo independiente
        zoo.nuevoVisitante(pami); // delegación

        // d) Listar todos los visitantes que acudieron al zoológico el día 22/09/2024
        System.out.println("Visitantes el 22/09/2024:");
        zoo.listarVisitantePorFecha(fechaVisita);

        // e) Listar la recaudación del último mes (simulamos que la fecha actual es 01/10/2024)
        Calendar fechaDesde = new GregorianCalendar(2024, Calendar.SEPTEMBER, 1);
        Calendar fechaHasta = new GregorianCalendar(2024, Calendar.OCTOBER, 1);

        System.out.println("\nRecaudación del último mes: $" + zoo.recaudacion(fechaDesde, fechaHasta));

        // f) Listar las delegaciones que acudieron el día 22/09/2024
        System.out.println("\nDelegaciones el 22/09/2024:");
        zoo.listarTipoVisitantePorFecha(fechaVisita, "Delegacion");
    }
}
