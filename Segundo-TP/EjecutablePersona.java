/**
 * La clase {@code EjecutablePersona} contiene el método principal que crea instancias de la clase {@code Persona}
 * y demuestra cómo utilizar sus métodos.
 * 
 * @author Santi
 * @version 1.0
 */
public class EjecutablePersona {
    public static void main(String[] args) {
        // Definiendo constantes para las personas
        int DNI1 = 44280211;
        String NOMBRE1 = "Franco";
        String APELLIDO1 = "Varela";
        int ANIO_NACIMIENTO1 = 1990;

        int DNI2 = 43752065;
        String NOMBRE2 = "Santiago";
        String APELLIDO2 = "Scetti";
        int ANIO_NACIMIENTO2 = 1985;

        // Creación de la primera persona
        Persona p1 = new Persona(DNI1, NOMBRE1, APELLIDO1, ANIO_NACIMIENTO1);
        p1.mostrar();  // Muestra la información de persona1

        System.out.println(); 

        // Creación de la segunda persona
        Persona persona2 = new Persona(DNI2, NOMBRE2, APELLIDO2, ANIO_NACIMIENTO2);
        persona2.mostrar();  // Muestra la información de persona2
    }
}

