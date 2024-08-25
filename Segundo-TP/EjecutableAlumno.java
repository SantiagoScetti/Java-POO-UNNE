/**
 * La clase {@code ejecutableAlumno} contiene el método principal que crea instancias de la clase {@code Alumno}
 * y demuestra cómo utilizar sus métodos.
 * 
 * @author Santiago
 * @version 1.0
 */
public class EjecutableAlumno
{
    public static void main(String[] args) {
        if (args.length != 10) {
            System.out.println("Uso: java EjecutableAlumno <LU1> <Apellido1> <Nombre1> <Nota1_1> <Nota2_1> <LU2> <Apellido2> <Nombre2> <Nota1_2> <Nota2_2>");
            return;
        }
            // Primer alumno
            int lu1 = Integer.parseInt(args[0]);
            String apellido1 = args[1];
            String nombre1 = args[2];
            double nota1_1 = Double.parseDouble(args[3]);
            double nota2_1 = Double.parseDouble(args[4]);

            Alumno alumno1 = new Alumno(lu1, apellido1, nombre1);
            alumno1.setNota1(nota1_1);
            alumno1.setNota2(nota2_1);
            alumno1.mostrar();  // Muestra la información del alumno1

            System.out.println();
            
            // Segundo alumno
            int lu2 = Integer.parseInt(args[5]);
            String apellido2 = args[6];
            String nombre2 = args[7];
            double nota1_2 = Double.parseDouble(args[8]);
            double nota2_2 = Double.parseDouble(args[9]);

            Alumno alumno2 = new Alumno(lu2, apellido2, nombre2);
            alumno2.setNota1(nota1_2);
            alumno2.setNota2(nota2_2);
            alumno2.mostrar();  // Muestra la información del alumno2
    }
}
