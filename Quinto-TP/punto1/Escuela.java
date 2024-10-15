package punto1;


/**
 * Ejecutable del Ejercicio 1
 * 
 * @author Santi
 * @version 1.0
 */
public class Escuela
{
    public static void main(String[] args) {
        // Instanciar objetos Persona
        Persona persona1 = new Persona(25365902, "Maria", "Lopez", 1982); // Edad: 41 años
        Persona persona2 = new Persona(27865432, "Juan", "Perez", 1995); // Edad: 28 años

        // Instanciar objetos Alumno
        Alumno alumno1 = new Alumno(2345, 28325402, "Luis", "Gomez", 2004); // Edad: 19 años
        alumno1.setNota1(6.0); // Establecer notas para el alumno1
        alumno1.setNota2(10.0);

        Alumno alumno2 = new Alumno(9876, 30567890, "Ana", "Martinez", 2002); // Edad: 21 años
        alumno2.setNota1(8.0); // Establecer notas para el alumno2
        alumno2.setNota2(7.0);
        
        // Mostrar información de Persona
        System.out.println("Información de Personas:");
        persona1.mostrar();
        persona2.mostrar();

        // Mostrar información de Alumno
        System.out.println("\nInformación de Alumnos:");
        alumno1.mostrar();
        alumno2.mostrar();
    }
}
