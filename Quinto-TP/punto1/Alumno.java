package punto1;

/**
 * TP4 punto 5
 * @author Santiago
 * @version 1.0
 */

 public class Alumno extends Persona
 {
     // Atributos de la clase
     private int lu;
     private String nombre;
     private String apellido;
     private double nota1 = 0;
     private double nota2 = 0;
     
      /**
      * Constructor de la clase {@code Alumno}.
      * 
      * @param p_lu       El número de libreta universitaria del alumno.
      * @param p_apellido El apellido del alumno.
      * @param p_nombre   El nombre del alumno.
      */
     public Alumno(int p_lu, int p_dni, String p_nombre, String p_apellido, int p_anio)
     {
         super(p_dni, p_nombre, p_apellido, p_anio);
         setLu(p_lu);
         
     }
 
     //SETTERS
     private void setLu(int p_lu){
         this.lu = p_lu;
     }
 
     //Getters
     public int getLu(){
         return this.lu;
     }
     public double getNota1(){
        return this.nota1;
     }
     public double getNota2(){
        return this.nota2;
     }
     
     // Métodos de la clase Alumno
 
     /**
      * Establece la primera nota del alumno.
      * 
      * @param p_nota La nota obtenida en la primera evaluación.
      */
     public void setNota1(double p_nota)
     {
        this.nota1 = p_nota;     
     }
 
     /**
      * Establece la segunda nota del alumno.
      * 
      * @param p_nota La nota obtenida en la segunda evaluación.
      */
     public void setNota2(double p_nota)
     {
        this.nota2 = p_nota;     
     }
     
     
     private boolean aprueba(){
           return (this.promedio() > 7 && (this.getNota1() > 6 && this.getNota2() > 6));
     }
 
     private String leyendaAprueba()
     {
         if (this.aprueba()){
             return "APROBADO";
         }
         else{
            return "DESAPROBADO";
         }
         
     }
     
 
     /**
      * Calcula el promedio de las dos notas del alumno.
      * 
      * @return El promedio de las notas.
      */
     public double promedio()
     {
         double promedio = ((this.getNota1() + this.getNota2()) / 2);
         return promedio;
     }
     
 
     /**
      * Muestra la información completa del alumno, incluyendo su nombre, apellido,
      * LU, notas, promedio y si aprueba o no.
      */
     @Override
     public void mostrar()
     {    
         System.out.println("Nombre y Apellido:" + super.nomYApe());
         System.out.println("lu:" + this.getLu() + "Notas: " + this.getNota1() + " - " + this.getNota2());
         System.out.println("Promedio:" + this.promedio() + " " + this.leyendaAprueba());
     }
 }
