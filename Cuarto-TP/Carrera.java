/**
 * Exe del ejercicio Curso
 * 
 * @author Santi y Fran 
 * @version first try 😎
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Carrera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<>();
        HashMap<Integer, Alumno> alumnos = new HashMap<>();

        while (true) {
            System.out.println("\nMenu de opciones:");
            System.out.println("1- Ingresar un curso nuevo");
            System.out.println("2- Ingresar un alumno");
            System.out.println("3- Inscribir alumno a un curso");
            System.out.println("4- Eliminar alumno de un curso");
            System.out.println("5- Mostrar alumnos de un curso");
            System.out.println("6- EXIT");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el nombre del curso: ");
                    scanner.nextLine(); // Consumir salto de línea
                    String nuevoNom = scanner.nextLine();
                    Curso nuevCurso = new Curso(nuevoNom);
                    cursos.add(nuevCurso);
                    break;

                case 2:
                    System.out.println("Ingrese el legajo del alumno: ");
                    int legajo = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea

                    System.out.println("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine();

                    System.out.println("Ingrese el apellido del alumno: ");
                    String apellido = scanner.nextLine();
                    Alumno nuevAlumno = new Alumno(legajo, nombre, apellido);
                    alumnos.put(nuevAlumno.getLu(), nuevAlumno);
                    break;

                case 3:
                    System.out.println("Escriba el legajo del alumno a inscribir");
                    legajo = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea

                    Alumno alumnoElegido = alumnos.get(legajo);

                    if (alumnoElegido != null) {
                        System.out.println("Escriba el nombre del curso al que desea inscribir");
                        String cursoElegido = scanner.nextLine();
                        boolean cursoEncontrado = false;

                        for (Curso unCurso : cursos) {
                            if (cursoElegido.equals(unCurso.getNombre())) {
                                unCurso.inscribirAlumno(alumnoElegido);
                                cursoEncontrado = true;
                                break;
                            }
                        }

                        if (!cursoEncontrado) {
                            System.out.println("Nombre invalidou");
                        }
                    } else {
                        System.out.println("Alumno no encontrado");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el legajo del alumno a eliminar");
                    legajo = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea
                    alumnoElegido = alumnos.get(legajo);

                    if (alumnoElegido != null) {
                        System.out.println("Escriba el nombre del curso del que desea eliminar");
                        String cursoAEliminar = scanner.nextLine();
                        boolean cursoEncontrado = false;

                        for (Curso unCurso : cursos) {
                            if (cursoAEliminar.equals(unCurso.getNombre())) {
                                unCurso.quitarAlumno(alumnoElegido);
                                cursoEncontrado = true;
                                break;
                            }
                        }

                        if (!cursoEncontrado) {
                            System.out.println("Nombre invalidou");
                        }
                    } else {
                        System.out.println("Alumno no encontrado");
                    }
                    break;

                case 5:
                    System.out.println("Escriba el nombre del curso del que desea mostrar los alumnos");
                    scanner.nextLine(); // Consumir salto de línea
                    String cursoMostrar = scanner.nextLine();
                    boolean cursoEncontrado = false;

                    for (Curso unCurso : cursos) {
                        if (cursoMostrar.equals(unCurso.getNombre())) {
                            unCurso.mostrarInscriptos();
                            cursoEncontrado = true;
                            break;
                        }
                    }

                    if (!cursoEncontrado) {
                        System.out.println("Nombre invalidou");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
