import java.util.Scanner;

/**
 * Ejecutable del Punto 10
 * 
 * @author Santi y Franco 
 * @version 1.2
 */
public class RegistroCivil {
    private Scanner scanner = new Scanner(System.in);
    private Hombre[] hombres = new Hombre[3];
    private Mujer[] mujeres = new Mujer[3];

    public static void main(String[] args) {
        RegistroCivil registroCivil = new RegistroCivil();
        registroCivil.inicializarPersonas();
        boolean continuar = true;
        
        while (continuar) {
            registroCivil.mostrarMenu();
            int opcion = registroCivil.obtenerOpcion();

            switch (opcion) {
                case 1:
                    registroCivil.crearHombre();
                    break;
                case 2:
                    registroCivil.crearMujer();
                    break;
                case 3:
                    registroCivil.casarse();
                    break;
                case 4:
                    registroCivil.divorciarse();
                    break;
                case 5:
                    registroCivil.mostrarEstadoCivil();
                    break;
                case 6:
                    registroCivil.mostrarRegistro();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        }
    }

    private void inicializarPersonas() {
        for (int i = 0; i < hombres.length; i++) {
            hombres[i] = null;
        }
        for (int i = 0; i < mujeres.length; i++) {
            mujeres[i] = null;
        }
    }

    private void mostrarMenu() {
        System.out.print(" ");
        System.out.println("***** Menú de Registro Civil *****");
        System.out.println("1. Crear Hombre");
        System.out.println("2. Crear Mujer");
        System.out.println("3. Casarse");
        System.out.println("4. Divorciarse");
        System.out.println("5. Mostrar Estado Civil");
        System.out.println("6. Mostrar Registro");
        System.out.println("7. Salir");
        System.out.print("Elija una opción: ");
        System.out.print(" ");
        System.out.print(" ");
    }

    private int obtenerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Introduzca un número.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void crearHombre() {
        for (int i = 0; i < hombres.length; i++) {
            if (hombres[i] == null) {
                System.out.print("Ingrese el nombre del hombre: ");
                String nombre = scanner.next();
                System.out.print("Ingrese el apellido del hombre: ");
                String apellido = scanner.next();
                
                int edad = -1;
                while (edad < 0) {
                    System.out.print("Ingrese la edad del hombre (número positivo): ");
                    if (scanner.hasNextInt()) {
                        edad = scanner.nextInt();
                        if (edad < 0) {
                            System.out.println("La edad debe ser un número positivo. Inténtelo de nuevo.");
                        }
                    } else {
                        System.out.println("Entrada inválida. Debe ingresar un número.");
                        scanner.next(); 
                    }
                }
                
                hombres[i] = new Hombre(nombre, apellido, edad);
                System.out.println("Hombre creado con éxito.");
                return;
            }
        }
        System.out.println("No se pueden crear más hombres.");
    }
    
    private void crearMujer() {
        for (int i = 0; i < mujeres.length; i++) {
            if (mujeres[i] == null) {
                System.out.print("Ingrese el nombre de la mujer: ");
                String nombre = scanner.next();
                System.out.print("Ingrese el apellido de la mujer: ");
                String apellido = scanner.next();
                
                int edad = -1;
                while (edad < 0) {
                    System.out.print("Ingrese la edad de la mujer (número positivo): ");
                    if (scanner.hasNextInt()) {
                        edad = scanner.nextInt();
                        if (edad < 0) {
                            System.out.println("La edad debe ser un número positivo. Inténtelo de nuevo.");
                        }
                    } else {
                        System.out.println("Entrada inválida. Debe ingresar un número.");
                        scanner.next(); 
                    }
                }
                
                mujeres[i] = new Mujer(nombre, apellido, edad);
                System.out.println("Mujer creada con éxito.");
                return;
            }
        }
        System.out.println("No se pueden crear más mujeres.");
    }
    
    private void casarse() {
        mostrarPersonas("Hombres", hombres);
        System.out.print("Seleccione el índice del hombre para casar: ");
        Hombre hombre = seleccionarPersona(hombres);
        
        mostrarPersonas("Mujeres", mujeres);
        System.out.print("Seleccione el índice de la mujer para casar: ");
        Mujer mujer = seleccionarPersona(mujeres);
        
        if (hombre != null && mujer != null) {
            hombre.casarseCon(mujer);
        }
        System.out.print(" ");
    }

    private void divorciarse() {
        System.out.println("Seleccione el tipo de persona para divorciarse:");
        System.out.println("1. Hombre");
        System.out.println("2. Mujer");
        System.out.print("Elija una opción: ");
        int opcion = obtenerOpcion();
    
        if (opcion == 1) {
            mostrarPersonas("Hombres", hombres);
            System.out.print("Seleccione el índice del hombre para divorciar: ");
            int index = obtenerOpcion();
            if (index >= 0 && index < hombres.length && hombres[index] != null) {
                Hombre hombre = hombres[index];
                hombre.divorcio();
            } else {
                System.out.println("Índice inválido.");
            }
        } else if (opcion == 2) {
            mostrarPersonas("Mujeres", mujeres);
            System.out.print("Seleccione el índice de la mujer para divorciar: ");
            int index = obtenerOpcion();
            if (index >= 0 && index < mujeres.length && mujeres[index] != null) {
                Mujer mujer = mujeres[index];
                mujer.divorcio();
            } else {
                System.out.println("Índice inválido.");
            }
        } else {
            System.out.println("Opción inválida. Debe elegir 1 para Hombre o 2 para Mujer.");
        }
        System.out.print(" ");
    }

    private void mostrarEstadoCivil() {
        System.out.println("***** Estado Civil *****");
        mostrarEstadoCivilHombres();
        System.out.print(" ");
        mostrarEstadoCivilMujeres();
        System.out.print(" ");
    }
    
    private void mostrarEstadoCivilHombres() {
        System.out.println("Listado de Hombres:");
        for (int i = 0; i < hombres.length; i++) {
            if (hombres[i] != null) {
                hombres[i].casadoCon(); 
            }
        }
    }
    
    private void mostrarEstadoCivilMujeres() {
        System.out.println("Listado de Mujeres:");
        for (int i = 0; i < mujeres.length; i++) {
            if (mujeres[i] != null) {
                mujeres[i].casadaCon(); 
            }
        }
    }

    private void mostrarRegistro() {
        System.out.println("***** Registro de Personas *****");
        mostrarPersonas("Hombres", hombres);
        mostrarPersonas("Mujeres", mujeres);
    }

    private <T> void mostrarPersonas(String tipo, T[] lista) {
        System.out.println("Listado de " + tipo + ":");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                if (lista[i] instanceof Hombre) {
                    System.out.println(i + ". " + ((Hombre) lista[i]).datos());
                } else if (lista[i] instanceof Mujer) {
                    System.out.println(i + ". " + ((Mujer) lista[i]).datos());
                }
            }
        }
    }

    private <T> T seleccionarPersona(T[] lista) {
        int index = obtenerOpcion();
        if (index >= 0 && index < lista.length && lista[index] != null) {
            return lista[index];
        } else {
            System.out.println("Índice inválido.");
            return null;
        }
    }
}
